/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.electronicstore;

/**
 *
 * @author Student
 */
public class ConsoleSales extends Consoles{
    
    ConsoleSales(String deviceType,String storeName,int totalSales){
        super(deviceType,storeName,totalSales);
    }
    
    public void printReport(String deviceType,String storeName,int totalSales){
        System.out.println("CONSOLE TYPE: "+deviceType);
        System.out.println("STORE :"+storeName);
        System.out.println("TOTAL SALES: "+totalSales);
        
    }
}
