/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.controllers;

import java.io.Serializable;
import java.util.List;
import net.epnmag9.effectivelifepluzma.models.RegistroDiagnosticoMdl;
import net.epnmag9.effectivelifepluzma.views.RegistroDiagnosticoVw;

/**
 *
 * @author Thomas Tapia
 */
public class RegistroDiagnosticoCtrl implements Serializable {

    private RegistroDiagnosticoMdl model;
    private RegistroDiagnosticoVw view;

    public RegistroDiagnosticoCtrl() {
        model = new RegistroDiagnosticoMdl();
        view = new RegistroDiagnosticoVw(this);
    }

    public RegistroDiagnosticoVw getView() {
        return view;
    }

    public void setView(RegistroDiagnosticoVw view) {
        this.view = view;
    }

    public void pushDiagnostico(DiagnosticoCtrl diagnosticoCtrl) {
        DiagnosticoCtrl diagnosticoReciente = model.getDiagnosticoReciente();
        if(diagnosticoReciente != null)
            model.getDiagnosticosHistoricos().add(diagnosticoReciente);
        
        model.setDiagnosticoReciente(diagnosticoCtrl);
    }

    public List<DiagnosticoCtrl> getDiagnosticosHistoricos(){
        return model.getDiagnosticosHistoricos();
    }
    
    public DiagnosticoCtrl getDiagnosticoRecientes(){
        return model.getDiagnosticoReciente();
    }

}
