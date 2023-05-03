abstract class Avion implements IManiobrasYCaracteristicas{
    protected String modelo;
    protected String marca;
    protected int capCombustible;
    protected int tipoDeMotor;
    protected int cantAsientos;
    protected String estado;
    protected String tipo;

    public Avion(String modelo, String marca, int capCombustible, int tipoDeMotor, int cantAsientos, String estado, String tipo ){
        this.modelo = modelo;
        this.marca = marca;
        this.capCombustible = capCombustible;
        this.tipoDeMotor = tipoDeMotor;
        this.cantAsientos = cantAsientos;
        this.estado = estado;
        this.tipo = tipo;

    }

}
