/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webticket.revamp.service;

import com.webticket.revamp.doa.TerminalRepository;
import com.webticket.revamp.entity.Terminal;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mostafa Rady
 */
@Service
public class TerminalService {
    
    @Autowired
    TerminalRepository terminalRepository;
    
    public List<Terminal> getTerminalByMerchant(Integer id){
        return terminalRepository.findByMerchantMerchantid_Merchantid(id);
    }
    
    public Terminal getTerminalByID(Integer id){
        return terminalRepository.findById(id).get();
    }
    
    public List<Terminal> getAllTerminals(){
        return terminalRepository.findAll();
    }
}
