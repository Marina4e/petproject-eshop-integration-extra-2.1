package com.example.eshopforintegration;

import com.example.eshopforintegration.integration.OrderActivator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.integration.annotation.IntegrationComponentScan;

import java.util.Collections;

@SpringBootApplication
@IntegrationComponentScan
@ComponentScan(basePackages = "com.example.eshopforintegration",basePackageClasses = OrderActivator.class)

public class EshopForIntegrationApplication {

    public static void main(String[] args) throws InterruptedException{
        SpringApplication app = new SpringApplication(EshopForIntegrationApplication.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8090"));
        ConfigurableApplicationContext context = app.run(args);
    }
}
