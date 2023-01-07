/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.views;

import java.io.Serializable;
import java.util.Scanner;
import net.epnmag9.effectivelifepluzma.controllers.DoctorCtrl;
import net.epnmag9.effectivelifepluzma.controllers.TareaCtrl;
import net.epnmag9.effectivelifepluzma.models.DoctorMdl;
import net.epnmag9.effectivelifepluzma.models.TareaMdl;

/**
 *
 * @author Steven
 */
public class DoctorVw implements Serializable {

    private DoctorCtrl doctorCtrl;
    private TareaVw tareaVw = new TareaVw();

    public DoctorVw(DoctorCtrl controller) {
        this.doctorCtrl= controller;
    }

    public DoctorVw() {
    }

    public DoctorCtrl getController() {
        return doctorCtrl;
    }

    public void setController(DoctorCtrl controller) {
        this.doctorCtrl = controller;
    }
    
    public void MostrarDoctor(DoctorCtrl doctor) {
        String formato = """
                         Nombre del médico: %s
                         Número de cédula: %s
                         Tarea desiganda: """;
        System.out.println(String.format(formato,
                doctor.getNombre(),
                doctor.getCI()));
        for(TareaCtrl tarea: doctor.getTareas()){
            tareaVw.mostrarTarea(tarea);
        }
        System.out.println("--------------------------------------------------------------------------------");

    }

    public static DoctorCtrl createDoctor(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Ingrese el nombre del doctor: ");
        String name = scn.nextLine();
        System.out.print("Ingrese el CI del doctor: ");
        String CI = scn.nextLine();
        DoctorCtrl doctor = new DoctorCtrl(name, CI);
        DoctorVw doctorVw = new DoctorVw(doctor);
        doctor.setView(doctorVw);
        doctorVw.agregarTarea();
        System.out.println("Se ha registrado correctamente al doctor"); 
        return doctor;
    }
    
    public void agregarTarea(){
        TareaCtrl tareaCtrl = TareaVw.createTarea(doctorCtrl);
    }

}
