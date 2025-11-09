package zoologico;

public class Animal {
    private String nombre;
    private int edad;
    private String tipo;     // Mamífero o Reptil
    private String especie;
    private boolean venenoso;
    private String habitat;

    public Animal(String nombre, int edad, String tipo, String especie, boolean venenoso, String habitat) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
        this.especie = especie;
        this.venenoso = venenoso;
        this.habitat = habitat;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo en su hábitat: " + habitat + ".");
    }

    public void dormir() {
        System.out.println(nombre + " está durmiendo tranquilamente.");
    }

    public void hacerSonido() {
        if (tipo.equalsIgnoreCase("Mamífero")) {
            if (especie.equalsIgnoreCase("Perro")) {
                System.out.println(nombre + " dice: ¡Guau!");
            } else if (especie.equalsIgnoreCase("Gato")) {
                System.out.println(nombre + " dice: ¡Miau!");
            } else {
                System.out.println(nombre + " emite un sonido de mamífero.");
            }
        } else if (tipo.equalsIgnoreCase("Reptil")) {
            if (especie.equalsIgnoreCase("Serpiente")) {
                System.out.println(nombre + " dice: Ssssss...");
            } else if (especie.equalsIgnoreCase("Tortuga")) {
                System.out.println(nombre + " hace un leve chillido.");
            } else {
                System.out.println(nombre + " emite un sonido reptiliano.");
            }
        }
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre +
                " | Edad: " + edad +
                " | Tipo: " + tipo +
                " | Especie: " + especie +
                " | Venenoso: " + (venenoso ? "Sí" : "No") +
                " | Hábitat: " + habitat);
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }
}
