/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.views;

import java.io.Serializable;
import net.epnmag9.effectivelifepluzma.controllers.InformeCtrl;

/**
 *
 * @author Steven
 */
public class InformeVw implements Serializable {

    private InformeCtrl controller;

    public InformeVw(InformeCtrl controller) {
        this.controller = controller;
    }

    public InformeVw() {
    }

    public InformeCtrl getController() {
        return controller;
    }

    public void setController(InformeCtrl controller) {
        this.controller = controller;
    }

    public static InformeVw createInforme(InformeCtrl informeCtrl) {
        InformeVw informeVw = new InformeVw(informeCtrl);
        informeCtrl.setView(informeVw);
        return informeVw;
    }

    public void printInformeHospital() {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("\t\t\tInforme general del hospital");
        System.out.println("Número total de pacientes actualmente ingresados: " + controller.getPacientesIngresado());
        System.out.println("Número total de pacientes dados de alta: " + controller.getPacientesAlta());
        System.out.println("Número total de habiltaciones libres: " + controller.getHabitacionesLibres());
        System.out.println("Número total de habiltaciones ocupadas: " + controller.getHabitacionesOcupadas());
        System.out.println("--------------------------------------------------------------------------------");
    }

}
