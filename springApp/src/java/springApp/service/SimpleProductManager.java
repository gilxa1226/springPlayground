package springApp.service;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import springApp.domain.Product;
import springApp.repository.ProductDao;

/**
 *
 * @author michael.j.haller
 * @version 1.0
 */
public class SimpleProductManager implements ProductManager {

    protected final Log logger = LogFactory.getLog(getClass());
    //private List<Product> _products;
    private ProductDao _productDao;
    
    @Override
    public void increasePrice(int percentage) {
        List<Product> products = _productDao.getProductList();
        
        if ( products != null ) {
            for (Product product : products) {
                double newPrice = product.getPrice().doubleValue() *
                        (100 + percentage) / 100;
                product.setPrice(newPrice);
                _productDao.saveProduct(product);
            }
        }
    }

    @Override
    public List<Product> getProducts() {
        return _productDao.getProductList();
    }
    
    public void setProductDao(ProductDao productDao) {
        _productDao = productDao;
    }
    
    /**public void setProducts(List<Product> products)
    {
        logger.info("adding passed product list to SimpleProductManager: " + products.toString());
        _products = products;
    }**/

}
