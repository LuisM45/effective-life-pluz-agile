/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.controllers;

import java.io.Serializable;
import java.util.List;
import net.epnmag9.effectivelifepluzma.models.DoctorMdl;
import net.epnmag9.effectivelifepluzma.models.TareaMdl;
import net.epnmag9.effectivelifepluzma.views.DoctorVw;

/**
 *
 * @author Steven
 */
public class DoctorCtrl implements Serializable {

    private DoctorMdl model;
    private DoctorVw view;

    public DoctorCtrl(String nombre, String CI) {
        model = new DoctorMdl(nombre, CI);
    }

    public DoctorVw getView() {
        return view;
    }

    public void setView(DoctorVw view) {
        this.view = view;
    }
    
    public String getNombre() {
        return model.getNombre();
    }

    public String getCI() {
        return model.getCI();
    }

    public List<TareaCtrl> getTareas() {
        return model.getTareas();
    }

    public void addTarea(TareaCtrl tareaCtrl) {
        model.getTareas().add(tareaCtrl);
    }
    
    
}
