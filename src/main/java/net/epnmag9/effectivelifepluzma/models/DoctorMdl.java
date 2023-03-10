/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import net.epnmag9.effectivelifepluzma.controllers.TareaCtrl;

/**
 *
 * @author Steven
 */
public class DoctorMdl implements Serializable{
    private String nombre;
    private String CI;
    private List<TareaCtrl> tareas;

    public DoctorMdl(String nombre, String CI) {
        this.nombre = nombre;
        this.CI = CI;
        this.tareas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public List<TareaCtrl> getTareas() {
        return tareas;
    }

    public void setTareas(List<TareaCtrl> tareas) {
        this.tareas = tareas;
    }
    
}
