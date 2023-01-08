/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.pzn.springcore.commandapp;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author user
 */
@Slf4j
@Component
public class LogCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
      log.info("Log Command Line Runner : {}", Arrays.toString(args));
    }    
    
}
