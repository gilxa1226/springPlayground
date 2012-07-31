package springApp.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author michael.j.haller
 * @version 1.0
 */
public class PriceIncrease {
    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());
    
    private int percentage;
    
    public void setPercentage(int i) {
        percentage = i;
        logger.info("Percentage set to " + i);
    }
    
    public int getPercentage() {
        return percentage;
    }
}
