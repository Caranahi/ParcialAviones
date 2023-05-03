import java.util.ArrayList;
import java.util.List;

public class Aeropuerto {
    private String nombre;
    private Integer codInternacional;
    private String direccion;
    static final Integer capOperacion = 8;
    private int comercial = 0;
    private int privado = 0;
    private int deCarga = 0;
    private int militar = 0;

    private List<Avion> aviones;


    public Aeropuerto(String nombre, Integer codInternacional, String direccion) {
        this.nombre = nombre;
        this.codInternacional = codInternacional;
        this.direccion = direccion;
        this.aviones = new ArrayList<>();

    }

    //region GetYSet
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodInternacional() {
        return codInternacional;
    }

    public void setCodInternacional(Integer codInternacional) {
        this.codInternacional = codInternacional;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Avion> getAviones() {
        return aviones;
    }

    public void setAviones(List<Avion> aviones) {
        this.aviones = aviones;
    }

    //endregion

    public String ingresarAvion(Avion avion) {
        String mensaje;
        if (this.aviones.size() < capOperacion) {
            this.aviones.add(avion);
            switch (avion.tipo) {
                case "Comercial" -> this.comercial++;
                case "Privado" -> this.privado++;
                case "De Carga" -> this.deCarga++;
                case "Militar" -> this.militar++;
            }
            mensaje = "Avion ingresado al Hangar correctamente ";

        } else {
            mensaje = "El aeropuerto no tiene más espacio, ingreso denegado";
        }
        return mensaje;
    }

    public void despliegeDeHangar(String tipoAvion){
        int i=0;
        while(i<this.aviones.size()){
            if(this.aviones.get(i).tipo.equalsIgnoreCase(tipoAvion)){
                this.aviones.get(i).estado= this.aviones.get(i).despegar();
            }
            i++;
        }
    }

    public void verAviones(){
        int i;
        for (i=0; i<this.aviones.size(); i++){
            if(this.aviones.get(i).tipo.equalsIgnoreCase("comercial")){
                System.out.println(this.aviones.get(i).toString());
            }
            if(this.aviones.get(i).tipo.equalsIgnoreCase("privado")){
                System.out.println(this.aviones.get(i).toString());
            }
            if(this.aviones.get(i).tipo.equalsIgnoreCase("de carga")){
                System.out.println(this.aviones.get(i).toString());
            }
            if(this.aviones.get(i).tipo.equalsIgnoreCase("militar")){
                System.out.println(this.aviones.get(i).toString());
            }
        }



    }
    @Override
    public String toString() {
        return "Aeropuerto{" +
                "nombre='" + nombre + '\'' +
                ", codInternacional=" + codInternacional +
                ", direccion='" + direccion + '\'' +
                ", comercial=" + comercial +
                ", privado=" + privado +
                ", deCarga=" + deCarga +
                ", militar=" + militar +
                ", aviones=" + aviones +
                '}';
    }
}
