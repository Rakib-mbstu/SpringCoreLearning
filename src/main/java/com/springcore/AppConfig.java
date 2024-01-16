package com.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan(basePackages = "com.springcore")
@PropertySource("./property.properties")
public class AppConfig {
    @Bean
    public Customer customerBean()
    {
        Customer customer = new Customer();
        customer.setName("Name");
        customer.setAge(190);
        customer.setAddress("Address");
        return customer;
    }
}
