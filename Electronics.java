/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.electronics;

/**
 *
 * @author Student
 */
public class Electronics {

    public static void main(String[] args) {
        String[] consoles = {"PS5","XBOX","Switch"};
        String[] cities = {"Cape Town","Port Elizabeth","Pretoria"};
        int[][] sales = {{1000,2000,3000},
                         {2000,3000,4000},
                         {1500,1100,1200}};
        
        System.out.println("-----------------------------------------");
        
        System.out.println("               "+consoles[0]+"        "+consoles[1]+"       "+consoles[2]);
        
        System.out.println(cities[0]+"      "+sales[0][0]+"       "+sales[0][1]+"        "+sales[0][2]);
        System.out.println(cities[1]+" "+sales[1][0]+"       "+sales[1][1]+"        "+sales[1][2]);
        System.out.println(cities[2]+"       "+sales[2][0]+"       "+sales[2][1]+"        "+sales[2][2]);
        
        System.out.println("-----------------------------------------");
        
        System.out.println("CONSOLE SALES FOR EACH CITY");
        
        System.out.println("-----------------------------------------");
        
        int capTotal = sales[0][0]+sales[0][1]+sales[0][2];
        int peTotal = sales[1][0]+sales[1][1]+sales[1][2];
        int preTotal = sales[2][0]+sales[2][1]+sales[2][2];
        
        System.out.println(cities[0]+"      "+capTotal);
        System.out.println(cities[1]+" "+peTotal);
        System.out.println(cities[2]+"       "+preTotal);
        
        
        System.out.println("CITY WITH THE MOST SALES: "+cities[1]);
        
        System.out.println("-----------------------------------------");
        
    }
}
