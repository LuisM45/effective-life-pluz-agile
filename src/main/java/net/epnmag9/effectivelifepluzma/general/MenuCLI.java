/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.general;

import java.util.Scanner;
import net.epnmag9.effectivelifepluzma.views.PacientesIngresadosVw;

/**
 *
 * @author luism
 */
public class MenuCLI {
    private final Scanner scn = new Scanner(System.in);
    private final PacientesIngresadosVw pacientesIngresadosVw = PacientesIngresadosVw.createPacientesIngresados();
    
    final static String mainMenu = 
              """
              1. Ingresar Paciente
              0. Salir
              Ingrese la acción a realizar: """;
    
    public void run(){
        while (true) {
            System.out.println(mainMenu);
            switch (scn.nextLine()) {
                case "0":
                    System.exit(0);
                    break;
                case "1":
                    pacientesIngresadosVw.registrarPaciente();
                    break;
                default:;
            }
        }
    }
}
