import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeCarga extends Avion {
    private int capCarga;
    List<String> productosATransportar;


    public DeCarga(String modelo, String marca, int capCombustible, int tipoDeMotor, int cantAsientos, String estado, String tipo) {
        super(modelo, marca, capCombustible, tipoDeMotor, cantAsientos, estado, tipo);
        this.tipo = "De Carga";
        this.capCarga = capCarga;
        this.productosATransportar = new ArrayList<>(Arrays.asList("Muebles", "Electrodomesticos", "Libreria"));

    }


    public int getCapCarga() {
        return capCarga;
    }

    public void setCapCarga(int capCarga) {
        this.capCarga = capCarga;
    }

    public List<String> getProductosATransportar() {
        return productosATransportar;
    }

    public void setProductosATransportar(List<String> productosATransportar) {
        this.productosATransportar = productosATransportar;
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
        return false;
    }

    @Override
    public boolean verMundial() {
        return false;
    }

    @Override
    public boolean ingresoEspecial() {
        return true;
    }

    @Override
    public String descargaContenido() {
        String mensaje = "Descarga de productos";
        return mensaje;
    }

    @Override
    public String toString() {
        return "DeCarga{" +
                "capCarga=" + capCarga +
                ", productosATransportar=" + productosATransportar +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", capCombustible=" + capCombustible +
                ", tipoDeMotor=" + tipoDeMotor +
                ", cantAsientos=" + cantAsientos +
                ", estado='" + estado + '\'' +
                '}';
    }
}
