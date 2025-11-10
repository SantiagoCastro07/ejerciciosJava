package ejercicio1_sistemausuarios;

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
