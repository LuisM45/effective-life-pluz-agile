/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.controllers;

import java.io.Serializable;
import net.epnmag9.effectivelifepluzma.models.InformeMdl;

/**
 *
 * @author Steven
 */
public class InformeCtrl  implements Serializable{
    private InformeMdl model;
    private InformeMdl view;

    public InformeCtrl() { 
    }

    public InformeMdl getModel() {
        return model;
    }

    public void setModel(InformeMdl model) {
        this.model = model;
    }

    public InformeMdl getView() {
        return view;
    }

    public void setView(InformeMdl view) {
        this.view = view;
    }
    

    public int getPacientesIngresado() {
        return 0;
    }
    
    public int getPacientesAlta() {
        return 0;
    }
    
    public int getHabitacionesLibres() {
        return 0;
    }
    
    public int getHabitacionesOcupadas() {
        return 0;
    }
    
    public void setPacientesIngresado(int num) {
        model.setPacientesIngresados(num);
    }
    
    public void setPacientesAlta(int num) {
        model.setPacientesAlta(num);
    }
    
    public void setHabitacionesLibres(int num) {
        model.setHabitacionesLibres(num);
    }
    
    public void setHabitacionesOcupadas(int num) {
        model.setHabitacionesOcupadas(num);
    }
    
}
