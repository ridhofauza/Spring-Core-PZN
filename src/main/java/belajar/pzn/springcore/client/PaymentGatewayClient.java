/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.pzn.springcore.client;

import lombok.Data;

/**
 *
 * @author user
 */
@Data
public class PaymentGatewayClient {
    
    private String endpoint;
    private String privateKey;
    private String publicKey;
    
}
