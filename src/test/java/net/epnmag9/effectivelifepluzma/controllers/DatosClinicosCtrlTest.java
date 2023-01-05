/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
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
 * @author luism
 */
public class DatosClinicosCtrlTest{
    
    @Test
    public void when_datosClinicos_do_create_check_equals() {
        double peso = 56;
        double altura = 1.4;
        double presionSistolica = 67;
        double presionDiastolica = 76;
        double temperatura = 38.5;
        String fechaIngreso = "01/04/2020";
        String observaciones = "N/A";
        
        DatosClinicosCtrl datosClinicosCtrl = new DatosClinicosCtrl(peso, altura, presionSistolica, presionDiastolica, temperatura, fechaIngreso, observaciones);        
        assertEquals(peso, datosClinicosCtrl.getPeso(),0);
        assertEquals(altura, datosClinicosCtrl.getAltura(),0);
        assertEquals(presionSistolica, datosClinicosCtrl.getPresionSistolica(),0);
        assertEquals(presionDiastolica, datosClinicosCtrl.getPresionDiastolica(),0);
        assertEquals(temperatura, datosClinicosCtrl.getTemperatura(),0);
        assertEquals(fechaIngreso, datosClinicosCtrl.getFechaIngreso());
        assertEquals(observaciones, datosClinicosCtrl.getObservaciones());
    }
    
}
