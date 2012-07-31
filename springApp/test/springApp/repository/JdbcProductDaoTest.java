/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springApp.repository;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;
import springApp.domain.Product;

/**
 *
 * @author michael.j.haller
 */
public class JdbcProductDaoTest extends AbstractTransactionalDataSourceSpringContextTests {
    
    private ProductDao productDao;
    
    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }
    
    @Override
    protected String[] getConfigLocations() {
        return new String[] {"classpath:test-context.xml"};
    }
    
    @Override
    protected void onSetUpInTransaction() throws Exception {
        super.deleteFromTables(new String[] {"products"});
        super.executeSqlScript("classpath:load_data.sql", true);
    } 

     
    
    
    public JdbcProductDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getProductList method, of class JdbcProductDao.
     */
    @Test
    public void testGetProductList() {        
        System.out.println("testGetProductList");
        
        List<Product> products = productDao.getProductList();        
        assertEquals("wrong number of products?", 3, products.size());        
    }    

    @Test
    public void testSaveProduct() {        
        System.out.println("testSaveProduct");
        
        List<Product> products = productDao.getProductList();        
        for (Product p : products) {
            p.setPrice(200.12);
            productDao.saveProduct(p);
        }        

        List<Product> updatedProducts = productDao.getProductList();
        for (Product p : updatedProducts) {
            assertEquals("wrong price of product?", 200.12, p.getPrice());
        } 
    }
}
