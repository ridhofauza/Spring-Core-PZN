/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.pzn.springcore;

import belajar.pzn.springcore.data.Bar;
import belajar.pzn.springcore.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

/**
 *
 * @author user
 */
@Slf4j
@Configuration
public class DependsOnConfiguration {
    
    @Lazy
    @Bean
    @DependsOn({
        "bar"
    })
    public Foo foo() {
        log.info("Create new Foo");
        return new Foo();
    }
    
    @Bean
    public Bar bar() {
        log.info("Create new Bar");
        return new Bar();
    }
    
}
