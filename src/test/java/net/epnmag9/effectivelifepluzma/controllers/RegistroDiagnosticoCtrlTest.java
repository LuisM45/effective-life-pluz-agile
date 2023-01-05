/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.controllers;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thomas Tapia
 */
public class RegistroDiagnosticoCtrlTest {
    
    @Test
    public void when_diagnostico_do_register_check_equals(){
        RegistroDiagnosticoCtrl regDiagnosticoCtrl = new RegistroDiagnosticoCtrl();
        DiagnosticoCtrl diagnosticoCtrl = new DiagnosticoCtrl("Juan", "Faringitis", "01/01/2023");
        
        regDiagnosticoCtrl.pushDiagnostico(diagnosticoCtrl);
        assertEquals(diagnosticoCtrl, regDiagnosticoCtrl.getDiagnosticoRecientes());
    }
    
}
