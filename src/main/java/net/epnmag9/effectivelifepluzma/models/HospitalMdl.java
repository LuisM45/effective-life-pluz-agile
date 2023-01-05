/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.epnmag9.effectivelifepluzma.models;

import java.util.ArrayList;
import java.util.List;
import net.epnmag9.effectivelifepluzma.controllers.HabitacionCtrl;

/**
 *
 * @author Usuario
 */
public class HospitalMdl {
    private List<HabitacionCtrl> habitaciones;

    public HospitalMdl() {
        habitaciones = new ArrayList<>();
    }

    public List<HabitacionCtrl> getHabitaciones() {
        return habitaciones;
    }
    
    
    
}
