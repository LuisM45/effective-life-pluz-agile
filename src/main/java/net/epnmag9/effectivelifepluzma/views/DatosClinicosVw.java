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
 * @author luism
 */
public class DatosClinicosVw implements Serializable{
    private DatosClinicosCtrl controller;

    public DatosClinicosVw() {
    }
    
    public DatosClinicosVw(DatosClinicosCtrl controller) {
        this.controller = controller;
    }

    public DatosClinicosCtrl getController() {
        return controller;
    }

    public void setController(DatosClinicosCtrl controller) {
        this.controller = controller;
    }
    
    public static DatosClinicosCtrl createDatosClinicos(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Ingrese el peso actual del paciente: ");
        double peso = Double.parseDouble(scn.nextLine());
        System.out.print("Ingrese la altura actual del paciente: ");
        double altura = Double.parseDouble(scn.nextLine());
        System.out.print("Ingrese la presión sistólica actual del paciente: ");
        double presionSistolica = Double.parseDouble(scn.nextLine());
        System.out.print("Ingrese la presión diastólica actual del paciente: ");
        double presionDiastolica = Double.parseDouble(scn.nextLine());
        System.out.print("Ingrese la temperatura actual del paciente: ");
        double temperatura = Double.parseDouble(scn.nextLine());
        System.out.print("Ingrese la fecha de ingreso del paciente: ");
        String fechaIngreso = scn.nextLine();
        System.out.print("Ingrese la observaciones adicionales (Si existiese): ");
        String observaciones = scn.nextLine();
        
        DatosClinicosCtrl datosClinicosCtrl = new DatosClinicosCtrl(peso, altura, presionSistolica, presionDiastolica, temperatura, fechaIngreso, observaciones);
        DatosClinicosVw datosClinicosVw = new DatosClinicosVw(datosClinicosCtrl);
        datosClinicosCtrl.setVista(datosClinicosVw);
        
        System.out.print("Se ha registrado los datos correctamente.");

        
        return datosClinicosCtrl;
    }
}
