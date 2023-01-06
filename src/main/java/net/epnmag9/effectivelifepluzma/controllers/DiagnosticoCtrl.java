/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import net.epnmag9.effectivelifepluzma.models.DiagnosticoMdl;
import net.epnmag9.effectivelifepluzma.views.DiagnosticoVw;

/**
 *
 * @author thoma
 */
public class DiagnosticoCtrl implements Serializable{
    
    DiagnosticoMdl modelo;
    DiagnosticoVw vista;

    public DiagnosticoCtrl(String doctor, String diagnostico,String prescripcion,  String fechaDiagnostico) {
        modelo = new DiagnosticoMdl(doctor, diagnostico, prescripcion ,fechaDiagnostico);
    }
    
    public DiagnosticoVw getView(){
        return vista;
    }
    
    public void setVista(DiagnosticoVw vista){
        this.vista = vista;
    }


    public String getDiagnostico(){
        return modelo.getDiagnostico();
    }
    
    public String getDoctor(){
        return modelo.getDoctor();
    }
    
    public String getPrescripcion(){
        return modelo.getPrescripcion();
    }
    
    public String getFechaDiagnostico(){
        return modelo.getFechaDiagnostico();
    }

    
    public static List<String> getSugerenciasDiagnostico(PacienteCtrl pacienteCtrl){
        List<String> diagnosticos = new ArrayList<>(2);
        DatosClinicosCtrl datosClinicosCtrl = pacienteCtrl.getRegistroDatosClinicos().getDatosClinicosRecientes();
        if(datosClinicosCtrl==null) return diagnosticos;
        
        String fiebreDiagnostico = diagnosticoFiebre(datosClinicosCtrl.getTemperatura());
        String iMCDiagnostico = iMCDiagnostico(datosClinicosCtrl.getPeso(),datosClinicosCtrl.getAltura());
        
        if(fiebreDiagnostico != null) diagnosticos.add(fiebreDiagnostico);
        if(iMCDiagnostico != null) diagnosticos.add(iMCDiagnostico);
        
        return diagnosticos;
    }
    
    private static String diagnosticoFiebre(double temperatura) {
    if(temperatura >= 36 && temperatura < 37.5) return null; //"temperatura normal"
    if(temperatura >= 37.5 && temperatura < 38) return "febrícula";
    if(temperatura >= 38 && temperatura < 38.5) return "fiebre leve";
    if(temperatura >= 38.5 && temperatura < 39) return "fiebre moderada";
    if(temperatura >= 39) return "fiebre alta";
    return "temperatura anormalmente baja";
}

    private static boolean donanteSangre(double peso, int edad) {
        return peso >= 50 && edad >= 17;
    }


    //Metodo para determinar diagnostico de acuerdo a IMC
    private static String iMCDiagnostico(double peso, double altura) {
        double imc = peso/(altura*altura);
        if(imc<16) return "Infrapeso severo";
        if(imc<17) return "Infrapeso moderado";
        if(imc<18.5) return "Infrapeso medio";
        if(imc<25) return null; // "Normopeso"
        if(imc<30) return "Sobrepeso";
        if(imc<35) return "Obesidad tipo 1";
        if(imc<40) return "Obesidad tipo 2";
        return "Obesidad tipo 3";
    }
}
