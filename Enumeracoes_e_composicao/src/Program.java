import Order;
import java.util.Date;

public class Program {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Order order = new Order(1800, new Date(), OrderStatus.PENDING_PAYMENT);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

    }

}