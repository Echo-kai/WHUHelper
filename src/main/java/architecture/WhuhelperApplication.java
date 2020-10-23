package architecture;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

@SpringBootApplication
@MapperScan(basePackages = "architecture.*",annotationClass = Repository.class)
public class WhuhelperApplication {

    public static void main(String[] args) {
        SpringApplication.run(WhuhelperApplication.class, args);
    }

}
