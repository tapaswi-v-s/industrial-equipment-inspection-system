package com.system.models.users;

public class User {


    private final Integer id;
    private final String name;
    private final String gender;
    private final String dob;
    private final String email;
    private final String passwordHash;
    private final Integer roleId;

    public User(Integer id, String name, String gender,
                String dob, String email, String passwordHash, Integer roleId) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.email = email;
        this.passwordHash = passwordHash;
        this.roleId = roleId;
    }

    public Integer getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getGender(){
        return gender;
    }

    public String getDob(){
        return dob;
    }

    public String getEmail(){
        return email;
    }

    public String getPasswordHash(){
        return passwordHash;
    }

    public Integer getRoleId(){
        return roleId;
    }
}
