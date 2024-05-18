package codoacodo.vuelosapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class VuelosApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(VuelosApiApplication.class, args);
    }
}


