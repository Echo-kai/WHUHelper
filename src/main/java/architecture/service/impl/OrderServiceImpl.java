package architecture.service.impl;

import architecture.dao.OrderDao;
import architecture.pojo.Order;
import architecture.pojo.User;
import architecture.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class OrderServiceImpl implements  OrderService {

    @Autowired
    OrderDao orderDao = null;

    @Override
    public Order getOrderByUser(Long userId) {
        return orderDao.getOrderByUser(userId);
    }

    @Override
    public List<Order> getAllOrder() {
        return orderDao.getAllOrder();
    }

    @Override
    public List<Order> getAllSelfOrder(Long userId) {
        return orderDao.getAllSelfOrder(userId);
    }

    @Override
    public int addOrder(Order order) {
        return orderDao.addOrder(order);
    }

    @Override
    public int deleteOrder(Order orderId) {
        return orderDao.deleteOrder(orderId);
    }

    @Override
    public Order displayOrderByOrderId(Long orderId) {
        return orderDao.displayOrderByOrderId(orderId);
    }

    //门面模式
    @Override
    public int userAccepted(Order order, User user) {
        orderDao.acceptedOrder(order.getId(), user.getId());
        orderDao.updateOrder(order);
        return 0;
    }
}
