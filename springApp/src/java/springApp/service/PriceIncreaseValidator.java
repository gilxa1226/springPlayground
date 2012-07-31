package springApp.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 *
 * @author michael.j.haller
 * @version 1.0
 */
public class PriceIncreaseValidator implements Validator {

    private int DEFAULT_MIN_PERCENTAGE = 0;
    private int DEFAULT_MAX_PERCENTAGE = 50;
    private int minPercentage = DEFAULT_MIN_PERCENTAGE;
    private int maxPercentage = DEFAULT_MAX_PERCENTAGE;
    
    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());
    
        
    @Override
    public boolean supports(Class<?> type) {
        return PriceIncrease.class.equals(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
        PriceIncrease pi = (PriceIncrease)o;
        
        if (pi == null) {
            errors.rejectValue("percentage", "error.not-specified", null, "Value required.");
        } else {
            logger.info("Validating with " + pi + ": " + pi.getPercentage());
            if(pi.getPercentage() > getMaxPercentage()) {
                errors.rejectValue("percentage", "error.too-high", new Object[] {new Integer(getMaxPercentage())}, "Value too high.");
            }
            if(pi.getPercentage() < getMinPercentage()) {
                errors.rejectValue("percentage", "error.too-low", new Object[] {new Integer(getMinPercentage())}, "Value too low.");
            }
        }
    }

    /**
     * @return the minPercentage
     */
    public int getMinPercentage() {
        return minPercentage;
    }

    /**
     * @param minPercentage the minPercentage to set
     */
    public void setMinPercentage(int minPercentage) {
        this.minPercentage = minPercentage;
    }

    /**
     * @return the maxPercentage
     */
    public int getMaxPercentage() {
        return maxPercentage;
    }

    /**
     * @param maxPercentage the maxPercentage to set
     */
    public void setMaxPercentage(int maxPercentage) {
        this.maxPercentage = maxPercentage;
    }

    
    
}
