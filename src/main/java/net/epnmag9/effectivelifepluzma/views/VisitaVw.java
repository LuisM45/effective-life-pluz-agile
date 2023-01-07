/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.views;

import java.io.Serializable;
import java.util.Scanner;
import net.epnmag9.effectivelifepluzma.models.*;
import net.epnmag9.effectivelifepluzma.controllers.*;

/**
 *
 * @author luism
 */
public class VisitaVw  implements Serializable{
    private VisitaCtrl controller;

    public VisitaVw(VisitaCtrl controller) {
        this.controller = controller;
    }

    public VisitaVw() {
    }

    public VisitaCtrl getController() {
        return controller;
    }

    public void setController(VisitaCtrl controller) {
        this.controller = controller;
    }
    
    public void printVisita() {
        String format = "%s en la habitación %s";
        System.out.println(String.format(format,
                controller.getName(),
                controller.getHabitacionCtrl().getCodigo()));
    }

    public static VisitaCtrl createVisita(HabitacionCtrl habitacionCtrl){
        Scanner scn = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la visita: ");
        String name = scn.nextLine();
        VisitaCtrl visitaCtrl = new VisitaCtrl(name, habitacionCtrl);
        VisitaVw visitaVw = new VisitaVw(visitaCtrl);
        visitaCtrl.setView(visitaVw);
        habitacionCtrl.registrarVisita();
        System.out.println(String.format("Se ha registrado correctamente %s como visita a la habitación %s",
                name,habitacionCtrl.getCodigo()));
        return visitaCtrl;
    }
    
    
}
