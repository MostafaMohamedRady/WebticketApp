/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webticket.revamp.service;

import com.webticket.revamp.doa.StoreRepository;
import com.webticket.revamp.entity.Store;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mostafa Rady
 */
@Service
public class StoreService {

    @Autowired
    StoreRepository storeRepository;

    public List<Store> getAllStore() {
        return storeRepository.findAll();
    }
    
    public Store saveStore(Store store){
        return storeRepository.save(store);
    }
    
    public void deleteStore(Store store){
        storeRepository.delete(store);
    }
    
    public Store getStoreById(Integer id){
        return storeRepository.findById(id).get();
    }
    
    public Store getStoreByStoreName(String storeName){
        return storeRepository.findByStoreNamelike(storeName);
    }
}

