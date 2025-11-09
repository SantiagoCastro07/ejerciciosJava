package zoologico;

public class Ejercicio2_Zoologico {
    public static void main(String[] args) {

        // Crear cuidadores
        Cuidadores cuidadorM = new Cuidadores("Carlos");
        Cuidadores cuidadorR = new Cuidadores("Lucía");

        // Crear animales (mamíferos y reptiles en la misma clase)
        Animal perro = new Animal("Rocky", 4, "Mamífero", "Perro", false, "Jardín");
        Animal gato = new Animal("Misu", 3, "Mamífero", "Gato", false, "Casa");
        Animal tortuga = new Animal("Shelly", 20, "Reptil", "Tortuga", false, "Laguna");
        Animal serpiente = new Animal("Nagini", 5, "Reptil", "Serpiente", true, "Selva");

        // Mostrar información general
        perro.mostrarInfo();
        gato.mostrarInfo();
        tortuga.mostrarInfo();
        serpiente.mostrarInfo();

        System.out.println("\n--- ACCIONES EN EL ZOOLÓGICO ---");

        // Acciones de cuidadores
        cuidadorM.alimentarAnimal(perro);
        cuidadorM.revisarSalud(gato);

        cuidadorR.alimentarAnimal(tortuga);
        cuidadorR.revisarSalud(serpiente);

        System.out.println("\n--- SONIDOS DE LOS ANIMALES ---");
        perro.hacerSonido();
        gato.hacerSonido();
        tortuga.hacerSonido();
        serpiente.hacerSonido();
    }
}
