package comgep.sigpesng.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SgpngEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SgpngEurekaServerApplication.class, args);
	}

}
