/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webticket.revamp.doa;

import com.webticket.revamp.entity.Rollpaper;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Mostafa Rady
 */
public interface RollpaperRepository extends JpaRepository<Rollpaper, Integer>{
    
}