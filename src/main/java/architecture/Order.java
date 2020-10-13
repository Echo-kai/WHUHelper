package architecture;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.sql.Date;

@Data
public class Order {
    @NotBlank
    User belong;

    @NotBlank
    long id;

    @NotBlank
    String requestAddress;

    @NotBlank
    Date creatTime;

    @NotBlank
    Date requestTime;

    @NotBlank
    String description;

}
