package akademia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@PropertySources({
        @PropertySource(value = "classpath:dbconfig.properties", ignoreResourceNotFound = true),
        @PropertySource(value = "classpath:config.properties")
     }
)
@SpringBootApplication
public class StorageAppJ9OnlineApplication {

    public static void main(String[] args) {
        SpringApplication.run(StorageAppJ9OnlineApplication.class, args);
    }

}
