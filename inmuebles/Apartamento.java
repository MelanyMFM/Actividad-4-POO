package inmuebles;

public class Apartamento extends InmuebleVivienda {
    
    Apartamento(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños){
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
    }
    
    void imprimir() {
        super.imprimir();
    }
}
