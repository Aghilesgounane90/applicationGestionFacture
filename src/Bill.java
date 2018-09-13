import java.util.HashMap;

public class Bill {
    private Customer customer;
    private HashMap<Product, Integer> products  ;

    void addProduct(Product product, Integer quantity){
        products.put(product,quantity);
    }
    public Customer getCustomer() {
        return customer;
    }

    public HashMap<Product, Integer> getProducts() {
        return products;
    }

    public Bill(Customer customer) {
        this.customer = customer;
    }
}
