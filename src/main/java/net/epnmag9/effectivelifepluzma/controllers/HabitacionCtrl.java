/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.epnmag9.effectivelifepluzma.controllers;

import net.epnmag9.effectivelifepluzma.models.HabitacionMdl;
import net.epnmag9.effectivelifepluzma.views.HabitacionVw;

/**
 *
 * @author Usuario
 */
public class HabitacionCtrl {
    private HabitacionVw view;
    private HabitacionMdl model;

    public HabitacionCtrl(String codigo) {
        model = new HabitacionMdl(codigo);
    }

    public HabitacionVw getView() {
        return view;
    }

    public void setView(HabitacionVw view) {
        this.view = view;
    }
    
    
    
    public boolean putPaciente(PacienteCtrl pacienteCtrl){
        if(model.getPaciente()!=null) return false;
        model.setPaciente(pacienteCtrl);
        return true;
    }
    
    public PacienteCtrl popPaciente(){
        PacienteCtrl p = model.getPaciente();
        model.setPaciente(null);
        return p;
    }
    
    public PacienteCtrl peekPaciente(){
        return model.getPaciente();
    }
    
}
