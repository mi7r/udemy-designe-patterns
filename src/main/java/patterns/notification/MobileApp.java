package patterns.notification;

import patterns.order.Order;

public class MobileApp {

    public void updateOrderStatus(Order order) {
        System.out.println("MobileApp - Order number: " + order.getOrderNumber() + " changed status to: " + order.getOrderStatus());
    }
}
