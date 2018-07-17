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
@Table(name = "merchant")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Merchant.findAll", query = "SELECT m FROM Merchant m"),
    @NamedQuery(name = "Merchant.findByMerchantid", query = "SELECT m FROM Merchant m WHERE m.merchantid = :merchantid"),
    @NamedQuery(name = "Merchant.findByMerchantName", query = "SELECT m FROM Merchant m WHERE m.merchantName = :merchantName"),
    @NamedQuery(name = "Merchant.findByEmail", query = "SELECT m FROM Merchant m WHERE m.email = :email"),
    @NamedQuery(name = "Merchant.findByMcc", query = "SELECT m FROM Merchant m WHERE m.mcc = :mcc"),
    @NamedQuery(name = "Merchant.findByStatus", query = "SELECT m FROM Merchant m WHERE m.status = :status"),
    @NamedQuery(name = "Merchant.findByCity", query = "SELECT m FROM Merchant m WHERE m.city = :city"),
    @NamedQuery(name = "Merchant.findByStreet", query = "SELECT m FROM Merchant m WHERE m.street = :street"),
    @NamedQuery(name = "Merchant.findByPhone1", query = "SELECT m FROM Merchant m WHERE m.phone1 = :phone1"),
    @NamedQuery(name = "Merchant.findByPhone2", query = "SELECT m FROM Merchant m WHERE m.phone2 = :phone2"),
    @NamedQuery(name = "Merchant.findByCurrancy", query = "SELECT m FROM Merchant m WHERE m.currancy = :currancy"),
    @NamedQuery(name = "Merchant.findByVendor", query = "SELECT m FROM Merchant m WHERE m.vendor = :vendor"),
    @NamedQuery(name = "Merchant.findByContactPerson", query = "SELECT m FROM Merchant m WHERE m.contactPerson = :contactPerson"),
    @NamedQuery(name = "Merchant.findByAMexMerchantID", query = "SELECT m FROM Merchant m WHERE m.aMexMerchantID = :aMexMerchantID"),
    @NamedQuery(name = "Merchant.findByPremiumID", query = "SELECT m FROM Merchant m WHERE m.premiumID = :premiumID")})
public class Merchant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Merchant-id")
    private Integer merchantid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "MerchantName")
    private String merchantName;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Email")
    private String email;
    @Column(name = "MCC")
    private Integer mcc;
    @Size(max = 11)
    @Column(name = "Status")
    private String status;
    @Size(max = 45)
    @Column(name = "City")
    private String city;
    @Size(max = 45)
    @Column(name = "Street")
    private String street;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "Phone1")
    private String phone1;
    @Size(max = 11)
    @Column(name = "Phone 2")
    private String phone2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Currancy")
    private String currancy;
    @Size(max = 45)
    @Column(name = "Vendor")
    private String vendor;
    @Size(max = 45)
    @Column(name = "ContactPerson")
    private String contactPerson;
    @Column(name = "AMex MerchantID")
    private Integer aMexMerchantID;
    @Column(name = "PremiumID")
    private Integer premiumID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "merchantMerchantid")
    private List<MarchentRollpaper> marchentRollpaperList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "merchantMerchantid")
    private List<Problemassignment> problemassignmentList;
    @OneToMany(mappedBy = "merchantMerchantid")
    private List<Sim> simList;
    @OneToMany(mappedBy = "merchantMerchantid")
    private List<Terminal> terminalList;

    public Merchant() {
    }

    public Merchant(Integer merchantid) {
        this.merchantid = merchantid;
    }

    public Merchant(Integer merchantid, String merchantName, String email, String phone1, String currancy) {
        this.merchantid = merchantid;
        this.merchantName = merchantName;
        this.email = email;
        this.phone1 = phone1;
        this.currancy = currancy;
    }

    public Integer getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(Integer merchantid) {
        this.merchantid = merchantid;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getMcc() {
        return mcc;
    }

    public void setMcc(Integer mcc) {
        this.mcc = mcc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getCurrancy() {
        return currancy;
    }

    public void setCurrancy(String currancy) {
        this.currancy = currancy;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public Integer getAMexMerchantID() {
        return aMexMerchantID;
    }

    public void setAMexMerchantID(Integer aMexMerchantID) {
        this.aMexMerchantID = aMexMerchantID;
    }

    public Integer getPremiumID() {
        return premiumID;
    }

    public void setPremiumID(Integer premiumID) {
        this.premiumID = premiumID;
    }

    @XmlTransient
    public List<MarchentRollpaper> getMarchentRollpaperList() {
        return marchentRollpaperList;
    }

    public void setMarchentRollpaperList(List<MarchentRollpaper> marchentRollpaperList) {
        this.marchentRollpaperList = marchentRollpaperList;
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

    @XmlTransient
    public List<Terminal> getTerminalList() {
        return terminalList;
    }

    public void setTerminalList(List<Terminal> terminalList) {
        this.terminalList = terminalList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (merchantid != null ? merchantid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Merchant)) {
            return false;
        }
        Merchant other = (Merchant) object;
        if ((this.merchantid == null && other.merchantid != null) || (this.merchantid != null && !this.merchantid.equals(other.merchantid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.webticket.revamp.entity.Merchant[ merchantid=" + merchantid + " ]";
    }
    
}
