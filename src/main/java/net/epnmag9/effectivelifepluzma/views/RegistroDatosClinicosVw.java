/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.views;

import java.io.Serializable;
import net.epnmag9.effectivelifepluzma.controllers.*;

/**
 *
 * @author luism
 */
public class RegistroDatosClinicosVw implements Serializable{
    private RegistroDatosClinicosCtrl controller;

    public RegistroDatosClinicosVw() {
    }

    public RegistroDatosClinicosVw(RegistroDatosClinicosCtrl controller) {
        this.controller = controller;
    }

    public RegistroDatosClinicosCtrl getController() {
        return controller;
    }

    public void setController(RegistroDatosClinicosCtrl controller) {
        this.controller = controller;
    }
    
    public void addDatosClinicos(){
        controller.pushDatosClinicos(DatosClinicosVw.createDatosClinicos());
    }
    public void updateDatosClinicos(){
        controller.updateDatosClinicos(DatosClinicosVw.createDatosClinicos());
    }
}
