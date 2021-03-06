package bill;
import costumer.Customer;
import exeption.NoProductInBillException;
import product.Product;
import delivery.Delivery;
import writer.Writer;

import java.util.HashMap;
import java.util.Map;

public class Bill {
    private Customer customer;
    private Delivery delivery;
    private HashMap<Product, Integer>products= new HashMap<Product, Integer>();

    public void addProduct(Product product, Integer quantity){
        products.put(product,quantity);
    }

    public Customer getCustomer() {
        return customer;
    }
    public HashMap<Product, Integer>getProducts() {
        return products;
    }

    public Bill(Customer customer,Delivery delivery) {
        this.customer= customer;
        this.delivery= delivery;
    }

    /**
     * Generate an output for the current Bill
     * @param writer object in charge of writing
     */
    public void generate(Writer writer) {
        if (products.isEmpty())
            throw new NoProductInBillException();
        writer.start();
        writer.writeLine("HomeShop compagnie");
        writer.writeLine("1 Place Charles de Gaulle, 75008 Paris");
        writer.writeLine("");
        writer.writeLine("Facture à l'attention de : ");
        writer.writeLine(customer.getFullname());
        writer.writeLine(customer.getAddress());
        writer.writeLine("");
        writer.writeLine("Mode de livraison : " + delivery.getInfo());
        writer.writeLine("");
        writer.writeLine("Produits : ");
        writer.writeLine("-----------------------------------------------------");
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product product = entry.getKey();
            Integer quantity = entry.getValue();
            writer.writeLine(product.getName() + " - " + product.getPrice() + " - " + quantity + " unité(s)");
            writer.writeLine(product.getDescription());
            writer.writeLine("");
        }
        writer.writeLine("Livraison : " + delivery.getPrice());
        writer.writeLine("-----------------------------------------------------");
        writer.writeLine("Total : " + this.getTotal());
        writer.stop();
    }

    public float getTotal(){
        float priceFacture = 0;
        for(Map.Entry<Product,Integer>product : products.entrySet()){
            priceFacture+=product.getKey().getPrice()*product.getValue();
        }
        priceFacture += delivery.getPrice();
        return priceFacture;
    }
}

