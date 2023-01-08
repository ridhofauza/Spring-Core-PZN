/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.pzn.springcore.application;

import belajar.pzn.springcore.application.FooApplication;
import belajar.pzn.springcore.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author user
 */
@SpringBootTest(classes = FooApplication.class)
public class FooApplicationTest {
    
    @Autowired
    Foo foo;
    
    @Test
    void testSpringBoot() {
        Assertions.assertNotNull(foo);
    }
    
}
