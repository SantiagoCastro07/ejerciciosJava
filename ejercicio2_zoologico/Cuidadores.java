package ejercicio2_zoologico;

public class Cuidadores {
    private String nombre;

    public Cuidadores(String nombre) {
        this.nombre = nombre;
    }

    public void alimentarAnimal(Animal a) {
        System.out.println(nombre + " está alimentando a " + a.getNombre() + ".");
        a.comer();
    }

    public void revisarSalud(Animal a) {
        System.out.println(nombre + " revisa la salud de " + a.getNombre() + ".");
    }

    public void limpiarHabitat(Animal a) {
        System.out.println(nombre + " limpia el hábitat de " + a.getNombre() + ".");
    }
}
