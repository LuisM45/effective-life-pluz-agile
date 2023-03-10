/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.epnmag9.effectivelifepluzma.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import net.epnmag9.effectivelifepluzma.controllers.DoctorCtrl;
import net.epnmag9.effectivelifepluzma.controllers.HabitacionCtrl;
import net.epnmag9.effectivelifepluzma.controllers.VisitaCtrl;

/**
 *
 * @author Usuario
 */
public class HospitalMdl implements Serializable{
    private List<HabitacionCtrl> habitaciones;
    private List<VisitaCtrl> visitas;
    private List<VisitaCtrl> visitasAnteriores;
    private List<DoctorCtrl> doctores;

    public HospitalMdl() {
        habitaciones = new ArrayList<>();
        visitas = new LinkedList<>();
        visitasAnteriores = new LinkedList<>();
        doctores = new LinkedList<>();
    }

    public List<HabitacionCtrl> getHabitaciones() {
        return habitaciones;
    }

    public List<VisitaCtrl> getVisitas() {
        return visitas;
    }
    
    public List<VisitaCtrl> getVisitasAnteriores() {
        return visitasAnteriores;
    }

    public List<DoctorCtrl> getDoctores() {
        return doctores;
    }   
    
}
