/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.pzn.springcore;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author user
 */
@Configuration
@ComponentScan(basePackages = {
    "belajar.pzn.springcore.configuration"
})
public class ScanConfiguration {
    
}
