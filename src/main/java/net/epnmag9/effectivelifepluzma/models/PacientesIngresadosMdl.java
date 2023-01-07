/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.epnmag9.effectivelifepluzma.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import net.epnmag9.effectivelifepluzma.controllers.*;

public class PacientesIngresadosMdl implements Serializable{
    private List<PacienteCtrl> pacientes;
    private List<PacienteCtrl> pacientesAntiguos;

    public PacientesIngresadosMdl() {
        pacientes = new ArrayList<>();
        pacientesAntiguos = new ArrayList<>();
    }

    public List<PacienteCtrl> getPacientes() {
        return pacientes;
    }
    
    public List<PacienteCtrl> getPacientesAntiguos() {
        return pacientesAntiguos;
    }
    
}
