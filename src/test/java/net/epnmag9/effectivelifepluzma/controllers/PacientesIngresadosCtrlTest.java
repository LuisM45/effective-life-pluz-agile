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
public class PacientesIngresadosCtrlTest {

    public PacientesIngresadosCtrlTest() {
    }

    @Test
    public void when_paciente_do_add_check_insertion() {
        String cedula = "123456787";
        String nombre = "Ruth Benavides";
        String fechaNacimiento = "02/03/1975";
        String tipoSangre = "A+";
        String sexo = "F";

        PacienteCtrl pacienteCtrl = new PacienteCtrl(cedula, nombre, fechaNacimiento, tipoSangre, sexo);
        PacientesIngresadosCtrl pic = new PacientesIngresadosCtrl();
        pic.addPaciente(pacienteCtrl);

        int pacienteIdx = pic.getPacientes().indexOf(pacienteCtrl);
        assertTrue(pacienteIdx >= 0);
    }

    @Test
    public void when_paciente_do_remove_then_add_to_salidas() {
        String cedula = "123456787";
        String nombre = "Ruth Benavides";
        String fechaNacimiento = "02/03/1975";
        String tipoSangre = "A+";
        String sexo = "F";

        PacienteCtrl pacienteCtrl = new PacienteCtrl(cedula, nombre, fechaNacimiento, tipoSangre, sexo);
        PacientesIngresadosCtrl pic = new PacientesIngresadosCtrl();
        pic.addSalidas(pacienteCtrl);

        assertEquals(1, pic.getPacientesAntiguos().size());
    }
}
