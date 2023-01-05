/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.epnmag9.effectivelifepluzma.controllers;

import net.epnmag9.effectivelifepluzma.models.PacienteMdl;
import net.epnmag9.effectivelifepluzma.views.PacienteVw;

/**
 *
 * @author Usuario
 */
public class PacienteCtrl {
    private PacienteMdl model;
    private PacienteVw view;
    
    public PacienteCtrl(String cedula, String nombre, String fechaNacimiento, String tipoSangre, String sexo) {
        model = new PacienteMdl(cedula, nombre, fechaNacimiento, tipoSangre, sexo);
    }

    public PacienteVw getPacienteVw() {
        return view;
    }

    public void setView(PacienteVw view) {
        this.view = view;
    }
    
    
    
    public String getCedula() {
        return model.getCedula();
    }
    
    public String getNombre() {
        return model.getNombre();
    }

    public String getFechaNacimiento() {
        return model.getFechaNacimiento();
    }

    public String getTipoSangre() {
        return model.getTipoSangre();
    }

    public String getSexo() {
        return model.getSexo();
    }
}
