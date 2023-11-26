public class ClienteVIP {
    private String nombre;
    private double limiteCredito;
    private String correoElectronico;

    public ClienteVIP() {
        this("", 0.0, "");
    }

    public ClienteVIP(String nombre, double limiteCredito) {
        this(nombre, limiteCredito, "");
    }

    public ClienteVIP(String nombre, double limiteCredito, String correoElectronico) {
        this.nombre = nombre;
        this.limiteCredito = limiteCredito;
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public static void main(String[] args) {

        ClienteVIP cliente1 = new ClienteVIP();
        System.out.println("Cliente 1: " + cliente1.getNombre() + ", " + cliente1.getLimiteCredito() + ", "
                + cliente1.getCorreoElectronico());

        ClienteVIP cliente2 = new ClienteVIP("Danilo", 2000.0);
        System.out.println("Cliente 2: " + cliente2.getNombre() + ", " + cliente2.getLimiteCredito() + ", "
                + cliente2.getCorreoElectronico());

        ClienteVIP cliente3 = new ClienteVIP("Andrea", 5000.0, "andrea@example.com");
        System.out.println("Cliente 3: " + cliente3.getNombre() + ", " + cliente3.getLimiteCredito() + ", "
                + cliente3.getCorreoElectronico());
    }
}
