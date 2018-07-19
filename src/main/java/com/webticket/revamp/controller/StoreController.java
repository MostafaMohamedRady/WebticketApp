/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webticket.revamp.controller;

import com.webticket.revamp.dto.TotalStoreInfo;
import com.webticket.revamp.service.StoreService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author INTERACTIVE
 */
@Controller(value = "/store")
public class StoreController {
    
    @Autowired
    private StoreService storeService;
    
    @RequestMapping(value = "/getTotalStoreInfo" ,method = RequestMethod.GET)
    public List<TotalStoreInfo> getTotalStoreInfo(){
        return storeService.getTotalStoreInfo();
    }
    
}
