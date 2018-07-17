/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webticket.revamp.service;

import com.webticket.revamp.doa.TechnicalRepository;
import com.webticket.revamp.doa.TerminalRepository;
import com.webticket.revamp.entity.Technical;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mostafa Rady
 */
@Service
public class TechnicalService {
    
    @Autowired
    TechnicalRepository technicalRepository;

    public List<Technical> getAllTechnical(){
        return technicalRepository.findAll();
    }
    
    public Technical saveTechnical(Technical technical){
        return technicalRepository.save(technical);
    }
    
    public void deleteTechnical(Technical technical){
         technicalRepository.delete(technical);
    }
    
    public Technical getTechnicalById(Integer id){
        return technicalRepository.findById(id).get();
    }
    
    public Technical getTechnicalByName(String name){
        return technicalRepository.findByNameLike(name);
    }
}

