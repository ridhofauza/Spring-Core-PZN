/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.pzn.springcore.event;

import belajar.pzn.springcore.data.User;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 *
 * @author user
 */
public class LoginSuccessEvent extends ApplicationEvent {
    
    @Getter
    private final User user;
    
    public LoginSuccessEvent(User user) {
        super(user);
        this.user = user;
    }
    
}
