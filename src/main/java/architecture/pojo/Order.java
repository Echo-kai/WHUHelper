package architecture.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@Alias(value = "order")
public class Order {
    //需求id
    private Long id;
    //发布者id
    private Long belong;
    //标题
    private String title;
    //赏金
    private float experience;
    //需求地址
    private String requestAddress;
    //创建时间
    private Date creatTime;
    //需求时间

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date requestTime;
    //需求详细描述
    private String detail;

}
