/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package COD_main;

/**
 *
 * @author Petru Botnar;
 */
public class VIP extends Customer{
    private String club_status;
    private double credit;

    public VIP(String user_id, String username, String password, double spending, String club_status, double credit) {
        super(user_id, username, password, spending);
        super.setType("vip");
        this.club_status = club_status;
        this.credit = credit;
    }
    
    public void getDiscount(){
        
    }
    
    public void getDiscountValue(){
        
    }

    public String getClub_status() {
        return club_status;
    }

    public void setClub_status(String club_status) {
        this.club_status = club_status;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
    
    
}
