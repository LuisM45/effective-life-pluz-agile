/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.models;

import java.io.Serializable;
import net.epnmag9.effectivelifepluzma.controllers.DoctorCtrl;

/**
 *
 * @author Steven
 */
public class TareaMdl implements Serializable{
    private String descripcion;
    private String estado;
    private DoctorCtrl doctor;

    public TareaMdl(String descripcion, String estado, DoctorCtrl doctor) {
        this.descripcion = descripcion;
        this.estado = estado;
        this.doctor = doctor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
