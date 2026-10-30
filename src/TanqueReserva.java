public class TanqueReserva {
    //De agua
    private double capacidadMaxima;
    private double nivelActual;

    public TanqueReserva(double capacidadMaxima, double nivelActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.nivelActual = nivelActual;
    }

    public void llenar(double litro) {
        if(litro > 0 && litro <= capacidadMaxima){
            nivelActual += litro;
        }else{
            System.out.println("Cantidad de litros no adecuados.");
        }
    }

    public void consumir(double litros){
        if (litros > 0 && litros <= capacidadMaxima){
            nivelActual -= litros;
        }else{
            System.out.println("Cantidad de litros no adecuados.");
        }
    }

    public double getNivelActual() {
        return nivelActual;
    }
}
