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
        //1.0
//        ConfigurableApplicationContext context = SpringApplication
//                .run(EshopForIntegrationApplication.class, args);
        //1.1
//        ChannelGateway channelGateway = context.getBean(ChannelGateway.class);
//        channelGateway.process(new Product("Milk",34.34));
//        channelGateway.process(new Product("Chocolate",114.34));

        //2.0
//        DirectChannel invokeCallGetProducts = context
//                .getBean("invokeCallGetProducts", DirectChannel.class);
//        invokeCallGetProducts.send(MessageBuilder.withPayload("").build());
//
//        PollableChannel productsChannel = context
//                .getBean("get_products_channel", PollableChannel.class);
//        Message<?> receive = productsChannel.receive();
//        System.out.println(receive);
//        System.out.println(Objects.requireNonNull(receive).getPayload());

        //2.1
//        context.getBean(OrderActivator.class);
//        context.getBean
//                (/*"directChannel",*/ DirectChannel.class);
//        context.getBean(ChannelGateway.class);
        //3.0
//        DirectChannel invokeCallGetProducts = context
//                .getBean("invokeCallGetProducts", DirectChannel.class);
//        invokeCallGetProducts.send(MessageBuilder.withPayload("").build());
//
//        PollableChannel productsChannel = context
//                .getBean("get_products_channel", PollableChannel.class);
//
//        new Thread(() -> {
//            while (true) {
//                Message<?> receive = productsChannel.receive();
//                System.out.println(receive);
//            }
//        }).start();
//
//        Thread.sleep(5000);
//        System.out.println("Go next message");
//        invokeCallGetProducts.send(MessageBuilder.withPayload("").build());

          //4.0
//                Message<String> message = MessageBuilder
//                .withPayload("It is a body")
//                .setHeader("StringHeader", "Value")
//                .setHeader("IntHeader", 1)
//                .setHeader("ListOfStrings", Arrays.asList("String1", "String2"))
//                .build();
//
//        DirectChannel channel = context.getBean
//                (/*"directChannel",*/ DirectChannel.class);
//        channel.send(message);
    }
}
