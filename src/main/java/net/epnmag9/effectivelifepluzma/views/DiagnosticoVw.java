/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.views;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import net.epnmag9.effectivelifepluzma.controllers.*;

/**
 *
 * @author thoma
 */
public class DiagnosticoVw implements Serializable {
    private DiagnosticoCtrl controller;

    public DiagnosticoVw() {
    }

    public DiagnosticoVw(DiagnosticoCtrl controller) {
        this.controller = controller;
    }

    public DiagnosticoCtrl getController() {
        return controller;
    }

    public void setController(DiagnosticoCtrl controller) {
        this.controller = controller;
    }
    
     public void printDiagnostico(){
        String formato = """
                         Doctor: %s
                         Diagnostico: %s
                         Prescripion: %s
                         Fecha Diagnostico: %s
                         """;
        System.out.println(String.format(formato,
                controller.getDoctor(),
                controller.getDiagnostico(),
                controller.getPrescripcion(),
                controller.getFechaDiagnostico()));
        System.out.println("--------------------------------------------------------------------------------");
    }
    
    public static DiagnosticoCtrl createDiagnostico(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Ingrese el nombre del doctor: ");
        String doctor = scn.nextLine();
        System.out.print("Ingrese el diagnostico: ");
        String diagnostico = scn.nextLine();
        System.out.print("Ingrese la prescripcion:");
        String prescripcion = scn.nextLine();
        System.out.print("Ingrese la fecha del diagnostico: ");
        String fechaDiagnostico = scn.nextLine();
        
        DiagnosticoCtrl diagnosticoCtrl = new DiagnosticoCtrl(doctor, diagnostico,prescripcion, fechaDiagnostico);
        DiagnosticoVw diagnosticoVw = new DiagnosticoVw(diagnosticoCtrl);
        diagnosticoCtrl.setVista(diagnosticoVw);
        
        System.out.print("Se ha registrado los datos correctamente.");

        return diagnosticoCtrl;
    }
    
    public static void printSugerenciaDiagnostico(PacienteCtrl pacienteCtrl){
        List<String> sugerencias = DiagnosticoCtrl.getSugerenciasDiagnostico(pacienteCtrl);
        if(sugerencias.isEmpty()){
            System.out.println("No existen sugerencias para el diagnostico");
            return;
        }
        for(String s: sugerencias){
            System.out.println(String.format("El paciente tiene %s",s.toLowerCase()));
            return;
        }
    }
}
