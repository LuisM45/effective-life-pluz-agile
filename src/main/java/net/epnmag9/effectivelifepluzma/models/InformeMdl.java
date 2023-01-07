/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.models;

import java.io.Serializable;

/**
 *
 * @author Steven
 */
public class InformeMdl implements Serializable {
    private int pacientesIngresados;
    private int pacientesAlta;
    private int habitacionesLibres;
    private int habitacionesOcupadas;

    public InformeMdl() {
        this.pacientesIngresados = 0;
        this.pacientesAlta = 0;
        this.habitacionesLibres = 0;
        this.habitacionesOcupadas = 0;
    }

    public int getPacientesIngresados() {
        return pacientesIngresados;
    }

    public int getPacientesAlta() {
        return pacientesAlta;
    }

    public int getHabitacionesLibres() {
        return habitacionesLibres;
    }

    public int getHabitacionesOcupadas() {
        return habitacionesOcupadas;
    }

    public void setPacientesIngresados(int num) {
        this.pacientesIngresados = this.pacientesIngresados + num;
    }

    public void setPacientesAlta(int num) {
        this.pacientesAlta = this.pacientesAlta + num;
    }

    public void setHabitacionesLibres(int num) {
        this.habitacionesLibres = this.habitacionesLibres + num;
    }
  
    public void setHabitacionesOcupadas(int num) {
        this.habitacionesOcupadas = this.habitacionesOcupadas + num;
    }
}
