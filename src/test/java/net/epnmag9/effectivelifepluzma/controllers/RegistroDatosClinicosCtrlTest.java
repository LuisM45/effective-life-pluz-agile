/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
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
 * @author luism
 */
public class RegistroDatosClinicosCtrlTest {

    @Test
    public void when_datosClinicos_do_register_check_equals() {
        RegistroDatosClinicosCtrl regDatosClinicosCtrl = new RegistroDatosClinicosCtrl();
        DatosClinicosCtrl datosClinicosCtrl = new DatosClinicosCtrl(56, 1.5, 56, 76, 38.2, "02/03/2022", "N/A");
        
        regDatosClinicosCtrl.pushDatosClinicos(datosClinicosCtrl);
        assertEquals(datosClinicosCtrl,regDatosClinicosCtrl.getDatosClinicosRecientes());
    }
    
    @Test
    public void when_variousDatosClinicos_do_register_check_historic() {
        RegistroDatosClinicosCtrl regDatosClinicosCtrl = new RegistroDatosClinicosCtrl();
        DatosClinicosCtrl datosClinicosCtrl1 = new DatosClinicosCtrl(56, 1.5, 56, 76, 38.2, "02/03/2022", "N/A");
        DatosClinicosCtrl datosClinicosCtrl2 = new DatosClinicosCtrl(64, 1.2, 59, 66, 38.2, "02/02/2012", "N/A");
        
        regDatosClinicosCtrl.pushDatosClinicos(datosClinicosCtrl1);
        regDatosClinicosCtrl.pushDatosClinicos(datosClinicosCtrl2);
        assertEquals(datosClinicosCtrl2,regDatosClinicosCtrl.getDatosClinicosRecientes());
        assertEquals(datosClinicosCtrl1,regDatosClinicosCtrl.getDatosClinicosHistoricos().get(0));
    }
    
    @Test
    public void when_DatosClinicos_do_update_check_no_historic() {
        RegistroDatosClinicosCtrl regDatosClinicosCtrl = new RegistroDatosClinicosCtrl();
        DatosClinicosCtrl datosClinicosCtrl1 = new DatosClinicosCtrl(56, 1.5, 56, 76, 38.2, "02/03/2022", "N/A");
        DatosClinicosCtrl datosClinicosCtrl2 = new DatosClinicosCtrl(64, 1.2, 59, 66, 38.2, "02/02/2012", "N/A");
        
        regDatosClinicosCtrl.pushDatosClinicos(datosClinicosCtrl1);
        regDatosClinicosCtrl.updateDatosClinicos(datosClinicosCtrl2);
        assertEquals(datosClinicosCtrl2,regDatosClinicosCtrl.getDatosClinicosRecientes());
        assertEquals(0,regDatosClinicosCtrl.getDatosClinicosHistoricos().size());
    }

}
