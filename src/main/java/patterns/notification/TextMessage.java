package patterns.notification;

import patterns.order.Order;

public class TextMessage {
    public void updateOrderStatus(Order order) {
        System.out.println("SMS - Order number: " + order.getOrderNumber() + " changed status to: " + order.getOrderStatus());
    }
}
