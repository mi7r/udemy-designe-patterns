package patterns.notification;

import patterns.order.Order;

public interface Observer {
    void update(Order order);
}
