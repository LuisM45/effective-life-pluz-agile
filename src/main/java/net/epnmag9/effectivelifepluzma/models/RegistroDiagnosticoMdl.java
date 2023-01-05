/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import net.epnmag9.effectivelifepluzma.controllers.*;

/**
 *
 * @author Thomas Tapia
 */
public class RegistroDiagnosticoMdl implements Serializable{
    private List<DiagnosticoCtrl> diagnosticosHistoricos;
    private DiagnosticoCtrl diagnosticoReciente;
    
    public RegistroDiagnosticoMdl(){
        diagnosticosHistoricos = new ArrayList<>();
    }
    
    public List<DiagnosticoCtrl> getDiagnosticosHistoricos(){
        return diagnosticosHistoricos;
    }
    
    public DiagnosticoCtrl getDiagnosticoReciente(){
        return diagnosticoReciente;
    }
    
    public void setDiagnosticoReciente(DiagnosticoCtrl diagnositcoReciente){
        this.diagnosticoReciente = diagnositcoReciente;
    }
}
