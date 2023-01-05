/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import net.epnmag9.effectivelifepluzma.controllers.*;

/**
 *
 * @author luism
 */
public class RegistroDatosClinicosMdl implements Serializable{
    private List<DatosClinicosCtrl> datosClinicosHistoricos;
    private DatosClinicosCtrl datosClinicosRecientes;

    public RegistroDatosClinicosMdl() {
        datosClinicosHistoricos = new ArrayList<>();
    }

    public List<DatosClinicosCtrl> getDatosClinicosHistoricos() {
        return datosClinicosHistoricos;
    }

    public DatosClinicosCtrl getDatosClinicosRecientes() {
        return datosClinicosRecientes;
    }

    public void setDatosClinicosRecientes(DatosClinicosCtrl datosClinicosRecientes) {
        this.datosClinicosRecientes = datosClinicosRecientes;
    }

}
