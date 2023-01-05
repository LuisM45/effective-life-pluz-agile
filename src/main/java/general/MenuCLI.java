/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package general;

import java.util.Scanner;

/**
 *
 * @author luism
 */
public class MenuCLI {
    private final Scanner scn = new Scanner(System.in);
    
    final static String mainMenu = 
              """
              0. Salir
              Ingrese la acción a realizar: """;
    
    public void run(){
        while (true) {
            System.out.println(mainMenu);
            switch (scn.nextLine()) {
                case "0":
                    System.exit(0);
                    break;
                default:;
            }
        }
    }
}
