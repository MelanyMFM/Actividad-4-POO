package inmuebles;

public class InmuebleVivienda extends Inmueble {
    protected int numeroHabitaciones;
    protected int numeroBaños;
    
    InmuebleVivienda(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {
        super(identificadorInmobiliario, area, direccion);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBaños = numeroBaños;
    }
    
    void imprimir() {
        super.imprimir();
        System.out.println("Numero de habitaciones = " +numeroHabitaciones);
        System.out.println("Numero de banos = " + numeroBaños);
    }
}
