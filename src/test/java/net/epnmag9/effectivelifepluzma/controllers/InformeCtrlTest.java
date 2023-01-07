/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Steven
 */
public class InformeCtrlTest {
    
    
    @Test
    public void when_paciente_do_add_check_informe_pacientes_ingresados() {
        String cedula = "123456787";
        String nombre = "Ruth Benavides";
        String fechaNacimiento = "02/03/1975";
        String tipoSangre = "A+";
        String sexo = "F";

        PacienteCtrl pacienteCtrl = new PacienteCtrl(cedula, nombre, fechaNacimiento, tipoSangre, sexo);
        PacientesIngresadosCtrl pic = new PacientesIngresadosCtrl();
        pic.addPaciente(pacienteCtrl);
        InformeCtrl  informeCtrl = new InformeCtrl();
        
        assertEquals(1, informeCtrl.getPacientesIngresado()); 
    }
    
    @Test
    public void when_paciente_do_remove_then_check_informe_pacientes_alta() {
        String cedula = "123456787";
        String nombre = "Ruth Benavides";
        String fechaNacimiento = "02/03/1975";
        String tipoSangre = "A+";
        String sexo = "F";

        PacienteCtrl pacienteCtrl = new PacienteCtrl(cedula, nombre, fechaNacimiento, tipoSangre, sexo);
        PacientesIngresadosCtrl pic = new PacientesIngresadosCtrl();
        pic.addSalidas(pacienteCtrl);

        InformeCtrl  informeCtrl = new InformeCtrl();
        assertEquals(1, informeCtrl.getPacientesAlta()); 
    }
    
    @Test
    public void when_paciente_ingresado_then_check_informe_habitaciones_ocupadas() {
        HabitacionCtrl habitacionCtrl = new HabitacionCtrl("E");
        PacienteCtrl pacienteCtrl1 = new PacienteCtrl("1234567897", "Marco Bolez", "01/01/2001", "A+", "M");
        
        assertTrue(habitacionCtrl.isEmpty());
        habitacionCtrl.putPaciente(pacienteCtrl1);
        
        InformeCtrl  informeCtrl = new InformeCtrl();
        assertEquals(1, informeCtrl.getHabitacionesOcupadas()); 
    }
    
    @Test
    public void when_salida_paciente_then_check_informe_habitaciones_libres() {
        HabitacionCtrl habitacionCtrl = new HabitacionCtrl("E");
        PacienteCtrl pacienteCtrl1 = new PacienteCtrl("1234567897", "Marco Bolez", "01/01/2001", "A+", "M");
        
        assertTrue(habitacionCtrl.isEmpty());
        habitacionCtrl.putPaciente(pacienteCtrl1);
        habitacionCtrl.popPaciente();
        
        InformeCtrl  informeCtrl = new InformeCtrl();
        assertEquals(1, informeCtrl.getHabitacionesLibres()); 
    }
    
    
}