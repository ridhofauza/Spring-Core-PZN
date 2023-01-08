/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.pzn.springcore;

import belajar.pzn.springcore.factory.PaymentGatewayClientFactoryBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 *
 * @author user
 */
@Configuration
@Import({
    PaymentGatewayClientFactoryBean.class
})
public class FactoryConfiguration {
    
    
    
}
