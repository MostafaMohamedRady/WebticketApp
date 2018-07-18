/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webticket.revamp.dto;

/**
 *
 * @author INTERACTIVE
 */
public class TotalStoreInfo {
    
    private String storeName;
    private int terminalCount;
    private int simCount;

    public TotalStoreInfo() {
    }

    public TotalStoreInfo(String storeName, int terminalCount, int simCount) {
        this.storeName = storeName;
        this.terminalCount = terminalCount;
        this.simCount = simCount;
    }

    
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public int getTerminalCount() {
        return terminalCount;
    }

    public void setTerminalCount(int terminalCount) {
        this.terminalCount = terminalCount;
    }

    public int getSimCount() {
        return simCount;
    }

    public void setSimCount(int simCount) {
        this.simCount = simCount;
    }
    
    
}
