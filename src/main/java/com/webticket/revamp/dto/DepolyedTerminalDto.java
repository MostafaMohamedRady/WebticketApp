/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webticket.revamp.dto;

/**
 *
 * @author Mostafa Rady
 */
public class DepolyedTerminalDto {
    private int TID, MID, Sim1,Sim2, TerSerial;
    private String Merchant,op1,op2;

    public int getTID() {
        return TID;
    }

    public void setTID(int TID) {
        this.TID = TID;
    }

    public int getMID() {
        return MID;
    }

    public void setMID(int MID) {
        this.MID = MID;
    }

    public int getSim1() {
        return Sim1;
    }

    public void setSim1(int Sim1) {
        this.Sim1 = Sim1;
    }

    public int getSim2() {
        return Sim2;
    }

    public void setSim2(int Sim2) {
        this.Sim2 = Sim2;
    }

    public int getTerSerial() {
        return TerSerial;
    }

    public void setTerSerial(int TerSerial) {
        this.TerSerial = TerSerial;
    }

    public String getMerchant() {
        return Merchant;
    }

    public void setMerchant(String Merchant) {
        this.Merchant = Merchant;
    }

    public String getOp1() {
        return op1;
    }

    public void setOp1(String op1) {
        this.op1 = op1;
    }

    public String getOp2() {
        return op2;
    }

    public void setOp2(String op2) {
        this.op2 = op2;
    }
    
    
}
