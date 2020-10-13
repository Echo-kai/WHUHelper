package architecture;

import java.util.ArrayList;
import java.util.List;

public class Administrator extends Participant{

    @Override
    void login() {
        /*验证登录

         */
    }
    //获取所有订单
    public List<Order> searchOrders(){
        return new ArrayList<>();
    }
    //删除订单
    public Order deleteOrders(Order order){
        return order;
    }
}
