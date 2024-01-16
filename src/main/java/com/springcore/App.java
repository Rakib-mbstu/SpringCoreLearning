package com.springcore;

import com.springcore.Animals;
import com.springcore.Human;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        ApplicationContext context = new ClassPathXmlApplicationContext("propertyconfig.xml");
//        Animals anm = context.getBean("human1", Animals.class);
//        anm.name_of_animal();
//    //    InZoo lion = new InZoo();//-> hard coding is being done here .....
//        InZoo lion = context.getBean("in_zoos",InZoo.class);
//        lion.isPresent();

        Customer obj = context.getBean("customerBean",Customer.class);
        obj.displayInfo();
    }
}
