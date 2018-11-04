public class TakeAwayDelivery implements Delivery {
    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getInfo() {
        return "Retrait gratuit à l'entrepôt dans Paris";
    }
}
