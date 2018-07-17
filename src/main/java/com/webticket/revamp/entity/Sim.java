/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webticket.revamp.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mostafa Rady
 */
@Entity
@Table(name = "sim")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sim.findAll", query = "SELECT s FROM Sim s"),
    @NamedQuery(name = "Sim.findBySimSerial", query = "SELECT s FROM Sim s WHERE s.simSerial = :simSerial"),
    @NamedQuery(name = "Sim.findByOperator", query = "SELECT s FROM Sim s WHERE s.operator = :operator"),
    @NamedQuery(name = "Sim.findBySimStatus", query = "SELECT s FROM Sim s WHERE s.simStatus = :simStatus"),
    @NamedQuery(name = "Sim.findBySimCondition", query = "SELECT s FROM Sim s WHERE s.simCondition = :simCondition")})
public class Sim implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "SimSerial")
    private Integer simSerial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "operator")
    private String operator;
    @Size(max = 11)
    @Column(name = "SimStatus")
    private String simStatus;
    @Size(max = 45)
    @Column(name = "SimCondition")
    private String simCondition;
    @JoinColumn(name = "merchant_Merchant-id", referencedColumnName = "Merchant-id")
    @ManyToOne
    private Merchant merchantMerchantid;
    @JoinColumn(name = "store_store-id", referencedColumnName = "store-id")
    @ManyToOne
    private Store storeStoreId;
    @JoinColumn(name = "terminal_Terminal-id", referencedColumnName = "Terminal-id")
    @ManyToOne
    private Terminal terminalTerminalid;

    public Sim() {
    }

    public Sim(Integer simSerial) {
        this.simSerial = simSerial;
    }

    public Sim(Integer simSerial, String operator) {
        this.simSerial = simSerial;
        this.operator = operator;
    }

    public Integer getSimSerial() {
        return simSerial;
    }

    public void setSimSerial(Integer simSerial) {
        this.simSerial = simSerial;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getSimStatus() {
        return simStatus;
    }

    public void setSimStatus(String simStatus) {
        this.simStatus = simStatus;
    }

    public String getSimCondition() {
        return simCondition;
    }

    public void setSimCondition(String simCondition) {
        this.simCondition = simCondition;
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

    public Terminal getTerminalTerminalid() {
        return terminalTerminalid;
    }

    public void setTerminalTerminalid(Terminal terminalTerminalid) {
        this.terminalTerminalid = terminalTerminalid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (simSerial != null ? simSerial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sim)) {
            return false;
        }
        Sim other = (Sim) object;
        if ((this.simSerial == null && other.simSerial != null) || (this.simSerial != null && !this.simSerial.equals(other.simSerial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.webticket.revamp.entity.Sim[ simSerial=" + simSerial + " ]";
    }
    
}
