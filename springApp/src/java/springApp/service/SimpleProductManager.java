package springApp.service;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import springApp.domain.Product;

/**
 *
 * @author michael.j.haller
 * @version 1.0
 */
public class SimpleProductManager implements ProductManager {

    protected final Log logger = LogFactory.getLog(getClass());
    private List<Product> _products;
    
    @Override
    public void increasePrice(int percentage) {
        if ( _products != null ) {
            for (Product product : _products) {
                double newPrice = product.getPrice().doubleValue() *
                        (100 + percentage) / 100;
                product.setPrice(newPrice);
            }
        }
    }

    @Override
    public List<Product> getProducts() {
        return _products;
    }
    
    public void setProducts(List<Product> products)
    {
        logger.info("adding passed product list to SimpleProductManager: " + products.toString());
        _products = products;
    }

}
