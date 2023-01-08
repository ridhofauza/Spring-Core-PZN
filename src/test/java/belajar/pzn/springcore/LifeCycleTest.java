/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.pzn.springcore;

import belajar.pzn.springcore.data.Connection;
import belajar.pzn.springcore.data.Server;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author user
 */
public class LifeCycleTest {
    
    private ConfigurableApplicationContext applicationContext;
    
    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
        applicationContext.registerShutdownHook();
    }
    
    @AfterEach
    void tearDown() {
        // applicationContext.close();
    }
    
    @Test
    void testConnection() {
        Connection connection = applicationContext.getBean(Connection.class);
    }
    
    @Test
    void testServer() {
        Server server = applicationContext.getBean(Server.class);
    }
    
}
