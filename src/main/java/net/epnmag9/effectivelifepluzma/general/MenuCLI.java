/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.general;

import java.io.Serializable;
import java.util.Scanner;
import net.epnmag9.effectivelifepluzma.views.PacientesIngresadosVw;

/**
 *
 * @author luism
 */
public class MenuCLI implements Serializable{
    private static final Scanner scn = new Scanner(System.in);
    private final PacientesIngresadosVw pacientesIngresadosVw = PacientesIngresadosVw.createPacientesIngresados();
    
    final static String mainMenu = 
              """
              1. Ingresar Paciente
              2. Agregar Datos Clinicos
              3. Actualizar Datos Clinicos
              4. Visualizar Historial Clinico
              5. Agregar Diagnostico
              0. Salir
              Ingrese la acción a realizar: """;
    
    public void run(){
        while (true) {
            Main.save(this);
            System.out.println(mainMenu);
            switch (scn.nextLine()) {
                case "0":
                    System.exit(0);
                    break;
                case "1":
                    pacientesIngresadosVw.registrarPaciente();
                    break;
                case "2":
                    pacientesIngresadosVw.addDatosClinicos();
                    break;
                case "3":
                    pacientesIngresadosVw.updateDatosClinicos();
                    break;
                case "4":
                    pacientesIngresadosVw.showHistorialClinico();
                    break;
                case "5":
                    pacientesIngresadosVw.addDiagnostico();
                default:;
            }
        }
    }
}
