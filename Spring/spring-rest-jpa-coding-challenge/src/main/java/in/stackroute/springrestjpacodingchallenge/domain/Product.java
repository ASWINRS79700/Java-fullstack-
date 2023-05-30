package in.stackroute.springrestjpacodingchallenge.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="Products")
public class Product {
    @Id
    int productId;
    @NotEmpty
    String description;
    public Product(){

    }

    public Product(int productId, String description) {
        this.productId = productId;
        this.description = description;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
