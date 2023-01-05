/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.epnmag9.effectivelifepluzma.views;

import java.util.Scanner;
import net.epnmag9.effectivelifepluzma.controllers.*;

public class PacienteVw {
    private PacienteCtrl controlador;

    public PacienteVw() {
    }

    public PacienteVw(PacienteCtrl controlador) {
        this.controlador = controlador;
    }
    
    
    public void mostrarPaciente(){
        String formato = """
                         %s
                         Fecha de nacimiento: %s
                         Tipo de sangre: %s
                         Sexo: %s
                         """;
        System.out.println(String.format(formato,
                controlador.getNombre(),
                controlador.getFechaNacimiento(),
                controlador.getTipoSangre(),
                controlador.getSexo()));
        System.out.println("--------------------------------------------------------------------------------");
    }

    public PacienteCtrl getControlador() {
        return controlador;
    }

    public void setControlador(PacienteCtrl controlador) {
        this.controlador = controlador;
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
        pacienteCtrl.setPacienteVw(pacienteVw);
        
        return pacienteCtrl;
    }
}
