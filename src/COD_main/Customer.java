/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package COD_main;

/**
 *
 * @author Petru Botnar
 */
public class Customer extends User {
    private double spending = 0;
    private boolean isLoggedIn;

    public Customer(String user_id, String username, String password, double spending) {
        super(user_id, username, password);
        this.spending = spending;
        super.setType("customer");
    }
    
    public void placeOrder(){
        
    }
    
    public void returnOrder(){
        
    }
    
    public void requestHighPriority(){
        
    }
    
    public void checkNotification(){
        
    }

    public double getSpending() {
        return spending;
    }

    public void setSpending(double spending) {
        this.spending = spending;
    }

    public boolean isIsLoggedIn() {
        return isLoggedIn;
    }

    public void setIsLoggedIn(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }
    
    
}
