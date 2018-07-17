/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webticket.revamp.service;

import com.webticket.revamp.doa.ProblemassignmentRepository;
import com.webticket.revamp.entity.Problemassignment;
import java.util.List;
import org.eclipse.persistence.jpa.jpql.tools.model.Problem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mostafa Rady
 */
@Service
public class ProblemassignmentSevice {

    @Autowired
    ProblemassignmentRepository repository;

    public List<Problemassignment> getAllTickets() {
        return repository.findAll();
    }
    
    public Problemassignment submitProblem(Problemassignment problemassignment){
        return repository.save( problemassignment);
    }
}
