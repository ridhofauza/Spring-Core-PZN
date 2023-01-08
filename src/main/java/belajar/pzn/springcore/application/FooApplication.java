/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.pzn.springcore.application;

import belajar.pzn.springcore.data.Bar;
import belajar.pzn.springcore.data.Foo;
import belajar.pzn.springcore.listener.AppStartingListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author user
 */
@SpringBootApplication
public class FooApplication {
    
    @Bean
    public Foo foo() {
       return new Foo();
    }
    
//    public static void main(String[] args) {
//        ConfigurableApplicationContext applicationContext = SpringApplication.run(FooApplication.class, args);
//        Foo foo = applicationContext.getBean(Foo.class);
//        System.out.println(foo);
//    }
    
//    public static void main(String[] args) {
//        SpringApplication application = new SpringApplication(FooApplication.class);
//        application.setBannerMode(Banner.Mode.OFF);
//        application.setListeners(new HashSet<>(Arrays.asList(new AppStartingListener())));
////        application.addListeners(new AppStartingListener());
//        
//        ConfigurableApplicationContext applicationContext = application.run(args);
//        
//        Foo foo = applicationContext.getBean(Foo.class);
//        System.out.println(foo);
//    }
    
}
