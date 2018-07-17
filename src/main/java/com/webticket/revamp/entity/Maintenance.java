/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webticket.revamp.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mostafa Rady
 */
@Entity
@Table(name = "maintenance")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Maintenance.findAll", query = "SELECT m FROM Maintenance m"),
    @NamedQuery(name = "Maintenance.findByMaintenanceid", query = "SELECT m FROM Maintenance m WHERE m.maintenanceid = :maintenanceid"),
    @NamedQuery(name = "Maintenance.findBySubmittedDate", query = "SELECT m FROM Maintenance m WHERE m.submittedDate = :submittedDate"),
    @NamedQuery(name = "Maintenance.findBySolution", query = "SELECT m FROM Maintenance m WHERE m.solution = :solution"),
    @NamedQuery(name = "Maintenance.findByStatus", query = "SELECT m FROM Maintenance m WHERE m.status = :status"),
    @NamedQuery(name = "Maintenance.findByMaintainDate", query = "SELECT m FROM Maintenance m WHERE m.maintainDate = :maintainDate"),
    @NamedQuery(name = "Maintenance.findByNotes", query = "SELECT m FROM Maintenance m WHERE m.notes = :notes")})
public class Maintenance implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Maintenance-id")
    private Integer maintenanceid;
    @Column(name = "SubmittedDate")
    @Temporal(TemporalType.DATE)
    private Date submittedDate;
    @Size(max = 45)
    @Column(name = "Solution")
    private String solution;
    @Size(max = 11)
    @Column(name = "Status")
    private String status;
    @Column(name = "MaintainDate")
    @Temporal(TemporalType.DATE)
    private Date maintainDate;
    @Size(max = 45)
    @Column(name = "Notes")
    private String notes;
    @JoinColumn(name = "problemassignment_Problem-id", referencedColumnName = "Problem-id")
    @ManyToOne(optional = false)
    private Problemassignment problemassignmentProblemid;
    @JoinColumn(name = "technical_Technical-id", referencedColumnName = "Technical-id")
    @ManyToOne(optional = false)
    private Technical technicalTechnicalid;

    public Maintenance() {
    }

    public Maintenance(Integer maintenanceid) {
        this.maintenanceid = maintenanceid;
    }

    public Integer getMaintenanceid() {
        return maintenanceid;
    }

    public void setMaintenanceid(Integer maintenanceid) {
        this.maintenanceid = maintenanceid;
    }

    public Date getSubmittedDate() {
        return submittedDate;
    }

    public void setSubmittedDate(Date submittedDate) {
        this.submittedDate = submittedDate;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getMaintainDate() {
        return maintainDate;
    }

    public void setMaintainDate(Date maintainDate) {
        this.maintainDate = maintainDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Problemassignment getProblemassignmentProblemid() {
        return problemassignmentProblemid;
    }

    public void setProblemassignmentProblemid(Problemassignment problemassignmentProblemid) {
        this.problemassignmentProblemid = problemassignmentProblemid;
    }

    public Technical getTechnicalTechnicalid() {
        return technicalTechnicalid;
    }

    public void setTechnicalTechnicalid(Technical technicalTechnicalid) {
        this.technicalTechnicalid = technicalTechnicalid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maintenanceid != null ? maintenanceid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Maintenance)) {
            return false;
        }
        Maintenance other = (Maintenance) object;
        if ((this.maintenanceid == null && other.maintenanceid != null) || (this.maintenanceid != null && !this.maintenanceid.equals(other.maintenanceid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.webticket.revamp.entity.Maintenance[ maintenanceid=" + maintenanceid + " ]";
    }
    
}
