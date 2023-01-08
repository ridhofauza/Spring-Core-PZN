/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.pzn.springcore.data;

import belajar.pzn.springcore.aware.IdAware;
import lombok.Getter;
import org.springframework.stereotype.Component;

/**
 *
 * @author user
 */
@Component
public class Car implements IdAware {

    @Getter
    private String id;
    
    @Override
    public void setId(String id) {
        this.id = id;
    }
    
}
