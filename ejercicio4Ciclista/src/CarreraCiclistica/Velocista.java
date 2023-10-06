package CarreraCiclistica;

public class Velocista extends Ciclista{
    public Velocista(int identificador, String nombre, double
            potenciaPromedio, double velocidadPromedio) {
        super(identificador, nombre);
        potenciaPromedio = potenciaPromedio;
        this.velocidadPromedio = velocidadPromedio;
    }
    private double potenciaPromedio; /* Atributo que define la potencia
promedio de un velocista */
    private double velocidadPromedio; /* Atributo que define la
velocidad promedio de un velocista */
    protected double getPotenciaPromedio() {
        return potenciaPromedio;
    }
    protected void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }
    protected void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }
    protected void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Potencia promedio = " + potenciaPromedio);
        System.out.println("Velocidad promedio = " +
                velocidadPromedio);
    }
    protected String imprimirTipo() {
        return "Es un velocista";
    }
}
