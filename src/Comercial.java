import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Comercial extends Avion{

    List<String> servicios;
    public static final int azafatas=10;


    public Comercial(String modelo, String marca, int capCombustible, int tipoDeMotor, int cantAsientos, String estado, String tipo) {
        super(modelo, marca, capCombustible, tipoDeMotor, cantAsientos, estado, tipo);
        this.tipo = "Comercial";
        this.servicios =  new ArrayList<>(Arrays.asList("Comida", "Bebida", "Peliculas"));
    }

    public List<String> getServicios() {
        return servicios;
    }

    public void setServicios(List<String> servicios) {
        this.servicios = servicios;
    }

    @Override
    public String despegar() {
        String mensaje = "Avion despegando";
        this.estado= mensaje;
        return mensaje;
    }

    @Override
    public String aterrizar(Avion avion) {
        String mensaje = "Avion aterrizando";
        this.estado= mensaje;
        return mensaje;
    }

    @Override
    public String volar(Avion avion) {
        String mensaje = "Avion volando";
        this.estado= mensaje;
        return mensaje;
    }

    @Override
    public boolean comidaYMantas() {
        return true;
    }

    @Override
    public boolean verMundial() {
        return false;
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
        return "Comercial{" +
                "servicios=" + servicios +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", capCombustible=" + capCombustible +
                ", tipoDeMotor=" + tipoDeMotor +
                ", cantAsientos=" + cantAsientos +
                ", estado=" + estado +
                '}';
    }
}
