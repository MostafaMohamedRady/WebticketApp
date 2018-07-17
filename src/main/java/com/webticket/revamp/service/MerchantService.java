/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webticket.revamp.service;

import com.webticket.revamp.doa.MerchantRepository;
import com.webticket.revamp.entity.Merchant;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mostafa Rady
 */
@Service
public class MerchantService {
    
    @Autowired
    MerchantRepository merchantRepository;
    
    public List<Merchant> getAllMerchant(){
        return merchantRepository.findAll();
    }
    
    public Merchant addMerchant(Merchant merchant){
        return merchantRepository.save(merchant);
    }
    
    public void deleteMerchant(Merchant merchant){
        merchantRepository.delete(merchant);
    }
    
    public Merchant getMerchantById(Integer id){
        return merchantRepository.findById(id).get();
    }
    
    public Merchant getByMerchantName(String name){
       return merchantRepository.findByMerchantNameLike(name);
    }
}
