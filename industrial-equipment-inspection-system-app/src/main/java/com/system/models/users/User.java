package com.system.models.users;

public class User {


    private final Integer id;
    private String name;
    private String gender;
    private String dob;
    private String email;
    private String passwordHash;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", dob=" + dob + ", email=" + email + ", passwordHash=" + passwordHash + ", roleId=" + roleId + '}';
    }
    
    
}
