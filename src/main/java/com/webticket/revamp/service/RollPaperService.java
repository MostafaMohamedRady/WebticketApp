/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webticket.revamp.service;

import com.webticket.revamp.doa.RollpaperRepository;
import com.webticket.revamp.entity.Rollpaper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author INTERACTIVE
 */
@Service
public class RollPaperService {
    
    @Autowired
    RollpaperRepository repository;
    
    public List<Rollpaper> getAllRollPaper(){
        return repository.findAll();
    }
}
