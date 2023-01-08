/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.pzn.springcore.configuration;

import belajar.pzn.springcore.data.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author user
 */

@Configuration
public class BarConfiguration {
    
    @Bean
    public Bar bar() {
        return new Bar();
    }
    
}
