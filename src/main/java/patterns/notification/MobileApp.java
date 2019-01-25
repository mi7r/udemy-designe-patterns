package patterns.notification;

import patterns.order.Order;

public class MobileApp implements Observer {

    public void update(Order order) {
        System.out.println("MobileApp - Order number: " + order.getOrderNumber() + " changed status to: " + order.getOrderStatus());
    }
}
