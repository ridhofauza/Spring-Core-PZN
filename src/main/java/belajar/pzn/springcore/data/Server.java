/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.pzn.springcore.data;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author user
 */

@Slf4j
public class Server {
    
    @PostConstruct
    public void start() {
        log.info("Start Server");
    }
    
    @PreDestroy
    public void stop() {
        log.info("Stop Server");
    }
    
}
