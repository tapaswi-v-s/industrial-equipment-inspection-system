/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.system.evaluator;

import com.system.models.Inspection;
import com.system.utils.DatabaseHelper;
import java.util.List;

/**
 *
 * @author kushp
 */
public class EvaluatorController {
    
    List<Inspection> fetchFreshInspections(){
        return DatabaseHelper.getInstance().fetchFreshInspections();
    }
    
    List<Inspection> fetchPastInspections(){
        return DatabaseHelper.getInstance().fetchPastInspections();
    }
    
}
