/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.pzn.springcore;

import belajar.pzn.springcore.listener.LoginSuccessAgainListener;
import belajar.pzn.springcore.listener.LoginSuccessListener;
import belajar.pzn.springcore.listener.UserListener;
import belajar.pzn.springcore.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 *
 * @author user
 */
public class EventListenerTest {
    
    @Configuration
    @Import({
        UserService.class,
        LoginSuccessListener.class,
        LoginSuccessAgainListener.class,
        UserListener.class,
    })
    public static class TestConfiguration {
        
    }
    
    private ConfigurableApplicationContext applicationContext;
    
    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }
    
    @Test
    void testEvent() {
        UserService userService = applicationContext.getBean(UserService.class);
        userService.login("pzn", "pzn");
        userService.login("eko", "kurniawan");
        userService.login("eko", "salah");
    }
    
    
}
