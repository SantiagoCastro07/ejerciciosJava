/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacalificaciones;

/**
 *
 * @author ashly
 */
public class User {
    private String name;
    private int id;
    private String password;
    
    public User(String name, int id, String password){
        this.name = name;
        this.id = id;
        this.password = password;
    }
    
    //constructor vacio crea y inicializa el constructor vacio
    //  public User(){
    //  }
    
    public String getNombre(){
        return name;
    }
    
    public int getId(){
        return id;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void leerNota(){
        System.out.println("Leyendo notas...");
    }
    
    public void logear(){
        System.out.println("Usuario " + name + " logeado.");
    }
        
}
