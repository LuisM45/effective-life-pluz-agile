/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.models;

/**
 *
 * @author Steven
 */
public class InformeMdl {
    private int pacientesIngresados;
    private int pacientesAlta;
    private int habitacionesLibres;
    private int habitacionesOcupadas;

    public InformeMdl(int pacientesIngresados, int pacientesAlta, int habitacionesLibres, int habitacionesOcupadas) {
        this.pacientesIngresados = pacientesIngresados;
        this.pacientesAlta = pacientesAlta;
        this.habitacionesLibres = habitacionesLibres;
        this.habitacionesOcupadas = habitacionesOcupadas;
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
    
    
    
}
