/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.electronicstore;

/**
 *
 * @author Student
 */
public class Consoles {
    private String deviceType;
    private String storeName;
    private int totalSales;
    
    Consoles(String deviceType,String storeName,int totalSales){
        this.deviceType = deviceType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }
    
    public String getConsoleType(){
        return deviceType;
    }
    public String getStore(){
        return storeName;
    }
    public int getTotalSales(){
        return totalSales;
    }
}
