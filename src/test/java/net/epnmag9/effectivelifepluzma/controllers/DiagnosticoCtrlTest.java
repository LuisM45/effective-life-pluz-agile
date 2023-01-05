/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.controllers;

import java.io.Serializable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thoma
 */
public class DiagnosticoCtrlTest {
    
    @Test
    public void when_datosClinicos_do_create_check_equals(){
        String diagnostico = "El paciente tiene Amigdalitis";
        String doctor = "Julio";
        String fechaDiagnostico = "01/01/2023";
        DiagnosticoCtrl diagnosticoCtrl = new DiagnosticoCtrl(doctor, diagnostico, fechaDiagnostico);
        assertEquals(doctor, diagnosticoCtrl.getDoctor());
        assertEquals(diagnostico, diagnosticoCtrl.getDiagnostico());
        assertEquals(fechaDiagnostico, diagnosticoCtrl.getFechaDiagnostico());
    }
            
}
