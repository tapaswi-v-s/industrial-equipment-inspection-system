package com.system.models.users;

public class PlantManager extends User{
    public PlantManager(Integer id, String name, String gender,
                        String dob, String email, String passwordHash, Integer roleId) {
        super(id, name, gender, dob, email, passwordHash, roleId);
    }
}
