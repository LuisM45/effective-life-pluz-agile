/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.controllers;

import java.io.Serializable;
import net.epnmag9.effectivelifepluzma.models.InformeMdl;
import net.epnmag9.effectivelifepluzma.views.InformeVw;

/**
 *
 * @author Steven
 */
public class InformeCtrl  implements Serializable{
    private InformeMdl model;
    private InformeVw view;

    public InformeCtrl() { 
        model = new InformeMdl();
    }

    public InformeMdl getModel() {
        return model;
    }

    public void setModel(InformeMdl model) {
        this.model = model;
    }

    public InformeVw getView() {
        return view;
    }

    public void setView(InformeVw view) {
        this.view = view;
    }
    

    public int getPacientesIngresado() {
        return model.getPacientesIngresados();
    }
    
    public int getPacientesAlta() {
        return model.getPacientesAlta();
    }
    
    public int getHabitacionesLibres() {
        return model.getHabitacionesLibres();
    }
    
    public int getHabitacionesOcupadas() {
        return model.getHabitacionesOcupadas();
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
