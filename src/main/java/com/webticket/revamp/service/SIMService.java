/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webticket.revamp.service;

import com.webticket.revamp.doa.SIMRepository;
import com.webticket.revamp.entity.Sim;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mostafa Rady
 */
@Service
public class SIMService {
    
    @Autowired
    SIMRepository sIMRepository;
    
    public List<Sim> getAllSim(){
        return sIMRepository.findAll();
    }
    
    public List<Sim> getSimByOperator(String operator){
        return sIMRepository.findByOperatorLike(operator);
    }
    
    public Sim saveSim(Sim sim){
        return sIMRepository.save(sim);
    }
}
