package architecture;

import java.util.ArrayList;
import java.util.List;

public class User extends Participant {

    Order acceptedOrder;

    List<Order> selfOrders;

    private static OrderManager orderManager = OrderManager.getOrderManager();

    @Override
    Participant getGroup(String name) {
        return new User();
    }

    //注册
    public void register(){

    }
    //设置用户名
    public void setName(String name){

    }
    //获取已发布订单列表
    public List<Order> getAllOrders(){
        return new ArrayList<>();
    }
    //获取自己的订单
    public List<Order> getMyOrders(){
        return new ArrayList<>();
    }
    //创建订单
    public Order addOrder(Order order){
        orderManager.addOrder(this);
        selfOrders.add(order);
        return order;
    }
    //接受订单
    public Order acceptedOrder(Order order){
        acceptedOrder = order;
        return order;
    }
    //删除自己的订单
    public Order deleteOrder(Order order){
        orderManager.deleteOrder(this);
        selfOrders.remove(order);
        return order;
    }

}
