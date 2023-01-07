/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.controllers;

import java.io.Serializable;
import net.epnmag9.effectivelifepluzma.models.TareaMdl;
import net.epnmag9.effectivelifepluzma.views.TareaVw;

/**
 *
 * @author Steven
 */
public class TareaCtrl implements Serializable {

    private TareaMdl model;
    private TareaVw view;
    
    public TareaCtrl(String desc, String state, DoctorCtrl doctorCtrl) {
        model = new TareaMdl(desc, state, doctorCtrl);
    }

    public TareaVw getView() {
        return view;
    }

    public void setView(TareaVw view) {
        this.view = view;
    }

    public String getDescripcion() {
        return model.getDescripcion();
    }

    public void setDescripcion(String descripcion) {
        model.setDescripcion(descripcion);
    }

    public String getEstado() {
        return model.getEstado();
    }

    public void setEstado(String estado) {
        model.setEstado(estado);
    }
}
