/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.controllers;

import java.io.Serializable;
import net.epnmag9.effectivelifepluzma.models.DiagnosticoMdl;
import net.epnmag9.effectivelifepluzma.views.DiagnosticoVw;

/**
 *
 * @author thoma
 */
public class DiagnosticoCtrl implements Serializable{
    
    DiagnosticoMdl modelo;
    DiagnosticoVw vista;

    public DiagnosticoCtrl(String doctor, String diagnostico, String fechaDiagnostico) {
        modelo = new DiagnosticoMdl(doctor, diagnostico, fechaDiagnostico);
    }
    
    public DiagnosticoVw getView(){
        return vista;
    }
    
    public void setVista(DiagnosticoVw vista){
        this.vista = vista;
    }
    
    public String getDiagnostico(){
        return modelo.getDiagnostico();
    }
    
    public String getDoctor(){
        return modelo.getDoctor();
    }
    
    public String getFechaDiagnostico(){
        return modelo.getFechaDiagnostico();
    }
}
