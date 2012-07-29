/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springApp.service;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import springApp.domain.Product;

/**
 *
 * @author haller
 */
public class SimpleProductManagerTest {
    
    private SimpleProductManager productManager;
    private List<Product> products;
    private static int PRODUCT_COUNT = 2;
    private static Double CHAIR_PRICE = new Double(20.50);
    private static Double TABLE_PRICE = new Double(150.10);
    private static String CHAIR_DESC = "Chair";
    private static String TABLE_DESC = "Table";
    private static int POSITIVE_PRICE_INC = 10;
    
    public SimpleProductManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        productManager = new SimpleProductManager();
        products = new ArrayList<Product>();
        
        // stub up a list of products
        Product product = new Product();
        product.setDescription(CHAIR_DESC);
        product.setPrice(CHAIR_PRICE);
        products.add(product);
        
        product = new Product();
        product.setDescription(TABLE_DESC);
        product.setPrice(TABLE_PRICE);
        products.add(product);
        
        productManager.setProducts(products);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetProductsWithNoProducts() {
        System.out.println("getProductsWithNoProducts");
        
        productManager = new SimpleProductManager();
        assertNull(productManager.getProducts());
    }
    
    /**
     * Test of increasePrice with Null list method, of class SimpleProductManager.
     */
    @Test
    public void testIncreasePriceNullList() {
        System.out.println("increasePriceNullList");
        
        try {
            productManager = new SimpleProductManager();
            productManager.increasePrice(POSITIVE_PRICE_INC);
        } catch (NullPointerException ex) {
            fail("Products list is null.");
        }
        
    }
    
    /**
     * Test of increasePrice with Empty List method, of class SimpleProductManager.
     */
    @Test
    public void testIncreasePriceEmptyList() {
        System.out.println("increasePriceEmpty");

        try {
            productManager = new SimpleProductManager();
            productManager.setProducts(new ArrayList<Product>());
            productManager.increasePrice(POSITIVE_PRICE_INC);
        } catch (Exception ex) {
            fail ("Products list is empty");
        }
    }
    
    /**
     * Test of increasePrice with Populated List method, of class SimpleProductManager.
     */
    @Test
    public void testIncreasePrice() {
        System.out.println("increasePrice");
        
        productManager.increasePrice(POSITIVE_PRICE_INC);
        double expectedChairPriceWithIncrease = 22.55;
        double expectedTablePriceWithIncrease = 165.11;
        
        List<Product> products = productManager.getProducts();
        Product product = products.get(0);
        assertEquals(expectedChairPriceWithIncrease, product.getPrice(), 0);
        product = products.get(1);
        assertEquals(expectedTablePriceWithIncrease, product.getPrice(), 0);
    }

    /**
     * Test of getProducts method, of class SimpleProductManager.
     */
    @Test
    public void testGetProducts() {
        System.out.println("getProducts");
        
        List<Product> products = productManager.getProducts();
        assertNotNull(products);
        assertEquals(PRODUCT_COUNT, productManager.getProducts().size());
        
        Product product = products.get(0);
        assertEquals(CHAIR_DESC, product.getDescription());
        assertEquals(CHAIR_PRICE, product.getPrice());
        
        product = products.get(1);
        assertEquals(TABLE_DESC, product.getDescription());
        assertEquals(TABLE_PRICE, product.getPrice());
        
    }
    
}
