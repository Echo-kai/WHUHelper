package architecture.dao;

import architecture.pojo.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDao {
    Order getOrderByUser(Long userId);

    List<Order> getAllOrders();

    List<Order> getAllSelfOrder(Long userId);

    Order displayOrderByOrderId(Long orderId);

    int addOrder(Order order);

    int deleteOrder(Long orderId);

    List<Order> getAcceptOrder(Long userId);

    List<Long> getAllAcceptOrders();

    int acceptedOrder(Long orderId, Long userId, Long belongId);

    void updateOrder(Order order);

    Long getOrderAccepter(Long orderId);
}
