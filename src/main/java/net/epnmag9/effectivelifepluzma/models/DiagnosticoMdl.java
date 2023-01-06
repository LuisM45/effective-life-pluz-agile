/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.models;

import java.io.Serializable;
import net.epnmag9.effectivelifepluzma.controllers.*;

/**
 *
 * @author thomas
 */
public class DiagnosticoMdl implements Serializable {
    
    String doctor; //Doctor's name
    String diagnostico;
    String prescripcion;
    String fechaDiagnostico;

    public DiagnosticoMdl(String doctor, String diagnostico, String prescripcion,String fechaDiagnostico) {
        this.doctor = doctor;
        this.diagnostico = diagnostico;
        this.prescripcion = prescripcion;
        this.fechaDiagnostico = fechaDiagnostico;
    }

    public String getDoctor() {
        return doctor;
    }

    public String getPrescripcion(){
        return prescripcion;
    }
    
    public String getDiagnostico() {
        return diagnostico;
    }

    public String getFechaDiagnostico() {
        return fechaDiagnostico;
    }
    
}
