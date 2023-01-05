/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.epnmag9.effectivelifepluzma.views;

import net.epnmag9.effectivelifepluzma.controllers.HospitalCtrl;

/**
 *
 * @author Usuario
 */
public class HospitalVw {
    private HospitalCtrl control;
    private PacientesIngresadosVw pacientesIngresadosVw;

    public HospitalVw(PacientesIngresadosVw pacientesIngresadosVw) {
        this.pacientesIngresadosVw = pacientesIngresadosVw;
    }

    public PacientesIngresadosVw getPacientesIngresadosVw() {
        return pacientesIngresadosVw;
    }

    public void setPacientesIngresadosVw(PacientesIngresadosVw pacientesIngresadosVw) {
        this.pacientesIngresadosVw = pacientesIngresadosVw;
    }
    
    public HospitalCtrl getControl() {
        return control;
    }

    public void setControl(HospitalCtrl control) {
        this.control = control;
    }
    
    public void putPaciente(){
        
    }
    
    public void popPaciente(){
        
    }
    
    public void peekFreeHabitaciones(){
        
    }
}
