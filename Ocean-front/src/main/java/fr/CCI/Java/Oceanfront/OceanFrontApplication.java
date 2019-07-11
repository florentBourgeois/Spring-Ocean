package fr.CCI.Java.Oceanfront;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("fr.CCI.Java.Oceanfront")
public class OceanFrontApplication {

	public static void main(String[] args) {
		SpringApplication.run(OceanFrontApplication.class, args);
	}

}
