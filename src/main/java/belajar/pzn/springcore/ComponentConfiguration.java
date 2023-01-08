/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.pzn.springcore;

import belajar.pzn.springcore.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 *
 * @author user
 */
@Configuration
@ComponentScan(basePackages = {
    "belajar.pzn.springcore.service",
    "belajar.pzn.springcore.repository",
    "belajar.pzn.springcore.configuration"
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
    
}
