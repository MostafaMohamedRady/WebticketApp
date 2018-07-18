/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webticket.revamp.doa;

import com.webticket.revamp.entity.Problemassignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Mostafa Rady
 */
public interface ProblemassignmentRepository extends JpaRepository<Problemassignment, Integer>{
    
    @Query("select from Problemassignment p join p.maintenanceList m where m.technicalTechnicalid = :technicalId")
    public Problemassignment findByMaintenanceListTechnicalId(@Param(value = "technicalId") Integer technicalId);
//    public Problemassignment findByMaintenanceList_technicalTechnicalid(Integer)
    
}
