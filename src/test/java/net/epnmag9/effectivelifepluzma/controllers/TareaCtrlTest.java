/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.controllers;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Steven
 */
public class TareaCtrlTest {
    @Test
    public void when_tarea_do_add_check_description_and_state_in_doctor_data() {
        DoctorCtrl doctorCtrl = new DoctorCtrl("Marco Bolez", "1234567897");
        TareaCtrl tareaCtrl = new TareaCtrl("Cirujía", "pendiente", doctorCtrl);
        
        doctorCtrl.addTarea(tareaCtrl);
        
        assertEquals(1, doctorCtrl.getTareas().size());
        assertEquals("Cirujía", doctorCtrl.getTareas().get(0).getDescripcion());
        assertEquals("pendiente", doctorCtrl.getTareas().get(0).getEstado());
    }
}
