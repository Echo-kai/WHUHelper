package architecture;

import java.util.ArrayList;
import java.util.List;

public class User extends Participant {

    Order acceptedOrder;

    List<Order> selfOrders;

    @Override
    void login() {
        /*验证登录

         */
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
        return order;
    }
    //接受订单
    public Order acceptedOrder(Order order){
        return order;
    }
    //删除自己的订单
    public Order deleteOrder(Order order){
        return order;
    }
}
