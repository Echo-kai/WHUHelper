package architecture.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;
import java.sql.Date;

@Data
@Alias(value = "order")
public class Order {
    //发布者id
    private Long belong;
    //需求id
    private Long id;
    //需求地址
    private String requestAddress;
    //创建时间
    private Date creatTime;
    //需求时间
    private Date requestTime;
    //需求详细描述
    private String description;

}
