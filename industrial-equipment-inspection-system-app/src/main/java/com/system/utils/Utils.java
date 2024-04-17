package com.system.utils;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;

public class Utils {

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
    public static void showDialog(Component component, String message, String errorMessage) {
        if (message == null) {
            JOptionPane.showMessageDialog(component,
                    errorMessage,
                    "Error...!",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(component,
                    message,
                    "Done...!",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public static int getroleid(String userrole) {
        switch(userrole) {
            case "Plant Manager": 
                return 2;
            case "Inspector":
                return 3;
            case "Evaluator":
                return 4;
            default:
                return 0;
        }
    }
    
    public static void goBack(JPanel mainPanel, Component cmp){
        mainPanel.remove(cmp);
        CardLayout cl = (CardLayout) mainPanel.getLayout();
        cl.previous(mainPanel);
    }
}
