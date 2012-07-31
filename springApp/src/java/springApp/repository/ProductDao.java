
package springApp.repository;

import java.util.List;
import springApp.domain.Product;

/**
 *
 * @author michael.j.haller
 */
public interface ProductDao {
    
    public List<Product> getProductList();
    
    public void saveProduct(Product prod);
    
}
