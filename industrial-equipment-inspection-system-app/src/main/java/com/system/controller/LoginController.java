/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.system.controller;

import com.system.models.enums.UserType;
import com.system.models.users.User;
import com.system.utils.DatabaseHelper;

/**
 *
 * @author sid
 */
public class LoginController {
    
    public User handleLogin(String uName, String pwd, UserType userType){
        User user;
        switch(userType){
            case ADMIN:
                user = DatabaseHelper.getInstance().getUser(uName, pwd);            
                    if(user!=null && user.getRoleId()==1){
                        return user;
                    }
                    return null;
             
            case PLANTMANAGER:
                user = DatabaseHelper.getInstance().getUser(uName, pwd);            
                    if(user!=null && user.getRoleId()==2){
                        return user;
                    }
                    return null;
              
            case INSPECTOR:
                user = DatabaseHelper.getInstance().getUser(uName, pwd);            
                    if(user!=null && user.getRoleId()==3){
                        return user;
                    }
                    return null;
               
            case EVALUATOR:
                user = DatabaseHelper.getInstance().getUser(uName, pwd);            
                    if(user!=null && user.getRoleId()==4){
                        return user;
                    }
                    return null;
               
            default:
                return null;
        }
        
    }
}