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
    private PacienteMdl pacienteMdl;
    private PacienteVw pacienteVw;
    
    public PacienteCtrl(String nombre, String fechaNacimiento, String tipoSangre, String sexo) {
        pacienteMdl = new PacienteMdl(nombre, fechaNacimiento, tipoSangre, sexo);
    }
    
    public String getNombre() {
        return pacienteMdl.getNombre();
    }

    public String getFechaNacimiento() {
        return pacienteMdl.getFechaNacimiento();
    }

    public String getTipoSangre() {
        return pacienteMdl.getTipoSangre();
    }

    public String getSexo() {
        return pacienteMdl.getSexo();
    }
}
