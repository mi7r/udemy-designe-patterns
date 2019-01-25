package patterns.notification;

import patterns.order.Order;

public class TextMessage implements Observer {
    public void update(Order order) {
        System.out.println("SMS - Order number: " + order.getOrderNumber() + " changed status to: " + order.getOrderStatus());
    }
}
