package patterns;

import patterns.notification.Email;
import patterns.notification.MobileApp;
import patterns.notification.TextMessage;
import patterns.order.Order;
import patterns.order.OrderStatus;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(10L, OrderStatus.REGISTERED);

        TextMessage textMessage = new TextMessage();
        Email email = new Email();
        MobileApp mobileApp = new MobileApp();

        order.registerObserver(textMessage);
        order.registerObserver(mobileApp);
        order.registerObserver(email);

        order.norifyObservers();
        System.out.println("-----------");
        order.changeOrderStatus(OrderStatus.SENT);
        order.unregisterObserver(mobileApp);
        System.out.println("-----------");
        order.norifyObservers();
    }
}
