/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.controllers;

import java.util.List;
import net.epnmag9.effectivelifepluzma.views.HospitalVw;
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
public class HospitalCtrlTest {
    @Test
    public void when_paciente_do_put_check_isThere() {
        String codigo = "E";
        HospitalCtrl hospitalCtrl = new HospitalCtrl();
        HabitacionCtrl habitacionCtrl = new HabitacionCtrl(codigo);
        hospitalCtrl.addHabitacion(habitacionCtrl);
        PacienteCtrl pacienteCtrl = new PacienteCtrl("1234567897", "Marco Bolez", "01/01/2001", "A+", "M");
        
        hospitalCtrl.putPacienteInHabitacion(codigo, pacienteCtrl);
        
        
        assertEquals(pacienteCtrl, hospitalCtrl.getHabitacion(codigo).peekPaciente());
    }
    
    @Test
    public void when_paciente_do_peek_check_notOcuppied() {
        String codigo = "E";
        HospitalCtrl hospitalCtrl = new HospitalCtrl();
        HabitacionCtrl habitacionCtrl = new HabitacionCtrl(codigo);
        hospitalCtrl.addHabitacion(habitacionCtrl);
        PacienteCtrl pacienteCtrl = new PacienteCtrl("1234567897", "Marco Bolez", "01/01/2001", "A+", "M");
        
        hospitalCtrl.putPacienteInHabitacion(codigo, pacienteCtrl);
        
        assertTrue(!hospitalCtrl.getHabitacion(codigo).isEmpty());
        hospitalCtrl.popPacienteOutHabitacion(pacienteCtrl);
        assertTrue(hospitalCtrl.getHabitacion(codigo).isEmpty());
    }
    
    @Test
    public void when_paciente_do_pop_check_notThere() {
        String codigo = "E";
        HospitalCtrl hospitalCtrl = new HospitalCtrl();
        HabitacionCtrl habitacionCtrl = new HabitacionCtrl(codigo);
        hospitalCtrl.addHabitacion(habitacionCtrl);
        PacienteCtrl pacienteCtrl = new PacienteCtrl("1234567897", "Marco Bolez", "01/01/2001", "A+", "M");
        
        hospitalCtrl.putPacienteInHabitacion(codigo, pacienteCtrl);
        hospitalCtrl.popPacienteOutHabitacion(pacienteCtrl);
        assertEquals(null, hospitalCtrl.getHabitacion(codigo).peekPaciente());
        
    }
    
    @Test
    public void when_visita_do_add_check_added() {
        String codigo = "E";
        String nombre = "John Doe";
        HospitalCtrl hospitalCtrl = new HospitalCtrl();
        HabitacionCtrl habitacionCtrl = new HabitacionCtrl(codigo);
        hospitalCtrl.addHabitacion(habitacionCtrl);
        VisitaCtrl visitaCtrl = new VisitaCtrl(nombre, habitacionCtrl);
        
        hospitalCtrl.getVisitas().add(visitaCtrl);
        assertEquals(visitaCtrl, hospitalCtrl.getVisitaByNombre(nombre));
        
    }
    
    @Test
    public void when_visita_do_remove_check_notThere() {
        String codigo = "E";
        String nombre = "John Doe";
        HospitalCtrl hospitalCtrl = new HospitalCtrl();
        HabitacionCtrl habitacionCtrl = new HabitacionCtrl(codigo);
        hospitalCtrl.addHabitacion(habitacionCtrl);
        VisitaCtrl visitaCtrl = new VisitaCtrl(nombre, habitacionCtrl);
        
        hospitalCtrl.getVisitas().add(visitaCtrl);
        hospitalCtrl.getVisitas().remove(hospitalCtrl.getVisitaByNombre(nombre));
        assertEquals(0, hospitalCtrl.getVisitas().size());
    }
}
