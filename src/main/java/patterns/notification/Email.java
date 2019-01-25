package patterns.notification;

import patterns.order.Order;

public class Email implements Observer {

    public void update(Order order) {
        System.out.println("E-mail - Order number: " + order.getOrderNumber() + " changed status to: " + order.getOrderStatus());
    }
}
