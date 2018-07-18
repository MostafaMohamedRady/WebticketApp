/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webticket.revamp.controller;

import com.webticket.revamp.entity.VendorAdmin;
import com.webticket.revamp.service.VendorAdminService;
import com.webticket.revamp.util.WebTicketCodes;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author INTERACTIVE
 */
@Controller
public class LoginController {
    
    @Autowired
    VendorAdminService vendorAdminService;
    
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam("username")String username, @RequestParam("password")String password){
        String page=WebTicketCodes.ERROR_PAGE;
        try {
            page = vendorAdminService.login(username, password); 
            
        } catch (Exception ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return page;
    }

}
