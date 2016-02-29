/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.java.model.person;

import app.java.model.Commodity.Commodity;
import app.java.model.List;
import app.java.model.Order;

/**
 *
 * @author cver
 */
public class Customer {
    public static final int FIND_BY_NAME = 1;
    public static final int FIND_BY_KIND = 2;
    public static final int FIND_BY_ID = 3;
    
    public List<Commodity> filterCommodity(String kind[], int typeFind) {
        return null;
    }
    
    public boolean purchaseFor(String itemId, String storeId) {
        return true;
    }
    
    public Order viewOrder() {
        return null;
    }
    
    public boolean cancelOrder() {
        return true;
    }
    
    private List<Commodity> findByName(String name) {
        return null;
    }
    
    private List<Commodity> findByKind(String kind) {
        return null;
    }
    
    private List<Commodity> findById(String id) {
        return null;
    }
}
