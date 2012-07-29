/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springApp.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author haller
 */
public class ProductTest {
    
    private Product product;
    
    public ProductTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        product = new Product();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setDescription and getDescription method, of class Product.
     */
    @Test
    public void testSetAndGetDescription() {
        System.out.println("getDescription");
        
        String testDescription = "aDescription";
              
        assertNull(product.getDescription());
        product.setDescription(testDescription);
        assertEquals(product.getDescription(), testDescription);
        
    }

    
    /**
     * Test of setPrice and getPrice method, of class Product.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        
        double testPrice = 100.00;
        
        assertEquals(0,0,0);
        product.setPrice(testPrice);
        
        assertEquals(testPrice, product.getPrice(),0);
        
    }


    /**
     * Test of toString method, of class Product.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        
        String testDescription = "aDescription";
        double testPrice = 100.00;
        
        product.setDescription(testDescription);
        product.setPrice(testPrice);
        
        String expResult = "Description: aDescription;Price: 100.0";
        String result = product.toString();
        assertEquals(expResult, result);
        
    }
}
