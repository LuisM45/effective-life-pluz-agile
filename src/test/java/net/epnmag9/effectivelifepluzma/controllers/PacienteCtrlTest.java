/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.controllers;

import org.junit.Test;
import static org.junit.Assert.*;

public class PacienteCtrlTest {

    @Test
    public void when_pacienteData_do_register_check_ok() {
        String cedula = "123456787";
        String nombre = "Ruth Benavides";
        String fechaNacimiento = "02/03/1975";
        String tipoSangre = "A+";
        String sexo = "F";
        
        PacienteCtrl pacienteCtrl = new PacienteCtrl(cedula,nombre,fechaNacimiento,tipoSangre,sexo);
        
        assertEquals(pacienteCtrl.getCedula(), cedula);
        assertEquals(pacienteCtrl.getNombre(), nombre);
        assertEquals(pacienteCtrl.getFechaNacimiento(), fechaNacimiento);
        assertEquals(pacienteCtrl.getTipoSangre(), tipoSangre);
        assertEquals(pacienteCtrl.getSexo(), sexo);
    }
    
}
