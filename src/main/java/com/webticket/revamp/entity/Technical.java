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
@Table(name = "technical")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Technical.findAll", query = "SELECT t FROM Technical t"),
    @NamedQuery(name = "Technical.findByTechnicalid", query = "SELECT t FROM Technical t WHERE t.technicalid = :technicalid"),
    @NamedQuery(name = "Technical.findByName", query = "SELECT t FROM Technical t WHERE t.name = :name"),
    @NamedQuery(name = "Technical.findByContactPerson", query = "SELECT t FROM Technical t WHERE t.contactPerson = :contactPerson"),
    @NamedQuery(name = "Technical.findByEmail", query = "SELECT t FROM Technical t WHERE t.email = :email"),
    @NamedQuery(name = "Technical.findByCity", query = "SELECT t FROM Technical t WHERE t.city = :city"),
    @NamedQuery(name = "Technical.findByStreet", query = "SELECT t FROM Technical t WHERE t.street = :street"),
    @NamedQuery(name = "Technical.findByUserName", query = "SELECT t FROM Technical t WHERE t.userName = :userName"),
    @NamedQuery(name = "Technical.findByPassword", query = "SELECT t FROM Technical t WHERE t.password = :password"),
    @NamedQuery(name = "Technical.findByPhone1", query = "SELECT t FROM Technical t WHERE t.phone1 = :phone1"),
    @NamedQuery(name = "Technical.findByPhone2", query = "SELECT t FROM Technical t WHERE t.phone2 = :phone2"),
    @NamedQuery(name = "Technical.findByStatus", query = "SELECT t FROM Technical t WHERE t.status = :status"),
    @NamedQuery(name = "Technical.findByVendor", query = "SELECT t FROM Technical t WHERE t.vendor = :vendor")})
public class Technical implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Technical-id")
    private Integer technicalid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Name")
    private String name;
    @Size(max = 45)
    @Column(name = "ContactPerson")
    private String contactPerson;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Email")
    private String email;
    @Size(max = 45)
    @Column(name = "City")
    private String city;
    @Size(max = 45)
    @Column(name = "Street")
    private String street;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "UserName")
    private String userName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "Phone1")
    private String phone1;
    @Size(max = 11)
    @Column(name = "Phone2")
    private String phone2;
    @Size(max = 11)
    @Column(name = "Status")
    private String status;
    @Size(max = 45)
    @Column(name = "Vendor")
    private String vendor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "technicalTechnicalid")
    private List<Maintenance> maintenanceList;

    public Technical() {
    }

    public Technical(Integer technicalid) {
        this.technicalid = technicalid;
    }

    public Technical(Integer technicalid, String name, String email, String userName, String password, String phone1) {
        this.technicalid = technicalid;
        this.name = name;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.phone1 = phone1;
    }

    public Integer getTechnicalid() {
        return technicalid;
    }

    public void setTechnicalid(Integer technicalid) {
        this.technicalid = technicalid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
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
        hash += (technicalid != null ? technicalid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Technical)) {
            return false;
        }
        Technical other = (Technical) object;
        if ((this.technicalid == null && other.technicalid != null) || (this.technicalid != null && !this.technicalid.equals(other.technicalid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.webticket.revamp.entity.Technical[ technicalid=" + technicalid + " ]";
    }
    
}
