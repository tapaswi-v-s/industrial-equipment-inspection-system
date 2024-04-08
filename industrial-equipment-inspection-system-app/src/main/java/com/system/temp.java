package com.system;

import com.system.utils.DatabaseHelper;

public class temp {
    public static void main(String[] args) {
        DatabaseHelper.getInstance().init(); // Need to call only once.
        DatabaseHelper.getInstance().getPlantEquipments(1,1);
    }
}
