/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.pzn.springcore.configuration;

import belajar.pzn.springcore.repository.CustomerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 *
 * @author user
 */

@Configuration
public class CustomerConfiguration {
    
    @Primary
    @Bean
    public CustomerRepository normalCustomerRepository() {
        return new CustomerRepository();
    }
    
    @Bean    
    public CustomerRepository premiumCustomerRepository() {
        return new CustomerRepository();
    }
    
}
