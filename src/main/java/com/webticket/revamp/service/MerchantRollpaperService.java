/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webticket.revamp.service;

import com.webticket.revamp.doa.MarchentRollpaperRepository;
import com.webticket.revamp.entity.MarchentRollpaper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mostafa Rady
 */
@Service
public class MerchantRollpaperService {
    
    @Autowired
    MarchentRollpaperRepository repository;
    
    public void assignRollToMarchent(MarchentRollpaper marchentRollpaper){
        MarchentRollpaper marchentRollpaper_ = repository.save(marchentRollpaper);
    }
}
