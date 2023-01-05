/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.epnmag9.effectivelifepluzma.models;

import net.epnmag9.effectivelifepluzma.controllers.*;

/**
 *
 * @author Usuario
 */
public class PacienteMdl {
    String nombre;
    String fechaNacimiento;
    String tipoSangre;
    String sexo;

    public PacienteMdl(String nombre, String fechaNacimiento, String tipoSangre, String sexo) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoSangre = tipoSangre;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public String getSexo() {
        return sexo;
    }
    
}
