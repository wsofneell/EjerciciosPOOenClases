public class CuentaBancaria {
    private int nCuenta;
    private double balance;
    private String nombreCliente;
    private String email;
    private int nTelefono;

    public int getNumeroCuenta() {
        return nCuenta;
    }

    public void setNumeroCuenta(int nCuenta) {
        this.nCuenta = nCuenta;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumeroTelefono() {
        return nTelefono;
    }

    public void setNumeroTelefono(int nTelefono) {
        this.nTelefono = nTelefono;
    }

    public static void depositar(double balance, double cantidadsolicitada) {
        balance = balance + cantidadsolicitada;
        System.out.println(balance);
    }

    public static void retirar(double balance, double cantidadsolicitada, int intentos) {
        do {
            balance = balance - cantidadsolicitada;
            intentos++;
        } while (intentos < 3 || cantidadsolicitada > balance);
    }
}
