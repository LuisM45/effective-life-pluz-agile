package net.epnmag9.effectivelifepluzma.controllers;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import net.epnmag9.effectivelifepluzma.models.PacientesIngresadosMdl;
import net.epnmag9.effectivelifepluzma.views.PacientesIngresadosVw;

public class PacientesIngresadosCtrl implements Serializable{
    private PacientesIngresadosVw view;
    private PacientesIngresadosMdl model;

    public PacientesIngresadosCtrl() {
        this.model = new PacientesIngresadosMdl();
    }

    public PacientesIngresadosVw getView() {
        return view;
    }

    public void setView(PacientesIngresadosVw view) {
        this.view = view;
    }
    
    
    
    public PacientesIngresadosCtrl(PacientesIngresadosVw view, PacientesIngresadosMdl model) {
        this.view = view;
        this.model = model;
    }
    
    public void addPaciente(PacienteCtrl pacienteCtrl){
        model.getPacientes().add(pacienteCtrl);
    }
    
    public List<PacienteCtrl> getPacientes() {
        return model.getPacientes();
    }
    
    public List<PacienteCtrl> getPacientesAntiguos() {
        return model.getPacientesAntiguos();
    }
    
    public void addSalida(PacienteCtrl pacienteCtrl){
        model.getPacientesAntiguos().add(pacienteCtrl);
    }
    
    
    public PacienteCtrl searchPacienteByCedula(String cedula) {
        for(PacienteCtrl p: model.getPacientes()){
            if(cedula.equals(p.getCedula())) return p;
        }
        return null;
    }
}
