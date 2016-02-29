/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.java.model.person;

import app.java.model.ActivityLog;
import app.java.model.List;

/**
 *
 * @author cver
 */
public class Manager extends Salesman {
    private String storeId;
    
    public Manager() {}

    public Manager(String storeId) {
        this.storeId = storeId;
    }
    
    public List<ActivityLog> viewSalesmanActivityLog() {
        return null;
    }
    
    public boolean removeSalesmanActivityLog() {
        return true;
    }
    
    public boolean addSalesman() {
        return true;
    }
    
    public boolean removeSalesman() {
        return true;
    }
    
    public boolean addStoreCommodity() {
        return true;
    }
    
    public boolean removeStoreCommodity() {
        return true;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }
}
