import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        Random random = new Random();
        int intentos = 0;
        String nombreCliente, email;
        double balance, cantidadsolicitada;
        int opcion = 0;
        balance = random.nextDouble(6000);

        System.out.println("1.Depositar");
        System.out.println("2. Retirar");

        switch (opcion) {
            case 1:
                System.out.println("cantidad a depositar: ");
                cantidadsolicitada = lector.nextDouble();
                CuentaBancaria.depositar(balance, cantidadsolicitada);
                break;
            case 2:
                System.out.println("Cantidad a retirar: ");
                cantidadsolicitada = lector.nextDouble();
                CuentaBancaria.retirar(balance, cantidadsolicitada, intentos);
                break;
        }
        lector.close();
    }
}
