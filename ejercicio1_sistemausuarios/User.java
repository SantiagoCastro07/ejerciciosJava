package ejercicio1_sistemausuarios;

public class User {
    private String name;
    private int id;
    private String password;
    
    public User(String name, int id, String password){
        this.name = name;
        this.id = id;
        this.password = password;
    }
    
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
