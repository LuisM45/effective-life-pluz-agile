/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.models;

import java.io.Serializable;
import net.epnmag9.effectivelifepluzma.controllers.*;

/**
 *
 * @author luism
 */
public class VisitaMdl  implements Serializable{
    private String name;
    private HabitacionCtrl habitacionCtrl;

    public VisitaMdl(String name, HabitacionCtrl habitacionCtrl) {
        this.name = name;
        this.habitacionCtrl = habitacionCtrl;
    }

    public String getName() {
        return name;
    }

    public HabitacionCtrl getHabitacionCtrl() {
        return habitacionCtrl;
    }
    
    
}
