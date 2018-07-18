/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webticket.revamp.doa;

import com.webticket.revamp.dto.TotalStoreInfo;
import com.webticket.revamp.entity.Store;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Mostafa Rady
 */
public interface StoreRepository extends JpaRepository<Store, Integer>{

    public Store findByStoreNamelike(String storeName);
    
    @Query("select new com.webticket.revamp.dto.TotalStoreInfo(count(s.storeName,s.terminalList),count(s.simList)) from Store s group by s.storeName")
    public List<TotalStoreInfo> findStoreInfo();
    
}
