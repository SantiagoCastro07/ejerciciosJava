/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacalificaciones;

/**
 *
 * @author ashly
 */
public class Profesor extends User {
    public String materiaAsignada;
    public String horarioClases;
    
    public Profesor(String name, int id, String password, String materiaAsignada, String horarioClases){
        super(name, id, password);
    }
    
    public void editarNotas(){
        System.out.println("Editando notas...");
    }
    
    public void administrarNotas(){
        System.out.println("Administraando notas...");
    }
    
    public void crearNotas(){
        System.out.println("Creando notas...");
    }    
    
    public void borarNotas(){
        System.out.println("Borrando notas...");
    }
}