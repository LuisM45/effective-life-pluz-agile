/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.models;

import java.io.Serializable;
import net.epnmag9.effectivelifepluzma.controllers.*;

/**
 *
 * @author luism
 */
public class DatosClinicosMdl implements Serializable{
    private double peso;
    private double altura;
    private double presionSistolica;
    private double presionDiastolica;
    private double temperatura;
    private String fechaIngreso;
    private String observaciones;

    public DatosClinicosMdl(double peso, double altura, double presionSistolica, double presionDiastolica, double temperatura, String fechaIngreso, String observaciones) {
        this.peso = peso;
        this.altura = altura;
        this.presionSistolica = presionSistolica;
        this.presionDiastolica = presionDiastolica;
        this.temperatura = temperatura;
        this.fechaIngreso = fechaIngreso;
        this.observaciones = observaciones;
    }

    
    
    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double getPresionSistolica() {
        return presionSistolica;
    }

    public double getPresionDiastolica() {
        return presionDiastolica;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public String getObservaciones() {
        return observaciones;
    }
    
    
}
