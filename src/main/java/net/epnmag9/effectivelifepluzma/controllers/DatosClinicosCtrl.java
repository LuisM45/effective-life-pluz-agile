/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.controllers;

import java.io.Serializable;
import net.epnmag9.effectivelifepluzma.models.DatosClinicosMdl;
import net.epnmag9.effectivelifepluzma.views.DatosClinicosVw;

/**
 *
 * @author luism
 */
public class DatosClinicosCtrl implements Serializable{
    private DatosClinicosMdl modelo;
    private DatosClinicosVw vista;

    public DatosClinicosCtrl(double peso, double altura, double presionSistolica, double presionDiastolica, double temperatura, String fechaIngreso, String observaciones) {
        modelo = new DatosClinicosMdl(peso, altura,presionSistolica, presionDiastolica, temperatura, fechaIngreso, observaciones);
    }

    public DatosClinicosVw getVista() {
        return vista;
    }

    public void setVista(DatosClinicosVw vista) {
        this.vista = vista;
    }
    
    public double getPeso() {
        return modelo.getPeso();
    }

    public double getAltura() {
        return modelo.getAltura();
    }

    public double getPresionSistolica() {
        return modelo.getPresionSistolica();
    }

    public double getPresionDiastolica() {
        return modelo.getPresionDiastolica();
    }

    public double getTemperatura() {
        return modelo.getTemperatura();
    }

    public String getFechaIngreso() {
        return modelo.getFechaIngreso();
    }

    public String getObservaciones() {
        return modelo.getObservaciones();
    }
}
