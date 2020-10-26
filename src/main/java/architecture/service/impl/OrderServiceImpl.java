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
        return orderDao.getAllOrders();
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
    public int deleteOrder(Long orderId) {
        return orderDao.deleteOrder(orderId);
    }

    @Override
    public Order displayOrderByOrderId(Long orderId) {
        return orderDao.displayOrderByOrderId(orderId);
    }

    @Override
    public List<Order> getAcceptOrder(Long userId) {
        return orderDao.getAcceptOrder(userId);
    }

    @Override
    public List<Long> getAllAcceptOrders() {
        return orderDao.getAllAcceptOrders();
    }

    @Override
    public void updateOrder(Order order) {
        orderDao.updateOrder(order);
    }

    @Override
    public Long getOrderAccepter(Long orderId) {
        return orderDao.getOrderAccepter(orderId);
    }

    //门面模式
    @Override
    public int userAccepted(Long orderId, Long userId, Long belongId) {
        orderDao.acceptedOrder(orderId, userId, belongId);
        return 0;
    }
}
