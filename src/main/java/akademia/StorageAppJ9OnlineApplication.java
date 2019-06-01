package akademia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:dbconfig.properties")
@SpringBootApplication
public class StorageAppJ9OnlineApplication {

    public static void main(String[] args) {
        SpringApplication.run(StorageAppJ9OnlineApplication.class, args);
    }

}
