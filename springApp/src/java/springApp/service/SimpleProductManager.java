package springApp.service;

import java.util.List;
import springApp.domain.Product;

/**
 *
 * @author michael.j.haller
 * @version 1.0
 */
public class SimpleProductManager implements ProductManager {

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
        _products = products;
    }

}
