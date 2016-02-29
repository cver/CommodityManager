/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.java.model.person;

import app.java.model.IActivityLogRecorder;

/**
 *
 * @author cver
 */
public class Salesman extends Member implements IActivityLogRecorder {
    
    public boolean sellItem(String itemId) {
        return true; //ban co hop le ko
    }

    @Override
    public void recordActivityLog() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
