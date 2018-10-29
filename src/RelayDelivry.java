public class RelayDelivry implements Delivery {
    private double number;
    public RelayDelivry(double number) {
        this.number = number;
    }

    @Override
    public double getPrice() {
        if(number >=1 && number<=22){
            return 0;
        }else if(number >=23 && number<=47){
            return 2.99;
        }else{
            return 4.99;
        }
    }

    @Override
    public String getInfo() {
        if(number >=1 && number<=22){
            return "Points relais entre les numéros de 1 à 22";
        }else if(number >=23 && number<=47){
            return "Points relais entre les numéros de 23 à 47";
        }else{
            return "Points relais entre avec les numéros superieurs à 47";
        }
    }
}
