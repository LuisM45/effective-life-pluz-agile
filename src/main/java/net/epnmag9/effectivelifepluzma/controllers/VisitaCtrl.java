/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.controllers;

import java.io.Serializable;
import net.epnmag9.effectivelifepluzma.models.VisitaMdl;
import net.epnmag9.effectivelifepluzma.views.VisitaVw;

/**
 *
 * @author luism
 */
public class VisitaCtrl implements Serializable {

    private VisitaMdl model;
    private VisitaVw view;

    public VisitaCtrl(String name, HabitacionCtrl habitacionCtrl) {
        model = new VisitaMdl(name, habitacionCtrl);
    }

    public VisitaVw getView() {
        return view;
    }

    public void setView(VisitaVw view) {
        this.view = view;
    }

    public String getName() {
        return model.getName();
    }

    public HabitacionCtrl getHabitacionCtrl() {
        return model.getHabitacionCtrl();
    }

}
