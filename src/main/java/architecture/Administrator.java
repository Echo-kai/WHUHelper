package architecture;

import java.util.ArrayList;
import java.util.List;

public class Administrator extends Participant{

    @Override
    Participant getGroup(String name) {
        return new Administrator();
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
