package architecture.service;

import architecture.pojo.Order;
import architecture.pojo.User;

import java.util.List;

public interface OrderService {
    Order getOrderByUser(Long userId);

    List<Order> getAllOrder();

    List<Order> getAllSelfOrder(Long userId);

    List<Order> getAcceptOrder(Long userId);

    List<Long> getAllAcceptOrders();

    int addOrder(Order order);

    int deleteOrder(Long orderId);

    void updateOrder(Order order);

    Order displayOrderByOrderId(Long orderId);

    int userAccepted(Long orderId, Long userId, Long belongId);

    Long getOrderAccepter(Long orderId);
}
