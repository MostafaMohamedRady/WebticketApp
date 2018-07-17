/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webticket.revamp.entity;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Mostafa Rady
 */
@Entity
@Table(name = "terminal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Terminal.findAll", query = "SELECT t FROM Terminal t"),
    @NamedQuery(name = "Terminal.findByTerminalid", query = "SELECT t FROM Terminal t WHERE t.terminalid = :terminalid"),
    @NamedQuery(name = "Terminal.findByModel", query = "SELECT t FROM Terminal t WHERE t.model = :model"),
    @NamedQuery(name = "Terminal.findBySerialNumber", query = "SELECT t FROM Terminal t WHERE t.serialNumber = :serialNumber"),
    @NamedQuery(name = "Terminal.findByCondition", query = "SELECT t FROM Terminal t WHERE t.condition = :condition"),
    @NamedQuery(name = "Terminal.findByStatus", query = "SELECT t FROM Terminal t WHERE t.status = :status"),
    @NamedQuery(name = "Terminal.findByCurrancy", query = "SELECT t FROM Terminal t WHERE t.currancy = :currancy"),
    @NamedQuery(name = "Terminal.findByMcc", query = "SELECT t FROM Terminal t WHERE t.mcc = :mcc"),
    @NamedQuery(name = "Terminal.findByClass1", query = "SELECT t FROM Terminal t WHERE t.class1 = :class1"),
    @NamedQuery(name = "Terminal.findBySale", query = "SELECT t FROM Terminal t WHERE t.sale = :sale"),
    @NamedQuery(name = "Terminal.findByOnlineReturned", query = "SELECT t FROM Terminal t WHERE t.onlineReturned = :onlineReturned"),
    @NamedQuery(name = "Terminal.findByOffLinereturned", query = "SELECT t FROM Terminal t WHERE t.offLinereturned = :offLinereturned"),
    @NamedQuery(name = "Terminal.findByOfflineSale", query = "SELECT t FROM Terminal t WHERE t.offlineSale = :offlineSale"),
    @NamedQuery(name = "Terminal.findByOnlineVoid", query = "SELECT t FROM Terminal t WHERE t.onlineVoid = :onlineVoid"),
    @NamedQuery(name = "Terminal.findByOffLineVoid", query = "SELECT t FROM Terminal t WHERE t.offLineVoid = :offLineVoid"),
    @NamedQuery(name = "Terminal.findByPreauth", query = "SELECT t FROM Terminal t WHERE t.preauth = :preauth"),
    @NamedQuery(name = "Terminal.findByAmex", query = "SELECT t FROM Terminal t WHERE t.amex = :amex"),
    @NamedQuery(name = "Terminal.findByInstatiment", query = "SELECT t FROM Terminal t WHERE t.instatiment = :instatiment"),
    @NamedQuery(name = "Terminal.findByPrepaidServices", query = "SELECT t FROM Terminal t WHERE t.prepaidServices = :prepaidServices"),
    @NamedQuery(name = "Terminal.findByDiners", query = "SELECT t FROM Terminal t WHERE t.diners = :diners"),
    @NamedQuery(name = "Terminal.findByPremuim", query = "SELECT t FROM Terminal t WHERE t.premuim = :premuim"),
    @NamedQuery(name = "Terminal.findByManualEntry", query = "SELECT t FROM Terminal t WHERE t.manualEntry = :manualEntry")})
