/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.epnmag9.effectivelifepluzma.controllers;

import java.util.LinkedList;
import java.util.List;
import net.epnmag9.effectivelifepluzma.models.HospitalMdl;
import net.epnmag9.effectivelifepluzma.views.HospitalVw;

/**
 *
 * @author Usuario
 */
public class HospitalCtrl {
    private HospitalMdl model;
    private HospitalVw view;

    public HospitalCtrl() {
        model = new HospitalMdl();
    }

    public HospitalVw getView() {
        return view;
    }

    public void setView(HospitalVw view) {
        this.view = view;
    }
    
    public void addHabitacion(HabitacionCtrl habitacionCtrl){
        model.getHabitaciones().add(habitacionCtrl);
    }
    
    public List<HabitacionCtrl> checkFreeHabitacion(HabitacionCtrl habitacionCtrl){
        List<HabitacionCtrl> freeHabitacion = new LinkedList<>();
        for(HabitacionCtrl h: model.getHabitaciones()){
            if(h.peekPaciente()==null){
                freeHabitacion.add(h);
            }
        }
        return freeHabitacion;
    }
    
    public boolean putPacienteInHabitacion(String codigo, PacienteCtrl pacienteCtrl){
        for(HabitacionCtrl habitacionCtrl: model.getHabitaciones()){
            if(habitacionCtrl.getCodigo().equals(codigo)){
                if(habitacionCtrl.putPaciente(pacienteCtrl))
                    return true;
                return false;
            }
        }
        
        HabitacionCtrl habitacionCtrl = new HabitacionCtrl(codigo);
        model.getHabitaciones().add(habitacionCtrl);
        return true;
    }
    
        public boolean popPacienteOutHabitacion(PacienteCtrl pacienteCtrl){
        for(HabitacionCtrl h: model.getHabitaciones()){
            if(h.peekPaciente()==pacienteCtrl){
                h.popPaciente();
                return true;
            }
        }
        return false;
    }
}
