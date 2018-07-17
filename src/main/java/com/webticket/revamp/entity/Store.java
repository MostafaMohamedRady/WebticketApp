/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webticket.revamp.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "store")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Store.findAll", query = "SELECT s FROM Store s"),
    @NamedQuery(name = "Store.findByStoreId", query = "SELECT s FROM Store s WHERE s.storeId = :storeId"),
    @NamedQuery(name = "Store.findByStoreCity", query = "SELECT s FROM Store s WHERE s.storeCity = :storeCity"),
    @NamedQuery(name = "Store.findByStoreStreet", query = "SELECT s FROM Store s WHERE s.storeStreet = :storeStreet"),
    @NamedQuery(name = "Store.findByStatus", query = "SELECT s FROM Store s WHERE s.status = :status"),
    @NamedQuery(name = "Store.findByPhone1", query = "SELECT s FROM Store s WHERE s.phone1 = :phone1"),
    @NamedQuery(name = "Store.findByPhone2", query = "SELECT s FROM Store s WHERE s.phone2 = :phone2"),
    @NamedQuery(name = "Store.findByContactPerson", query = "SELECT s FROM Store s WHERE s.contactPerson = :contactPerson"),
    @NamedQuery(name = "Store.findByStoreName", query = "SELECT s FROM Store s WHERE s.storeName = :storeName")})
public class Store implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "store-id")
    private Integer storeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "store-city")
    private String storeCity;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "store-street")
    private String storeStreet;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "Status")
    private String status;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "Phone1")
    private String phone1;
    @Size(max = 11)
    @Column(name = "Phone 2")
    private String phone2;
    @Size(max = 45)
    @Column(name = "Contact-Person")
    private String contactPerson;
    @Size(max = 45)
    @Column(name = "store-name")
    private String storeName;
    @OneToMany(mappedBy = "storeStoreId")
    private List<Sim> simList;
    @OneToMany(mappedBy = "storeStoreId")
    private List<Terminal> terminalList;
    @OneToMany(mappedBy = "storeStoreId")
    private List<Rollpaper> rollpaperList;

    public Store() {
    }

    public Store(Integer storeId) {
        this.storeId = storeId;
    }

    public Store(Integer storeId, String storeCity, String storeStreet, String status, String phone1) {
        this.storeId = storeId;
        this.storeCity = storeCity;
        this.storeStreet = storeStreet;
        this.status = status;
        this.phone1 = phone1;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreCity() {
        return storeCity;
    }

    public void setStoreCity(String storeCity) {
        this.storeCity = storeCity;
    }

    public String getStoreStreet() {
        return storeStreet;
    }

    public void setStoreStreet(String storeStreet) {
        this.storeStreet = storeStreet;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
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

    @XmlTransient
    public List<Rollpaper> getRollpaperList() {
        return rollpaperList;
    }

    public void setRollpaperList(List<Rollpaper> rollpaperList) {
        this.rollpaperList = rollpaperList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (storeId != null ? storeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Store)) {
            return false;
        }
        Store other = (Store) object;
        if ((this.storeId == null && other.storeId != null) || (this.storeId != null && !this.storeId.equals(other.storeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.webticket.revamp.entity.Store[ storeId=" + storeId + " ]";
    }
    
}
