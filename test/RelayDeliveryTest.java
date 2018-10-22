import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RelayDeliveryTest {

    @Test
    public void Given_FreeRelay_whenGettingDelivryPrice_ThenGet0(){
        Delivery delivry = new RelayDelivry(10);
        Assertions.assertEquals(0.0, delivry.getPrice(),0.01);
    }

    @Test
    public void Given_LowPraceRelay_whenGettingDelivryPrice_ThenGet2e99(){
        Delivery delivry = new RelayDelivry(27);
        Assertions.assertEquals(2.99, delivry.getPrice(), 0.01);
    }

    @Test
    public void Given_HightPraceRelay_whenGettingDelivryPrice_ThenGet4e99(){
        Delivery delivry = new RelayDelivry(50);
        Assertions.assertEquals(4.99, delivry.getPrice(), 0.01);
    }
}
