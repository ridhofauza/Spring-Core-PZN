/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.pzn.springcore;

/**
 *
 * @author user
 */
public class Database {
    
    private static Database database;
    
    public static Database getInstance() {
        if(database == null) {
            database = new Database();
        }
        return database;
    }
    
    private Database() {}
    
}
