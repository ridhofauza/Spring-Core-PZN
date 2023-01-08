/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.pzn.springcore;

import belajar.pzn.springcore.data.Bar;
import belajar.pzn.springcore.data.Foo;
import belajar.pzn.springcore.data.FooBar;
import java.util.Optional;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author user
 */

@Configuration
public class OptionalConfiguration {
    
    @Bean
    public Foo foo() {
        return new Foo();
    }
    
    @Bean
    public FooBar fooBar(Optional<Foo> foo, Optional<Bar> bar) {
        return new FooBar(foo.orElse(null), bar.orElse(null));
    }
    
}
