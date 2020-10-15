package architecture;

public class OrderManager {
    private static OrderManager orderManager = new OrderManager();

    private OrderManager(){}

    public static OrderManager getOrderManager(){
        return orderManager;
    }

    //添加Order
    public Order addOrder(User user){
        return new Order();
    }

    //删除订单
    public Order deleteOrder(User user){
        return new Order();
    }
}
