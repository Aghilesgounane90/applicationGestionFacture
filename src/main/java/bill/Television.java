package bill;

import product.Product;

public class Television extends Product {

    public Television(String name, String description, double price, int size, String slabType) {
        super(name, description, price);
        this.size = size;
        this.slabType = slabType;
    }

    int size;
    String slabType;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getSlabType() {
        return slabType;
    }

    public void setSlabType(String slabType) {
        this.slabType = slabType;
    }
}
