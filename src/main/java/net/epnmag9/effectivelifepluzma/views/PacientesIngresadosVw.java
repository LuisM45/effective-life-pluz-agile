/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.epnmag9.effectivelifepluzma.views;

import net.epnmag9.effectivelifepluzma.controllers.*;

/**
 *
 * @author Usuario
 */
public class PacientesIngresadosVw {
    private PacientesIngresadosCtrl controller;

    public PacientesIngresadosVw(PacientesIngresadosCtrl controller) {
        this.controller = controller;
    }

    public PacientesIngresadosVw() {
    }

    public PacientesIngresadosCtrl getController() {
        return controller;
    }

    public void setController(PacientesIngresadosCtrl controlador) {
        this.controller = controlador;
    }

    public static PacientesIngresadosVw createPacientesIngresados(){
        PacientesIngresadosCtrl pacientesIngresadosCtrl = new PacientesIngresadosCtrl();
        PacientesIngresadosVw pacientesIngresadosVw = new PacientesIngresadosVw(pacientesIngresadosCtrl);
        pacientesIngresadosCtrl.setView(pacientesIngresadosVw);
        return  pacientesIngresadosVw;
    }
    
    public void registrarPaciente(){
        PacienteCtrl pacienteCtrl = PacienteVw.crearPaciente();
        controller.addPaciente(pacienteCtrl);
    }
}
