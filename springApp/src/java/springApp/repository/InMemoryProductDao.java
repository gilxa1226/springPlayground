package springApp.repository;

import java.util.List;
import springApp.domain.Product;

/**
 *
 * @author michael.j.haller
 * @version 1.0
 */
public class InMemoryProductDao implements ProductDao {

    private List<Product> _productList;
    
    public InMemoryProductDao(List<Product> productList) {
        _productList = productList;
    }
    
    @Override
    public List<Product> getProductList() {
        return _productList;
    }

    @Override
    public void saveProduct(Product prod) {
        
    }

}
