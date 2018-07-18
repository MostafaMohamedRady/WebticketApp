/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webticket.revamp.service;

import com.webticket.revamp.doa.MaintenanceRepository;
import com.webticket.revamp.entity.Maintenance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author INTERACTIVE
 */
@Service
public class MaintenanceService {
    
    @Autowired
    MaintenanceRepository repository;
    
    //assign ticket
    public Maintenance addMaintenance(Maintenance maintenance){
        return  repository.save(maintenance);
    }
}
