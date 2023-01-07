/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.epnmag9.effectivelifepluzma.views;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;
import net.epnmag9.effectivelifepluzma.controllers.HabitacionCtrl;
import net.epnmag9.effectivelifepluzma.controllers.PacienteCtrl;

/**
 *
 * @author Usuario
 */
public class HabitacionVw implements Serializable{
    private HabitacionCtrl controller;
    private PacientesIngresadosVw pacientesView;

    public HabitacionVw(PacientesIngresadosVw pacientesView) {
        this.pacientesView = pacientesView;
    }

    public HabitacionVw(HabitacionCtrl controller, PacientesIngresadosVw pacientesView) {
        this.controller = controller;
        this.pacientesView = pacientesView;
    }
    
    public static HabitacionVw createHabitacion(PacientesIngresadosVw pacientesIngresadosVw, String codigo) {
        HabitacionVw habitacionVw = new HabitacionVw(pacientesIngresadosVw);
        HabitacionCtrl habitacionCtrl = new HabitacionCtrl(codigo);
        habitacionVw.setController(habitacionCtrl);
        habitacionCtrl.setView(habitacionVw);
        return habitacionVw;
    }

    public PacientesIngresadosVw getPacientesView() {
        return pacientesView;
    }

    public void setPacientesView(PacientesIngresadosVw pacientesView) {
        this.pacientesView = pacientesView;
    }

    public void setController(HabitacionCtrl controller) {
        this.controller = controller;
    }
    
    public boolean putPaciente(){
        if(!controller.isEmpty()){
            System.out.println("Este cuarto ya tiene paciente");
            return false;
        }
        
        Scanner scn = new Scanner(System.in);
        System.out.print("Ingrese la cedula del paciente: ");
        String ci = scn.nextLine();
        PacienteCtrl pacienteCtrl = pacientesView.getController().searchPacienteByCedula(ci);
        if(pacienteCtrl == null){
            System.out.println("No existe tal paciente");
            return false;
        }
        controller.putPaciente(pacienteCtrl);
        return true;
    }
    
    public void peekPaciente(){
        if(controller.peekPaciente()!=null){
            System.out.println("Este cuarto ya tiene paciente");
        }
    }
    
    public PacienteCtrl popPaciente(){
        PacienteCtrl p = controller.popPaciente();
        if((p==null)){
            System.out.println("Este cuarto no tiene paciente");
        }
        else{
            System.out.println(String.format("El paciente %s fue dado de alta",p.getNombre()));
        }
        pacientesView.getController().getPacientes().remove(p);
        pacientesView.getController().addSalidas(p);
        return p;
    }
    
    public static HabitacionCtrl createHabitacion(String codigo,HospitalVw hospitalVw){
        HabitacionCtrl habitacionCtrl = new HabitacionCtrl(codigo);
        habitacionCtrl.setView(new HabitacionVw(habitacionCtrl,hospitalVw.getPacientesIngresadosVw()));
        return habitacionCtrl;
        
    }
}
