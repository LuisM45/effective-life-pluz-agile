/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.epnmag9.effectivelifepluzma.views;

import java.io.Serializable;
import java.util.Scanner;
import net.epnmag9.effectivelifepluzma.controllers.HabitacionCtrl;
import net.epnmag9.effectivelifepluzma.controllers.HospitalCtrl;
import net.epnmag9.effectivelifepluzma.controllers.InformeCtrl;
import net.epnmag9.effectivelifepluzma.controllers.PacienteCtrl;
import net.epnmag9.effectivelifepluzma.controllers.PacientesIngresadosCtrl;
import net.epnmag9.effectivelifepluzma.controllers.VisitaCtrl;

/**
 *
 * @author Usuario
 */
public class HospitalVw implements Serializable {

    private HospitalCtrl control;
    private PacientesIngresadosVw pacientesIngresadosVw;
    private PacientesIngresadosCtrl pacientesIngresadosCtrl;
    private InformeCtrl informeCtrl;

    public HospitalVw(PacientesIngresadosVw pacientesIngresadosVw) {
        this.pacientesIngresadosVw = pacientesIngresadosVw;
    }

    public PacientesIngresadosVw getPacientesIngresadosVw() {
        return pacientesIngresadosVw;
    }

    public void setPacientesIngresadosVw(PacientesIngresadosVw pacientesIngresadosVw) {
        this.pacientesIngresadosVw = pacientesIngresadosVw;
    }

    public PacientesIngresadosCtrl getPacientesIngresadosCtrl() {
        pacientesIngresadosCtrl = new PacientesIngresadosCtrl();
        return pacientesIngresadosCtrl;
    }

    public void setControl(PacientesIngresadosCtrl control) {
        this.pacientesIngresadosCtrl = control;
    }

    public void setInformeCtrl() {
        informeCtrl = new InformeCtrl();
    }

    public static HospitalVw createHospital(PacientesIngresadosVw pacientesIngresadosVw) {
        HospitalCtrl hospitalCtrl = new HospitalCtrl();
        HospitalVw hospitalVw = new HospitalVw(pacientesIngresadosVw);
        hospitalCtrl.setView(hospitalVw);
        hospitalVw.setControl(hospitalCtrl);
        hospitalVw.getPacientesIngresadosCtrl();
        hospitalVw.setInformeCtrl();
        return hospitalVw;
    }

    public HospitalCtrl getControl() {
        return control;
    }

    public void setControl(HospitalCtrl control) {
        this.control = control;
    }

    public void putPaciente() {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el código del la habitacion");
        String codigo = s.nextLine();
        HabitacionCtrl habitacionCtrl = control.getHabitacion(codigo);
        if (habitacionCtrl == null) {
            System.out.println("La habitación especificada no existe, se va a crear.");
            habitacionCtrl = HabitacionVw.createHabitacion(codigo, this);
            control.addHabitacion(habitacionCtrl);
            informeCtrl.setHabitacionesLibres(1);
        }
        if (habitacionCtrl.getView().putPaciente()) {
            System.out.println(String.format("El paciente %s ha sido colocado en la habitación %s", habitacionCtrl.peekPaciente().getNombre(), habitacionCtrl.getCodigo()));
            informeCtrl.setPacientesIngresado(1);
            informeCtrl.setHabitacionesLibres(-1);
            informeCtrl.setHabitacionesOcupadas(1);
        }
    }

    public void popPaciente() {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el código del la habitacion");
        String codigo = s.nextLine();
        HabitacionCtrl habitacionCtrl = control.getHabitacion(codigo);
        if (habitacionCtrl == null) {
            System.out.println("La habitación especificada no existe, se va a crear.");
            habitacionCtrl = HabitacionVw.createHabitacion(codigo, this);
            control.addHabitacion(habitacionCtrl);
            informeCtrl.setHabitacionesLibres(1);
        }
        habitacionCtrl.getView().popPaciente();
        informeCtrl.setPacientesAlta(+1);
        informeCtrl.setPacientesIngresado(-1);
        informeCtrl.setHabitacionesLibres(1);
        informeCtrl.setHabitacionesOcupadas(-1);
    }

    public void peekFreeHabitaciones() {

        System.out.println("Las siguientes habitaciones estan disponibles:");
        for (HabitacionCtrl habitacionCtrl : control.checkFreeHabitacion()) {
            System.out.println(habitacionCtrl.getCodigo());
        }
        System.out.println("--------------------------------------------------------------------------------");
    }

    public void addVisita() {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el código del la habitacion");
        String codigo = s.nextLine();
        HabitacionCtrl habitacionCtrl = control.getHabitacion(codigo);
        if (habitacionCtrl == null) {
            System.out.println("La habitación especificada no existe.");
            return;
        }
        VisitaCtrl visitaCtrl = VisitaVw.createVisita(habitacionCtrl);
        control.getVisitas().add(visitaCtrl);
    }

    public void deleteVisita() {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la visita");
        String nombre = s.nextLine();
        VisitaCtrl visitaCtrl = control.getVisitaByNombre(nombre);
        System.out.println(visitaCtrl);
        if (control.getVisitaByNombre(nombre) == null) {
            System.out.println("La visita especificada no existe.");
            return;
        }
        control.getVisitasAnteriores().add(visitaCtrl);
        control.getVisitas().remove(visitaCtrl);
        System.out.println("Se registró la salida de la visita correctamente.");
    }

    public void printVisitas() {
        System.out.println("Las siguientes visitas estan presentes en el hospital:");
        for (VisitaCtrl visitaCtrl : control.getVisitas()) {
            visitaCtrl.getView().printVisita();
        }
    }

    /**
     * ****** Generacion de informes ******
     */
    public void printEntradasSalidas() {
        pacientesIngresadosVw.printEntradasSalidas();
        System.out.println("Se registraron las siguientes entradas de visitas al hospital :");
        for (VisitaCtrl visitaCtrl : control.getVisitas()) {
            visitaCtrl.getView().printVisita();
        }
        System.out.println("Se registraron las siguientes salidas de visitas del hospital :");
        for (VisitaCtrl visitaCtrl : control.getVisitasAnteriores()) {
            visitaCtrl.getView().printVisita();
        }
    }

    public void printEstadisticasHospital() {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("\t\t\tInforme general de Pacientes");
        pacientesIngresadosVw.printEstadisticasPacientes();
        System.out.println("Número total de visitas actualmente en el hospital: " + control.getVisitas().size());
        System.out.println("Número total de salida de visitas registradas: " + control.getVisitasAnteriores().size());
        System.out.println("--------------------------------------------------------------------------------");
    }

    public void printInformeHospital() {
        InformeVw informeVw = InformeVw.createInforme(informeCtrl);
        informeVw.printInformeHospital();
    }

}
