package net.epnmag9.effectivelifepluzma.controllers;

import net.epnmag9.effectivelifepluzma.models.PacientesIngresadosMdl;
import net.epnmag9.effectivelifepluzma.views.PacientesIngresadosVw;

public class PacientesIngresadosCtrl {
    private final PacientesIngresadosVw view;
    private final PacientesIngresadosMdl model;

    public PacientesIngresadosCtrl(PacientesIngresadosVw view, PacientesIngresadosMdl model) {
        this.view = view;
        this.model = model;
    }
    
    
}
