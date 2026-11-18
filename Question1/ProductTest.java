/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.st10513124;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class ProductTest {
    
    public ProductTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of TotalProductsSold method, of class Product.
     */
    @Test
    public void testTotalProductsSold() {
        System.out.println("TotalProductsSold");
        int[][] sales = null;
        Product instance = new Product();
        int expResult = 0;
        int result = instance.TotalProductsSold(sales);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AverageProductSold method, of class Product.
     */
    @Test
    public void testAverageProductSold() {
        System.out.println("AverageProductSold");
        int[][] sales = null;
        Product instance = new Product();
        double expResult = 0.0;
        double result = instance.AverageProductSold(sales);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MostPopularProduct method, of class Product.
     */
    @Test
    public void testMostPopularProduct() {
        System.out.println("MostPopularProduct");
        int[][] sales = null;
        String[] products = null;
        Product instance = new Product();
        String expResult = "";
        String result = instance.MostPopularProduct(sales, products);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
