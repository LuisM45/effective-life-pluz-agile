/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.epnmag9.effectivelifepluzma.views;

import java.io.Serializable;
import java.util.Scanner;
import net.epnmag9.effectivelifepluzma.controllers.*;

/**
 *
 * @author Usuario
 */
public class PacientesIngresadosVw implements Serializable{
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
        System.out.println("Se ha registrado el paciente al sistema correctamente.");

    }
    
    public void addDatosClinicos(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Ingrese la cedula del paciente: ");
        String ci = scn.nextLine();
        PacienteCtrl pacienteCtrl = controller.searchPacienteByCedula(ci);
        if(pacienteCtrl == null){
            System.out.println("No existe tal paciente");
            return;
        }
        pacienteCtrl.getRegistroDatosClinicos().getView().addDatosClinicos();
        System.out.println("Datos añadidos exitosamente: ");
    }
    
    public void updateDatosClinicos(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Ingrese la cedula del paciente: ");
        String ci = scn.nextLine();
        PacienteCtrl pacienteCtrl = controller.searchPacienteByCedula(ci);
        if(pacienteCtrl == null){
            System.out.println("No existe tal paciente");
            return;
        }
        pacienteCtrl.getRegistroDatosClinicos().getView().updateDatosClinicos();
        System.out.println("Datos actualizados exitosamente.");
    }
    
    public void showHistorialClinico(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Ingrese la cedula del paciente: ");
        String ci = scn.nextLine();
        PacienteCtrl pacienteCtrl = controller.searchPacienteByCedula(ci);
        if (pacienteCtrl == null){
            System.err.println("No existe tal paciente.");
            return;
        }
        pacienteCtrl.getRegistroDatosClinicos().getDatosClinicosRecientes().getVista().printDatosClinicos();
        
    }
    
    public void addDiagnostico(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Ingrese la cedula del paciente: ");
        String ci = scn.nextLine();
        PacienteCtrl pacienteCtrl = controller.searchPacienteByCedula(ci);
        if(pacienteCtrl == null){
            System.out.println("No existe tal paciente");
            return;
        }
        pacienteCtrl.getRegistroDiagnostico().getView().addDiagnostico();
        System.out.println("Datos añadidos exitosamente: ");
    }
    
    public void showDiagnostico(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Ingrese la cedula del paciente: ");
        String ci = scn.nextLine();
        PacienteCtrl pacienteCtrl = controller.searchPacienteByCedula(ci);
        if (pacienteCtrl == null){
            System.err.println("No existe tal paciente.");
            return;
        }
        pacienteCtrl.getRegistroDiagnostico().getDiagnosticoRecientes().getView().printDiagnostico();
        
    }
    
}
