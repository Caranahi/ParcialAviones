import java.util.Random;

public class Privado extends Avion {
    private boolean jacuzzi;
    private String claveWifi;

    Random rdm = new Random();

    public Privado(String modelo, String marca, int capCombustible, int tipoDeMotor, int cantAsientos, String estado, String tipo) {
        super(modelo, marca, capCombustible, tipoDeMotor, cantAsientos, estado, tipo);
        this.tipo = "Privado";
        this.jacuzzi = rdm.nextBoolean();
        this.claveWifi = "1234";
    }

    public boolean isJacuzzi() {
        return jacuzzi;
    }

    public void setJacuzzi(boolean jacuzzi) {
        this.jacuzzi = jacuzzi;
    }

    public String getClaveWifi() {
        return claveWifi;
    }

    public void setClaveWifi(String claveWifi) {
        this.claveWifi = claveWifi;
    }


    @Override
    public String despegar() {
        String mensaje = "Avion despegando";
        this.estado = mensaje;
        return mensaje;
    }

    @Override
    public String aterrizar(Avion avion) {
        String mensaje = "Avion aterrizando";
        this.estado = mensaje;
        return mensaje;
    }

    @Override
    public String volar(Avion avion) {
        String mensaje = "Avion volando";
        this.estado = mensaje;
        return mensaje;
    }

    @Override
    public boolean comidaYMantas() {
        return true;
    }

    @Override
    public boolean verMundial() {
        return true;
    }

    @Override
    public boolean ingresoEspecial() {
        return false;
    }

    @Override
    public String descargaContenido() {
        return null;
    }

    @Override
    public String toString() {
        return "Privado{" +
                "jacuzzi=" + jacuzzi +
                ", claveWifi='" + claveWifi + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", capCombustible=" + capCombustible +
                ", tipoDeMotor=" + tipoDeMotor +
                ", cantAsientos=" + cantAsientos +
                ", estado='" + estado + '\'' +
                '}';
    }
}
