/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.epnmag9.effectivelifepluzma.views;

import java.io.Serializable;
import java.util.Scanner;
import net.epnmag9.effectivelifepluzma.controllers.*;

public class PacienteVw implements Serializable{
    private PacienteCtrl controller;

    public PacienteVw() {
    }

    public PacienteVw(PacienteCtrl controller) {
        this.controller = controller;
    }
    
    
    public void mostrarPaciente(){
        String formato = """
                         %s
                         Fecha de nacimiento: %s
                         Número de cédula: %s
                         Tipo de sangre: %s
                         Sexo: %s
                         """;
        System.out.println(String.format(formato,
                controller.getNombre(),
                controller.getFechaNacimiento(),
                controller.getCedula(),
                controller.getTipoSangre(),
                controller.getSexo()));
        System.out.println("--------------------------------------------------------------------------------");
    }
    
    public void mostrarResumenPaciente() {
        String formato = """
                         %s
                         Número de cédula: %s
                         Número de visitas: %s
                         """;
        System.out.println(String.format(formato,
                controller.getNombre(),
                controller.getCedula(),
                controller.getNumeroVisitas()));
        System.out.println("--------------------------------------------------------------------------------");
    }
    

    public PacienteCtrl getController() {
        return controller;
    }

    public void setController(PacienteCtrl controller) {
        this.controller = controller;
    }
    
    public static PacienteCtrl crearPaciente(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Ingrese el número de cédula del paciente: ");
        String cedula = scn.nextLine();
        System.out.print("Ingrese el nombre del paciente: ");
        String nombre = scn.nextLine();
        System.out.print("Ingrese la fecha de nacimiento del paciente: ");
        String fechaNacimiento = scn.nextLine();
        System.out.print("Ingrese el tipo de sangre del paciente: ");
        String tipoSangre = scn.nextLine();
        System.out.print("Ingrese el sexo del paciente: ");
        String sexo = scn.nextLine();

        PacienteCtrl pacienteCtrl = new PacienteCtrl(cedula, nombre, fechaNacimiento, tipoSangre, sexo);
        PacienteVw pacienteVw = new PacienteVw(pacienteCtrl);
        pacienteCtrl.setView(pacienteVw);
        
        System.out.print("Se ha ingresado el paciente correctamente.");

        
        return pacienteCtrl;
    }
}
