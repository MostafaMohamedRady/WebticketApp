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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "vendor-admin")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VendorAdmin.findAll", query = "SELECT v FROM VendorAdmin v"),
    @NamedQuery(name = "VendorAdmin.findByVid", query = "SELECT v FROM VendorAdmin v WHERE v.vid = :vid"),
    @NamedQuery(name = "VendorAdmin.findByName", query = "SELECT v FROM VendorAdmin v WHERE v.name = :name"),
    @NamedQuery(name = "VendorAdmin.findByEmail", query = "SELECT v FROM VendorAdmin v WHERE v.email = :email"),
    @NamedQuery(name = "VendorAdmin.findByPhone1", query = "SELECT v FROM VendorAdmin v WHERE v.phone1 = :phone1"),
    @NamedQuery(name = "VendorAdmin.findByUserName", query = "SELECT v FROM VendorAdmin v WHERE v.userName = :userName"),
    @NamedQuery(name = "VendorAdmin.findByPassword", query = "SELECT v FROM VendorAdmin v WHERE v.password = :password"),
    @NamedQuery(name = "VendorAdmin.findByTag", query = "SELECT v FROM VendorAdmin v WHERE v.tag = :tag")})
public class VendorAdmin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "VID")
    private Integer vid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Name")
    private String name;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 45)
    @Column(name = "Email")
    private String email;
    @Size(max = 11)
    @Column(name = "Phone1")
    private String phone1;
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
    @Size(min = 1, max = 20)
    @Column(name = "tag")
    private String tag;

    public VendorAdmin() {
    }

    public VendorAdmin(Integer vid) {
        this.vid = vid;
    }

    public VendorAdmin(Integer vid, String name, String userName, String password, String tag) {
        this.vid = vid;
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.tag = tag;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
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

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vid != null ? vid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VendorAdmin)) {
            return false;
        }
        VendorAdmin other = (VendorAdmin) object;
        if ((this.vid == null && other.vid != null) || (this.vid != null && !this.vid.equals(other.vid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.webticket.revamp.entity.VendorAdmin[ vid=" + vid + " ]";
    }
    
}
