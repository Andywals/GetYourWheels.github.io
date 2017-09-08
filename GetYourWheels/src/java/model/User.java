/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author universe
 */
public class User {
    private String fName,mName,lName;
    private String email,phoneNo;

    public String getfName() {
        return fName;
    }
    public String getmName() {
        return mName;
    }
    public String getlName() {
        return lName;
    }
    
    public String getPhoneNo() {
        return phoneNo;
    }

    public String getEmail() {
        return email;
    }
    
    public void setUser(String fName,String mName,String lName,String email,String phoneNo) {
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.phoneNo = phoneNo;
        this.email = email;
        
    }

    

    

   
    
    
    
}
