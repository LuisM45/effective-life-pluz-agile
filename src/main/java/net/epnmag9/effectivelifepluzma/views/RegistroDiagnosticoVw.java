/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.views;

import java.io.Serializable;
import net.epnmag9.effectivelifepluzma.controllers.*;
/**
 *
 * @author Thomas Tapia
 */
public class RegistroDiagnosticoVw implements Serializable{
    private RegistroDiagnosticoCtrl controller;

    public RegistroDiagnosticoVw(){
    }
    
    public RegistroDiagnosticoVw(RegistroDiagnosticoCtrl controller){
        this.controller = controller;
    }
    
}