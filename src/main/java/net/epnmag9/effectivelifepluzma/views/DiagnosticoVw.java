/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.views;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Scanner;
import net.epnmag9.effectivelifepluzma.controllers.*;

/**
 *
 * @author thoma
 */
public class DiagnosticoVw implements Serializable {

    private DiagnosticoCtrl controller;

    public void DiagnositocVw() {
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
    
     public static DiagnosticoCtrl createDiagnostico(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Ingrese el nombre del doctor: ");
        String doctor = scn.nextLine();
        System.out.print("Ingrese el diagnostico: ");
        String diagnostico = scn.nextLine();
        System.out.print("Ingrese la fecha del diagnostico: ");
        String fechaDiagnostico = scn.nextLine();
        
        DiagnosticoCtrl diagnosticoCtrl = new DiagnosticoCtrl(doctor, diagnostico, fechaDiagnostico);
        DiagnosticoVw diagnosticoVw = new DiagnosticoVw(diagnosticoCtrl);
        diagnosticoCtrl.setVista(diagnosticoVw);
        
        System.out.print("Se ha registrado los datos correctamente.");

        return diagnosticoCtrl;
    }
}
