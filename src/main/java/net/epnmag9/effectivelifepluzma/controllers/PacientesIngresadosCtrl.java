package net.epnmag9.effectivelifepluzma.controllers;

import net.epnmag9.effectivelifepluzma.models.PacientesIngresadosMdl;
import net.epnmag9.effectivelifepluzma.views.PacientesIngresadosVw;

public class PacientesIngresadosCtrl {
    private PacientesIngresadosVw view;
    private PacientesIngresadosMdl model;

    public PacientesIngresadosCtrl() {
        this.view = new PacientesIngresadosVw();
        this.model = new PacientesIngresadosMdl();
    }
    
    public PacientesIngresadosCtrl(PacientesIngresadosVw view, PacientesIngresadosMdl model) {
        this.view = view;
        this.model = model;
    }
    
    public void addPaciente(PacienteCtrl pacienteCtrl){
    }
    
}
