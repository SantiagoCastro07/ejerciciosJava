package ejercicio1_sistemausuarios;

public class Admin extends User{
    public String horarioTrabajo;
    
    public Admin(String name, int id, String password, String horarioTrabajo){
        super(name, id, password);
    }
    
    public void setHorarioTrabajo(String horarioTrabajo){
        this.horarioTrabajo = horarioTrabajo;
    }
    
    public String getHorarioTrabajo(){
        return horarioTrabajo;
    }
    
    public void asignarPermisos(){
        System.out.println("Asignando permisos de administrador...");
    }
    
    public void agregarUsuarios(){
        System.out.println("Agregando usuarios...");
    }
    
    public void eliminarUsuarios(){
        System.out.println("Eliminando usuarios...");
    }
    
    public void editarNotas(){
        System.out.println("Editando notas...");
    }
    
    public void eliminarNotas(){
        System.out.println("Eliminando nota...");
    }
    
    public void crearNota(){
        System.out.println("Creando nota...");
    }
    
    public void verListaUsuarios(){
        System.out.println("Mostrando lista de usuarios registrados...");
    }
    
}
