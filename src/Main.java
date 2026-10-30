public class Main {
    public static void main(String[] args) {
        TanqueReserva tanque = new TanqueReserva(1500,500);

        tanque.llenar(2000);
        tanque.llenar(500);
        tanque.llenar(350);

        tanque.consumir(685);
        System.out.println("Nivel de agua actual: " + tanque.getNivelActual());
    }
}