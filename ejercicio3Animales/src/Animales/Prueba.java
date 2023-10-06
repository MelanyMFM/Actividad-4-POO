package Animales;

public class Prueba {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Gato();
        animals[1] = new Perro();
        animals[2] = new Lobo();
        animals[3] = new Leon();

        for (Animal animal:
             animals) {
            System.out.println(animal.getNombreCientifico());
            System.out.println("Sonido: " + animal.getSonido());
            System.out.println("Alimentos: " + animal.getAlimentos());
            System.out.println("Habitat: " + animal.getHabitat() + "\n+");


        }

    }
}
