package delivery;

import delivery.Delivery;

public class ExpressDelivery implements Delivery {
    private String city;
    public ExpressDelivery(String city) {
        this.city = city;
    }
    @Override
    public double getPrice() {
        if(city.equals("Paris")) {
            return 6.99;
        }else{
            return 9.99;
        }
    }
    @Override
    public String getInfo() {
        if(city.equals("Paris")) {
            return "livraison à domicile express, le prix est de 6.99€ à Paris.";
        }else{
            return "livraison à domicile express, En dehors de Paris, c'est 9.99€.";
        }
    }
}
