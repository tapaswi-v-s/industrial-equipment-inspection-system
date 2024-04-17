package com.system.utils;

import com.system.models.enums.UserType;

import java.util.Arrays;
import java.util.List;

public class StringUtils {

    public static List<UserType> getUserTypes(){
        // Convert Enums to string
        return List.of(UserType.values());
    }

}
