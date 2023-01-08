/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.pzn.springcore.data.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author user
 */

@Data
@AllArgsConstructor
public class CyclicA {

    private CyclicB cyclicB;
    
}
