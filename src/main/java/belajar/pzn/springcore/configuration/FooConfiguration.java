/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.pzn.springcore.configuration;

import belajar.pzn.springcore.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 *
 * @author user
 */

@Configuration
public class FooConfiguration {
    
    @Bean
    @Primary
    public Foo foo() {
        return new Foo();
    }
    
    @Bean
    public Foo foo2() {
        return new Foo();
    }
    
    @Bean
    public Foo foo3() {
        return new Foo();
    }
    
}
