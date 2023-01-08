/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.pzn.springcore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author user
 */
public class DatabaseTest {
    
    @Test
    void testSingleton() {
        Database database1 = Database.getInstance();
        Database database2 = Database.getInstance();
        
        Assertions.assertSame(database1, database2);
    }
    
}
