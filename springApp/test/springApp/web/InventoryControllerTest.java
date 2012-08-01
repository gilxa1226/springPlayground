/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springApp.web;

import java.util.ArrayList;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;
import springApp.service.SimpleProductManager;
import springApp.domain.Product;
import springApp.repository.InMemoryProductDao;

/**
 *
 * @author haller
 */
public class InventoryControllerTest {
    
    public InventoryControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of handleRequest method, of class InventoryController.
     */
    @Test
    public void testHandleRequest() throws Exception {
        System.out.println("handleRequest");
        
        InventoryController controller = new InventoryController();
        SimpleProductManager spm = new SimpleProductManager();
        spm.setProductDao(new InMemoryProductDao(new ArrayList<Product>()));
        controller.setProductManager(spm);
        ModelAndView modelAndView = controller.handleRequest(null, null);         
        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        
        Map modelMap = (Map)modelAndView.getModel().get("model");
        String nowValue = (String)modelMap.get("now");
        assertNotNull(nowValue);
        
        
    }
}
