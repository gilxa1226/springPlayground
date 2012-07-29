package springApp.service;

import java.io.Serializable;
import java.util.List;
import springApp.domain.Product;

/**
 *
 * @author michael.j.haller
 * @version 1.0
 */
public interface ProductManager extends Serializable {
    
    public void increasePrice(int percentage);
    
    public List<Product> getProducts();
    
}
