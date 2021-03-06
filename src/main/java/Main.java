
import bill.Bill;
import bill.Fridge;
import bill.Television;
import costumer.Customer;
import exeption.NoProductInBillException;
import product.Product;
import delivery.RelayDelivry;
import writer.FileWriter;

public class Main  {
    public static void main(String[] args) {
        Product cafe = new Product("Philips HD7866/61", "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses", 79.99);
        Television tv = new Television("TV Samsung UE49MU6292", "Smart TV LED incurvée 49\"", 599, 49, "LED");
        Fridge fridge = new Fridge("BEKO TSE 1042 F", "Réfrigérateur BEKO 130L - Classe A+ - blanc", 189, 130, false);

        Customer customer = new Customer("Juste Leblanc", "19 rue Germain Pilon, Paris");
        RelayDelivry delivery = new RelayDelivry(27);
        Bill bill = new Bill(customer, delivery);

        try {
            bill.generate(new FileWriter("facture_leblanc"));
        }catch (NoProductInBillException e){
            System.err.println("Pas de produit dans la facture");
        }
    }
}
