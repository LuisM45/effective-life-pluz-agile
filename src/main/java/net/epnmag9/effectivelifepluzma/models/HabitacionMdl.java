/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.epnmag9.effectivelifepluzma.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import net.epnmag9.effectivelifepluzma.controllers.PacienteCtrl;

/**
 *
 * @author Usuario
 */
public class HabitacionMdl implements Serializable{
    String codigo;
    PacienteCtrl paciente;

    public HabitacionMdl(String codigo) {
        this.codigo = codigo;
    }

    public String getEstadoHabitacion() {
        return codigo;
    }

    public PacienteCtrl getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteCtrl paciente) {
        this.paciente = paciente;
    }

    public String getCodigo() {
        return codigo;
    }
    
}
