/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springApp.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author haller
 */
public class HelloController implements Controller {

    protected final Log logger = LogFactory.getLog(getClass()); 

       
    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) 
            throws ServletException, IOException {
        logger.info("Returning hello view"); 

        return new ModelAndView("hello");
    }
    
}
