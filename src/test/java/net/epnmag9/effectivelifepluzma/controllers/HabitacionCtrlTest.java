/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.epnmag9.effectivelifepluzma.controllers;

import net.epnmag9.effectivelifepluzma.views.HabitacionVw;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class HabitacionCtrlTest {
    
   
    @Test
    public void when_paciente_do_put_check_isThere() {
        HabitacionCtrl habitacionCtrl = new HabitacionCtrl("E");
        PacienteCtrl pacienteCtrl = new PacienteCtrl("1234567897", "Marco Bolez", "01/01/2001", "A+", "M");
        
        habitacionCtrl.putPaciente(pacienteCtrl);
        assertEquals(pacienteCtrl, habitacionCtrl.peekPaciente());
    }
    
    @Test
    public void when_paciente_do_peek_check_notOcuppied() {
        HabitacionCtrl habitacionCtrl = new HabitacionCtrl("E");
        PacienteCtrl pacienteCtrl1 = new PacienteCtrl("1234567897", "Marco Bolez", "01/01/2001", "A+", "M");
        
        assertTrue(habitacionCtrl.isEmpty());
        habitacionCtrl.putPaciente(pacienteCtrl1);
        assertTrue(!habitacionCtrl.isEmpty());
    }
    
    @Test
    public void when_paciente_do_pop_check_notThere() {
        HabitacionCtrl habitacionCtrl = new HabitacionCtrl("E");
        PacienteCtrl pacienteCtrl1 = new PacienteCtrl("1234567897", "Marco Bolez", "01/01/2001", "A+", "M");
        
        habitacionCtrl.putPaciente(pacienteCtrl1);
        habitacionCtrl.popPaciente();
        assertTrue(habitacionCtrl.isEmpty());
    }
}
