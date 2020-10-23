package architecture.service;

import architecture.pojo.Order;
import architecture.pojo.User;

import java.util.List;

public interface OrderService {
    Order getOrderByUser(Long userId);

    List<Order> getAllOrder();

    List<Order> getAllSelfOrder(Long userId);

    int addOrder(Order order);

    int deleteOrder(Order orderId);

    Order displayOrderByOrderId(Long orderId);

    int userAccepted(Order order, User user);
}
