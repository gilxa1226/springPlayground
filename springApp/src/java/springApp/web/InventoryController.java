/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springApp.web;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import springApp.service.ProductManager;

/**
 *
 * @author haller
 */
public class InventoryController implements Controller {

    protected final Log logger = LogFactory.getLog(getClass()); 
    private ProductManager productManager;

       
    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) 
            throws ServletException, IOException {
        
        Map<String, Object> myModel = new HashMap<String, Object>();
        String now = (new Date()).toString();
        logger.info("Returning hello view with " + now);
        
        myModel.put("now", now);
        logger.info("Returning hello view with " + productManager.toString());
        myModel.put("products", productManager.getProducts());
        
        return new ModelAndView("hello", "model", myModel);
    }
    
    public void setProductManager(ProductManager productManager) {
        logger.info("adding passed productManager to InventoryController");
        this.productManager = productManager;
    }
    
}
