package patterns.notification;

import patterns.order.Order;

public class Email {

    public void updateOrderStatus(Order order) {
        System.out.println("E-mail - Order number: " + order.getOrderNumber() + " changed status to: " + order.getOrderStatus());
    }
}
