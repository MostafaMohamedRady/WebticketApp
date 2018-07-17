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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mostafa Rady
 */
@Entity
@Table(name = "marchent_rollpaper")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MarchentRollpaper.findAll", query = "SELECT m FROM MarchentRollpaper m"),
    @NamedQuery(name = "MarchentRollpaper.findByRollPaperDefault", query = "SELECT m FROM MarchentRollpaper m WHERE m.rollPaperDefault = :rollPaperDefault"),
    @NamedQuery(name = "MarchentRollpaper.findByRollPaperOut", query = "SELECT m FROM MarchentRollpaper m WHERE m.rollPaperOut = :rollPaperOut"),
    @NamedQuery(name = "MarchentRollpaper.findByMarchentRollpapercolId", query = "SELECT m FROM MarchentRollpaper m WHERE m.marchentRollpapercolId = :marchentRollpapercolId")})
public class MarchentRollpaper implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "RollPaper-Default")
    private Integer rollPaperDefault;
    @Column(name = "RollPaper-Out")
    private Integer rollPaperOut;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "marchent_rollpapercol_id")
    private Integer marchentRollpapercolId;
    @JoinColumn(name = "merchant_Merchant-id", referencedColumnName = "Merchant-id")
    @ManyToOne(optional = false)
    private Merchant merchantMerchantid;
    @JoinColumn(name = "rollpaper_RollPaperSize", referencedColumnName = "RollPaperSize")
    @ManyToOne(optional = false)
    private Rollpaper rollpaperRollPaperSize;

    public MarchentRollpaper() {
    }

    public MarchentRollpaper(Integer marchentRollpapercolId) {
        this.marchentRollpapercolId = marchentRollpapercolId;
    }

    public Integer getRollPaperDefault() {
        return rollPaperDefault;
    }

    public void setRollPaperDefault(Integer rollPaperDefault) {
        this.rollPaperDefault = rollPaperDefault;
    }

    public Integer getRollPaperOut() {
        return rollPaperOut;
    }

    public void setRollPaperOut(Integer rollPaperOut) {
        this.rollPaperOut = rollPaperOut;
    }

    public Integer getMarchentRollpapercolId() {
        return marchentRollpapercolId;
    }

    public void setMarchentRollpapercolId(Integer marchentRollpapercolId) {
        this.marchentRollpapercolId = marchentRollpapercolId;
    }

    public Merchant getMerchantMerchantid() {
        return merchantMerchantid;
    }

    public void setMerchantMerchantid(Merchant merchantMerchantid) {
        this.merchantMerchantid = merchantMerchantid;
    }

    public Rollpaper getRollpaperRollPaperSize() {
        return rollpaperRollPaperSize;
    }

    public void setRollpaperRollPaperSize(Rollpaper rollpaperRollPaperSize) {
        this.rollpaperRollPaperSize = rollpaperRollPaperSize;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (marchentRollpapercolId != null ? marchentRollpapercolId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MarchentRollpaper)) {
            return false;
        }
        MarchentRollpaper other = (MarchentRollpaper) object;
        if ((this.marchentRollpapercolId == null && other.marchentRollpapercolId != null) || (this.marchentRollpapercolId != null && !this.marchentRollpapercolId.equals(other.marchentRollpapercolId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.webticket.revamp.entity.MarchentRollpaper[ marchentRollpapercolId=" + marchentRollpapercolId + " ]";
    }
    
}
