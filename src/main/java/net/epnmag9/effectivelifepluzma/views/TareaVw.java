/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.views;

import java.io.Serializable;
import java.util.Scanner;
import net.epnmag9.effectivelifepluzma.controllers.DoctorCtrl;
import net.epnmag9.effectivelifepluzma.controllers.TareaCtrl;
import net.epnmag9.effectivelifepluzma.models.TareaMdl;

/**
 *
 * @author Steven
 */
public class TareaVw implements Serializable {

    private TareaCtrl controller;

    public TareaVw(TareaCtrl controller) {
        this.controller = controller;
    }

    public TareaVw() {
    }

    public TareaCtrl getController() {
        return controller;
    }

    public void setController(TareaCtrl controller) {
        this.controller = controller;
    }

    public static TareaCtrl createTarea(DoctorCtrl doctorCtrl) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Ingrese la descripcion de la tarea: ");
        String desc = scn.nextLine();
        System.out.print("Ingrese el estado de la tarea:: ");
        String state = scn.nextLine();
        TareaCtrl tareaCtrl = new TareaCtrl(desc, state, doctorCtrl);
        TareaVw visitaVw = new TareaVw(tareaCtrl);
        tareaCtrl.setView(visitaVw);
        doctorCtrl.addTarea(tareaCtrl);
        System.out.println("Se ha registrado correctamente la tarea");
        return tareaCtrl;
    }

    public void mostrarTarea(TareaCtrl tarea) {
        System.out.println("Descripcion de la tarea: " + tarea.getDescripcion());
        System.out.println("Estado de la tarea: " + tarea.getEstado());
    }

}
