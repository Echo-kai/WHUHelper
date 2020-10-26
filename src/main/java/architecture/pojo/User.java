package architecture.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.ArrayList;
import java.util.List;
@Data
@Alias("user")
public class User {

    Long id;

    String username;

    String password;

    /*Order acceptedOrder;

    List<Order> selfOrders;


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
        selfOrders.remove(order);
        return order;
    }*/

}
