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
@Table(name = "rollpaper")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rollpaper.findAll", query = "SELECT r FROM Rollpaper r"),
    @NamedQuery(name = "Rollpaper.findByRollPaperSize", query = "SELECT r FROM Rollpaper r WHERE r.rollPaperSize = :rollPaperSize"),
    @NamedQuery(name = "Rollpaper.findByTotalin", query = "SELECT r FROM Rollpaper r WHERE r.totalin = :totalin")})
public class Rollpaper implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "RollPaperSize")
    private String rollPaperSize;
    @Column(name = "Total-in")
    private Integer totalin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rollpaperRollPaperSize")
    private List<MarchentRollpaper> marchentRollpaperList;
    @JoinColumn(name = "store_store-id", referencedColumnName = "store-id")
    @ManyToOne
    private Store storeStoreId;

    public Rollpaper() {
    }

    public Rollpaper(String rollPaperSize) {
        this.rollPaperSize = rollPaperSize;
    }

    public String getRollPaperSize() {
        return rollPaperSize;
    }

    public void setRollPaperSize(String rollPaperSize) {
        this.rollPaperSize = rollPaperSize;
    }

    public Integer getTotalin() {
        return totalin;
    }

    public void setTotalin(Integer totalin) {
        this.totalin = totalin;
    }

    @XmlTransient
    public List<MarchentRollpaper> getMarchentRollpaperList() {
        return marchentRollpaperList;
    }

    public void setMarchentRollpaperList(List<MarchentRollpaper> marchentRollpaperList) {
        this.marchentRollpaperList = marchentRollpaperList;
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
        hash += (rollPaperSize != null ? rollPaperSize.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rollpaper)) {
            return false;
        }
        Rollpaper other = (Rollpaper) object;
        if ((this.rollPaperSize == null && other.rollPaperSize != null) || (this.rollPaperSize != null && !this.rollPaperSize.equals(other.rollPaperSize))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.webticket.revamp.entity.Rollpaper[ rollPaperSize=" + rollPaperSize + " ]";
    }
    
}
