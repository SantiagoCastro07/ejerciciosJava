package ejercicio1_sistemausuarios;

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
