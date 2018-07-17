/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webticket.revamp.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Mostafa Rady
 */
@Entity
@Table(name = "problemassignment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Problemassignment.findAll", query = "SELECT p FROM Problemassignment p"),
    @NamedQuery(name = "Problemassignment.findByProblemid", query = "SELECT p FROM Problemassignment p WHERE p.problemid = :problemid"),
    @NamedQuery(name = "Problemassignment.findByProblemDate", query = "SELECT p FROM Problemassignment p WHERE p.problemDate = :problemDate"),
    @NamedQuery(name = "Problemassignment.findByProblemDetails", query = "SELECT p FROM Problemassignment p WHERE p.problemDetails = :problemDetails")})
public class Problemassignment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Problem-id")
    private Integer problemid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Problem-Date")
    @Temporal(TemporalType.DATE)
    private Date problemDate;
    @Size(max = 45)
    @Column(name = "Problem-Details")
    private String problemDetails;
    @JoinColumn(name = "merchant_Merchant-id", referencedColumnName = "Merchant-id")
    @ManyToOne(optional = false)
    private Merchant merchantMerchantid;
    @JoinColumn(name = "terminal_Terminal-id", referencedColumnName = "Terminal-id")
    @ManyToOne(optional = false)
    private Terminal terminalTerminalid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "problemassignmentProblemid")
    private List<Maintenance> maintenanceList;

    public Problemassignment() {
    }

    public Problemassignment(Integer problemid) {
        this.problemid = problemid;
    }

    public Problemassignment(Integer problemid, Date problemDate) {
        this.problemid = problemid;
        this.problemDate = problemDate;
    }

    public Integer getProblemid() {
        return problemid;
    }

    public void setProblemid(Integer problemid) {
        this.problemid = problemid;
    }

    public Date getProblemDate() {
        return problemDate;
    }

    public void setProblemDate(Date problemDate) {
        this.problemDate = problemDate;
    }

    public String getProblemDetails() {
        return problemDetails;
    }

    public void setProblemDetails(String problemDetails) {
        this.problemDetails = problemDetails;
    }

    public Merchant getMerchantMerchantid() {
        return merchantMerchantid;
    }

    public void setMerchantMerchantid(Merchant merchantMerchantid) {
        this.merchantMerchantid = merchantMerchantid;
    }

    public Terminal getTerminalTerminalid() {
        return terminalTerminalid;
    }

    public void setTerminalTerminalid(Terminal terminalTerminalid) {
        this.terminalTerminalid = terminalTerminalid;
    }

    @XmlTransient
    public List<Maintenance> getMaintenanceList() {
        return maintenanceList;
    }

    public void setMaintenanceList(List<Maintenance> maintenanceList) {
        this.maintenanceList = maintenanceList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (problemid != null ? problemid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Problemassignment)) {
            return false;
        }
        Problemassignment other = (Problemassignment) object;
        if ((this.problemid == null && other.problemid != null) || (this.problemid != null && !this.problemid.equals(other.problemid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.webticket.revamp.entity.Problemassignment[ problemid=" + problemid + " ]";
    }
    
}
