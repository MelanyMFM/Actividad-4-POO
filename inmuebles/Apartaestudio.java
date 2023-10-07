package inmuebles;

public class Apartaestudio extends Apartamento {
    protected static double valorArea = 1500000;
    
    public Apartaestudio(int identificadorInmobiliario, int área, String dirección, int númeroHabitaciones, int númeroBaños) {

        super(identificadorInmobiliario, área, dirección, 1, 1);
    }
    
    void imprimir() {
        super.imprimir(); 
        System.out.println();
    }
}
