/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springApp.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author haller
 */
public class HelloControllerTest {
    
    public HelloControllerTest() {
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
     * Test of handleRequest method, of class HelloController.
     */
    @Test
    public void testHandleRequest() throws Exception {
        System.out.println("handleRequest");
        HelloController controller = new HelloController();
        ModelAndView modelAndView = controller.handleRequest(null, null);         
        assertEquals("hello", modelAndView.getViewName());
    }
}
