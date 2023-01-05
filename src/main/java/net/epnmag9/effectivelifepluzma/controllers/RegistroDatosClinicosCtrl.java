/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.controllers;

import java.util.List;
import net.epnmag9.effectivelifepluzma.models.RegistroDatosClinicosMdl;
import net.epnmag9.effectivelifepluzma.views.RegistroDatosClinicosVw;

/**
 *
 * @author luism
 */
public class RegistroDatosClinicosCtrl {
    private RegistroDatosClinicosMdl model;
    private RegistroDatosClinicosVw view;

    public RegistroDatosClinicosCtrl() {
        model = new RegistroDatosClinicosMdl();
    }

    public RegistroDatosClinicosVw getView() {
        return view;
    }

    public void setView(RegistroDatosClinicosVw view) {
        this.view = view;
    }

    public void pushDatosClinicos(DatosClinicosCtrl datosClinicosCtrl){
        DatosClinicosCtrl datosRecientes = model.getDatosClinicosRecientes();
        if(datosRecientes!=null)
            model.getDatosClinicosHistoricos().add(datosRecientes);
        
        model.setDatosClinicosRecientes(datosClinicosCtrl);
    }
    
    public void updateDatosClinicos(DatosClinicosCtrl datosClinicosCtrl){
        model.setDatosClinicosRecientes(datosClinicosCtrl);
    }
    
    public List<DatosClinicosCtrl> getDatosClinicosHistoricos() {
        return model.getDatosClinicosHistoricos();
    }

    public DatosClinicosCtrl getDatosClinicosRecientes() {
        return model.getDatosClinicosRecientes();
    }
}
