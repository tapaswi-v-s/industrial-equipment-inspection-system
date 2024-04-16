/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.system.admin;

import com.system.models.users.User;
import com.system.utils.DatabaseHelper;
import java.util.List;

/**
 *
 * @author sid
 */
public class AdminController {
    boolean addUser(User user){
        return DatabaseHelper.getInstance().addUser(user);
    }
    List<User> fetchUsers(int role_id){
        
        return DatabaseHelper.getInstance().fetchUsers(role_id);
    }
    
    boolean deleteUser(int role_id){
        return DatabaseHelper.getInstance().deleteUser(role_id);
    }
}
