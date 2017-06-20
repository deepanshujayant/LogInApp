/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logins;

/**
 *
 * @author Deepanshu
 */
public class GetData {

    /**
     * @return the user
     */
   

    /**
     * @return the pass
     */
    
    
    String fname,lname;
    static String user;
    static String pass;
    public  static  void getData(String u1, String p1){
        user=u1;
        pass=p1;
    
    }
    
    static String setUser(){
        return user;
    }
    static String setPass(){
        return pass;
    }
   /* public String geTData(String p1){
        
        pass = p1;
        return pass;
    }*/
   
    /*public String getUser()
    {  
        return user;
    }
    public String getPass() {
        
        return pass;
    }*/
}
