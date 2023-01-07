/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.general;

import java.io.Serializable;
import java.util.Scanner;
import net.epnmag9.effectivelifepluzma.views.HospitalVw;
import net.epnmag9.effectivelifepluzma.views.PacientesIngresadosVw;

/**
 *
 * @author luism
 */
public class MenuCLI implements Serializable {

    private static final Scanner scn = new Scanner(System.in);
    private final PacientesIngresadosVw pacientesIngresadosVw = PacientesIngresadosVw.createPacientesIngresados();
    private final HospitalVw hospitalVw = HospitalVw.createHospital(pacientesIngresadosVw);

    final static String mainMenu
            = """
              --------------------------------------------------------------------------------
              \t\t\t\tLife Plus
              --------------------------------------------------------------------------------
              1. Ingresar Paciente
              2. Agregar Datos Clinicos
              3. Actualizar Datos Clinicos
              4. Visualizar Historial Clinico
              5. Obtener una sugerencia para el diagnostico
              6. Agregar Diagnostico
              7. Visualizar Diagnostico
              8. Ver habitaciones libres
              9. Ingresar un paciente a una habitación
              10. Remover un paciente de una habitación
              11. Ingresar una visita a una habitación
              12. Registrar salida de una visita 
              13. Mostrar visitas
              14. Mostrar entradas y salidas del hospital
              15. Mostrar estadisticas del hospital
              0. Salir
              Ingrese la acción a realizar: 
              --------------------------------------------------------------------------------""";

    public void run() {
        while (true) {
            Main.save(this);
            System.out.println(mainMenu);
            switch (scn.nextLine()) {
                case "0":
                    System.exit(0);
                case "1":
                    pacientesIngresadosVw.registrarPaciente();
                    break;
                case "2":
                    pacientesIngresadosVw.addDatosClinicos();
                    break;
                case "3":
                    pacientesIngresadosVw.updateDatosClinicos();
                    break;
                case "4":
                    pacientesIngresadosVw.showHistorialClinico();
                    break;
                case "5":
                    pacientesIngresadosVw.printSugerenciaDiagnostico();
                    break;
                case "6":
                    pacientesIngresadosVw.addDiagnostico();
                    break;
                case "7":
                    pacientesIngresadosVw.showDiagnostico();
                    break;
                case "8":
                    hospitalVw.peekFreeHabitaciones();
                    break;
                case "9":
                    hospitalVw.putPaciente();
                    break;
                case "10":
                    hospitalVw.popPaciente();
                    break;
                case "11":
                    hospitalVw.addVisita();
                    break;
                case "12":
                    hospitalVw.deleteVisita();
                    break;
                case "13":
                    hospitalVw.printVisitas();
                    break;
                case "14":
                    hospitalVw.printEntradasSalidas();
                    break;
                case "15":
                    hospitalVw.printEstadisticasHospital();
                    break;
                default: {
                    ;
                }
            }
        }
    }
}
