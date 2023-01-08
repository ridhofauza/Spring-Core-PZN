/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.pzn.springcore.scope;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

/**
 *
 * @author user
 */
public class DoubletonScope implements Scope {
    
    private List<Object> objects = new ArrayList<>(2);
    private Long counter = -1L;

    @Override
    public Object get(String string, ObjectFactory<?> objectFactory) {        
        counter++;
        if(objects.size() == 2) {
            int index = (int) (counter % 2);
            return objects.get(index);
        } else {
            Object object = objectFactory.getObject();
            objects.add(object);
            return object;
        }
    }

    @Override
    public Object remove(String string) {
        if(!objects.isEmpty()) {
            return objects.remove(0);
        }
        return null;
    }

    @Override
    public void registerDestructionCallback(String string, Runnable r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object resolveContextualObject(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getConversationId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
