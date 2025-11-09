/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemacalificaciones;

/**
 *
 * @author ashly
 */
public class SistemaUsuarios {

    public static void main(String[] args) {
        User pepito = new User("Juan", 123, "hola");
        System.out.println(" - "+pepito.getNombre()+" - "+pepito.getId()+" - "+pepito.getPassword());
        pepito.logear();
        pepito.leerNota();
        
        Admin admin = new Admin("Admin", 589, "2361391", "Secretaria");
        System.out.println(" - " +admin.getNombre()+ " - " +admin.getId()+ " - "+admin.getPassword());
        admin.logear();
        admin.editarNotas();
        admin.eliminarNotas();
        admin.asignarPermisos();
        admin.agregarUsuarios();
        admin.eliminarUsuarios();
        admin.crearNota();
        admin.verListaUsuarios();
        
        Profesor profe1 = new Profesor("Ana", 123, "aasa", "Artistica", "Lunes 8-10am");
        System.out.println(" - " + profe1.getNombre()+ " - "+profe1.getId()+" - "+profe1.getPassword());
        profe1.editarNotas();
        profe1.administrarNotas();
        profe1.crearNotas();
        profe1.borarNotas();
        
        Estudiante estudiante1 = new Estudiante ("Antonella", 12356, "jakj", "Artistica Lunes 8-10am", "D4");
        System.out.println(" - "+estudiante1.getNombre()+" - "+estudiante1.getId()+" - "+estudiante1.getPassword());
        estudiante1.subirTrabajos();
        estudiante1.actualizarInformacion();
    }
}
