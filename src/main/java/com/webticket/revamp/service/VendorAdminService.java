/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webticket.revamp.service;

import com.webticket.revamp.doa.VendorAdminRepository;
import com.webticket.revamp.entity.VendorAdmin;
import com.webticket.revamp.util.WebTicketCodes;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Mostafa Rady
 */
@Service
public class VendorAdminService {

    VendorAdminRepository repository;

    @Transactional
    public String login(String userName, String password) throws Exception {
            VendorAdmin vendorAdmin = repository.findByUserNameAndPassword(userName, password);
            if (vendorAdmin.getTag().equals(WebTicketCodes.TAG_ADMIN)) {
                return WebTicketCodes.ADMIN_HOME_PAGE;
            } else if (vendorAdmin.getTag().equals(WebTicketCodes.TAG_TECH)) {
                return WebTicketCodes.TECHNICAL_HOME_PAGE;
            } else {
                throw new Exception(WebTicketCodes.ADMIN_TAG_ERROR);
            }
    }
    
    public String changePassword(VendorAdmin vendorAdmin){
        repository.save(vendorAdmin);
        return WebTicketCodes.ADMIN_HOME_PAGE;
    }
}
