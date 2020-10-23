package architecture.dao;

import architecture.pojo.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDao {
    Order getOrderByUser(Long userId);

    List<Order> getAllOrder();

    List<Order> getAllSelfOrder(Long userId);

    Order displayOrderByOrderId(Long orderId);

    int addOrder(Order order);

    int deleteOrder(Order orderId);

    int acceptedOrder(Long orderId, Long userId);

    int updateOrder(Order order);
}
