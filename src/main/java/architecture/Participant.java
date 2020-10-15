package architecture;

public abstract class Participant {

    long id;

    String name;

    //模板方法
    int login(String name, String password){
        //查询name是否存在以及所在的用户组，根据用户组以及密码正确与否返回登录状态
        Participant participant = getGroup(name);
        return 0;
    }

    //根据name查询用户组，并返回用户组类型
    //基本方法
    abstract Participant getGroup(String name);


    //模板方法
    Order display(Order order){
        //查看订单详情
        return order;
    }
}
