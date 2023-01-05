/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.epnmag9.effectivelifepluzma.views;

import java.util.List;
import java.util.Scanner;
import net.epnmag9.effectivelifepluzma.controllers.HabitacionCtrl;
import net.epnmag9.effectivelifepluzma.controllers.PacienteCtrl;

/**
 *
 * @author Usuario
 */
public class HabitacionVw {
    private HabitacionCtrl controller;
    private PacientesIngresadosVw pacientesView;

    public HabitacionVw(PacientesIngresadosVw pacientesView) {
    }

    public HabitacionVw(HabitacionCtrl controller) {
        this.controller = controller;
    }

    public HabitacionCtrl getController() {
        return controller;
    }

    public void setController(HabitacionCtrl controller) {
        this.controller = controller;
    }
    
    public void putPaciente(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Ingrese la cedula del paciente: ");
        String ci = scn.nextLine();
        PacienteCtrl pacienteCtrl = pacientesView.getController().searchPacienteByCedula(ci);
        if(pacienteCtrl == null){
            System.out.println("No existe tal paciente");
            return;
        }
        if(!controller.putPaciente(pacienteCtrl)){
            System.out.println("Este cuarto ya tiene paciente");

        }
    }
    
    public void peekPaciente(){
        if(controller.peekPaciente()!=null){
            System.out.println("Este cuarto ya tiene paciente");
        }
    }
    
    public void popPaciente(){
        PacienteCtrl p = controller.popPaciente();
        if((p==null)){
            System.out.println("Este cuarto no tiene paciente");
        }
        else{
            System.out.println(String.format("El paciente %s fue dado de alta",p.getNombre()));
        }
    }
}
