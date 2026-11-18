/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10513124;

/**
 *
 * @author Student
 */
public class Product Implements IProduct{
  
    @Override
    public int TotalProductsSold(int[][] sales){
     int total = 0;
     for ( int i = 0; i < sales.length; i++){
    
    for ( int j = 0; j < sales[i].length; j++){   
     total += sales[i][j];
    
    }
    
}
     return total;
    }
@Override 
public double AverageProductSold(int[][] sales){
 int total = TotalProductsSold(sales);
 int counter = sales.length * sales[0].length;
 return (double) total / counter;
}
 
@Override 
public String MostPopularProduct(int[][] sales, String[] products){
int max = sales{[0][0];
int topRow = 0;
 
for ( int i = 0; i < sales.length; i++){
    
    if(sales[i][j] > max){
       max sales[i][j];
       topRow = i;
        
        
    }





}
    
    
    
    
}

return product[topRow] + "("+ max + ")";