public class Terminal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Terminal-id")
    private Integer terminalid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Model")
    private String model;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SerialNumber")
    private int serialNumber;
    @Size(max = 45)
    @Column(name = "Condition")
    private String condition;
    @Size(max = 11)
    @Column(name = "Status")
    private String status;
    @Size(max = 45)
    @Column(name = "Currancy")
    private String currancy;
    @Size(max = 45)
    @Column(name = "MCC")
    private String mcc;
    @Size(max = 45)
    @Column(name = "Class")
    private String class1;
    @Column(name = "Sale")
    private Short sale;
    @Column(name = "OnlineReturned")
    private Short onlineReturned;
    @Column(name = "OffLinereturned")
    private Short offLinereturned;
    @Column(name = "OfflineSale")
    private Short offlineSale;
    @Column(name = "OnlineVoid")
    private Short onlineVoid;
    @Column(name = "OffLineVoid")
    private Short offLineVoid;
    @Column(name = "Preauth")
    private Short preauth;
    @Column(name = "Amex")
    private Short amex;
    @Size(max = 45)
    @Column(name = "instatiment")
    private String instatiment;
    @Column(name = "prepaid Services")
    private Short prepaidServices;
    @Column(name = "Diners")
    private Short diners;
    @Column(name = "Premuim")
    private Short premuim;
    @Column(name = "ManualEntry")
    private Short manualEntry;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "terminalTerminalid")
    private List<Problemassignment> problemassignmentList;
    @OneToMany(mappedBy = "terminalTerminalid")
    private List<Sim> simList;
    @JoinColumn(name = "merchant_Merchant-id", referencedColumnName = "Merchant-id")
    @ManyToOne
    private Merchant merchantMerchantid;
    @JoinColumn(name = "store_store-id", referencedColumnName = "store-id")
    @ManyToOne
    private Store storeStoreId;

    public Terminal() {
    }

    public Terminal(Integer terminalid) {
        this.terminalid = terminalid;
    }

    public Terminal(Integer terminalid, String model, int serialNumber) {
        this.terminalid = terminalid;
        this.model = model;
        this.serialNumber = serialNumber;
    }

    public Integer getTerminalid() {
        return terminalid;
    }

    public void setTerminalid(Integer terminalid) {
        this.terminalid = terminalid;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCurrancy() {
        return currancy;
    }

    public void setCurrancy(String currancy) {
        this.currancy = currancy;
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    public Short getSale() {
        return sale;
    }

    public void setSale(Short sale) {
        this.sale = sale;
    }

    public Short getOnlineReturned() {
        return onlineReturned;
    }

    public void setOnlineReturned(Short onlineReturned) {
        this.onlineReturned = onlineReturned;
    }

    public Short getOffLinereturned() {
        return offLinereturned;
    }

    public void setOffLinereturned(Short offLinereturned) {
        this.offLinereturned = offLinereturned;
    }

    public Short getOfflineSale() {
        return offlineSale;
    }

    public void setOfflineSale(Short offlineSale) {
        this.offlineSale = offlineSale;
    }

    public Short getOnlineVoid() {
        return onlineVoid;
    }

    public void setOnlineVoid(Short onlineVoid) {
        this.onlineVoid = onlineVoid;
    }

    public Short getOffLineVoid() {
        return offLineVoid;
    }

    public void setOffLineVoid(Short offLineVoid) {
        this.offLineVoid = offLineVoid;
    }

    public Short getPreauth() {
        return preauth;
    }

    public void setPreauth(Short preauth) {
        this.preauth = preauth;
    }

    public Short getAmex() {
        return amex;
    }

    public void setAmex(Short amex) {
        this.amex = amex;
    }

    public String getInstatiment() {
        return instatiment;
    }

    public void setInstatiment(String instatiment) {
        this.instatiment = instatiment;
    }

    public Short getPrepaidServices() {
        return prepaidServices;
    }

    public void setPrepaidServices(Short prepaidServices) {
        this.prepaidServices = prepaidServices;
    }

    public Short getDiners() {
        return diners;
    }

    public void setDiners(Short diners) {
        this.diners = diners;
    }

    public Short getPremuim() {
        return premuim;
    }

    public void setPremuim(Short premuim) {
        this.premuim = premuim;
    }

    public Short getManualEntry() {
        return manualEntry;
    }

    public void setManualEntry(Short manualEntry) {
        this.manualEntry = manualEntry;
    }

    @XmlTransient
    public List<Problemassignment> getProblemassignmentList() {
        return problemassignmentList;
    }

    public void setProblemassignmentList(List<Problemassignment> problemassignmentList) {
        this.problemassignmentList = problemassignmentList;
    }

    @XmlTransient
    public List<Sim> getSimList() {
        return simList;
    }

    public void setSimList(List<Sim> simList) {
        this.simList = simList;
    }

    public Merchant getMerchantMerchantid() {
        return merchantMerchantid;
    }

    public void setMerchantMerchantid(Merchant merchantMerchantid) {
        this.merchantMerchantid = merchantMerchantid;
    }

    public Store getStoreStoreId() {
        return storeStoreId;
    }

    public void setStoreStoreId(Store storeStoreId) {
        this.storeStoreId = storeStoreId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (terminalid != null ? terminalid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Terminal)) {
            return false;
        }
        Terminal other = (Terminal) object;
        if ((this.terminalid == null && other.terminalid != null) || (this.terminalid != null && !this.terminalid.equals(other.terminalid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.webticket.revamp.entity.Terminal[ terminalid=" + terminalid + " ]";
    }
    
}
