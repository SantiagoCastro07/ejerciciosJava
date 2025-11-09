/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacalificaciones;

/**
 *
 * @author ashly
 */
public class Estudiante extends User {
    public String horarioClases;
    public String grupo;
    
    public Estudiante(String name, int id, String password, String horarioClase, String grupo){
        super(name, id, password);
    }
    
    public void subirTrabajos(){
        System.out.println("Subiendo trabajos...");
    }
    
    public void actualizarInformacion(){
        System.out.println("Actualizando informacion...");
    }
    
}
