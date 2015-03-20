/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database_conn;

import COD_main.Customer;
import COD_main.User;
import COD_main.VIP;
import java.util.ArrayList;

public class DB {
    ArrayList<User> user_database;
    
    public DB(){
        user_database = new ArrayList();
        user_database.add(new User("01","john","000","staff"));
        user_database.add(new User("02","mark","111","manager"));
        user_database.add(new User("03","shon","222","owner"));
        user_database.add(new Customer("04","jeez","333",200));
        user_database.add(new VIP("05","pete","444",1000,"gold",10));
    }

    public ArrayList<User> getUser_database() {
        return user_database;
    }
    public void addUser(User u){
        user_database.add(u);
    }
}
