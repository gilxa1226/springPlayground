package springApp.domain;

import java.io.Serializable;

/**
 * Simple POJO to describe a product
 * @author michael.j.haller
 * @version 1.0
 */
public class Product implements Serializable {
    
    private String _description;
    private Double _price;
    private int _id;

    /**
     * @return the _description
     */
    public String getDescription() {
        return _description;
    }

    /**
     * @param description the _description to set
     */
    public void setDescription(String description) {
        _description = description;
    }

    /**
     * @return the _price
     */
    public Double getPrice() {
        return _price;
    }

    /**
     * @param price the _price to set
     */
    public void setPrice(Double price) {
        _price = price;
    }
    
    public void setId(int i) {
        _id = i;
    }
    
    public int getId() {
        return _id;
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(); 
        
        builder.append("Description: ").append(_description).append(";");
        builder.append("Price: ").append(_price);
        
        return builder.toString();
    }
    

}
