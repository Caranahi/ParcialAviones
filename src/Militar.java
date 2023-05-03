import java.util.Random;

public class Militar extends Avion {
    private int cantBalas;
    private boolean armas; /// 1 aire-aire o  0 aire-tierra
    Random rdmArmas = new Random();

    public Militar(String modelo, String marca, int capCombustible, int tipoDeMotor, int cantAsientos, String estado, String tipo) {
        super(modelo, marca, capCombustible, tipoDeMotor, cantAsientos, estado, tipo);
        this.tipo = "Militar";
        this.armas = rdmArmas.nextBoolean();
        this.cantBalas = cantBalas;

    }

    public int getCantBalas() {
        return cantBalas;
    }

    public void setCantBalas(int cantBalas) {
        this.cantBalas = cantBalas;
    }

    public boolean isArmas() {
        return armas;
    }

    public void setArmas(boolean armas) {
        this.armas = armas;
    }


    public Random getRdmArmas() {
        return rdmArmas;
    }

    public void setRdmArmas(Random rdmArmas) {
        this.rdmArmas = rdmArmas;
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
        return null;
    }

    @Override
    public String toString() {
        return "Militar{" +
                "cantBalas=" + cantBalas +
                ", armas=" + armas +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", capCombustible=" + capCombustible +
                ", tipoDeMotor=" + tipoDeMotor +
                ", cantAsientos=" + cantAsientos +
                ", estado='" + estado + '\'' +
                '}';
    }
}
