/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.java.model.person;

import app.java.model.Store;

/**
 *
 * @author cver
 */
public class Adminitrator extends Member {
    public boolean addStore(Store store) {
        return true;
    }
    
    public boolean removeStore() {
        return true;
    }
    
    public boolean addCommodity() {
        return true;
    }
    
    public boolean removeCommodity() {
        return true;
    }
    
    public boolean removeMember() {
        return true;
    }
}
