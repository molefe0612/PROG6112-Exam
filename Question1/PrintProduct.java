/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10513124;

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class PrintProduct {
    
    public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
    // 1d array for the beds
   String[] products = {"Cozy mornach mattress","Restonic barbados mattress","Sealy phuket mattress"};
   
   
   int[][] sales = new int[3][3];
   
   for ( int i = 0; i < products.length; i++){
    
    for ( int j = 0; j < 3; j++){
    
    
    System.out.println("Enter number of sales for" + (j + 1) + "for" + products[i] + "mattress:");
    
    sales[i][j] = scanner.nextInt();
    
    }
    
    System.out.println();
    
    }
  Product product= Product();
  
  int total = product.TotalProductsSold(sales);
  double average = products.AverageProductsSold(sales);
  String popular = p.MostPopularProduct(sales, product);
   
  System.out.println("Product sales report - 2026" + 
                     "\n Total product sales" +
                      "\n Average products sales"+ 
                       "Most popular product");
   
   
   
   
    }
    
    
    
    
}
