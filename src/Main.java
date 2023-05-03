import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Aeropuerto aeropuerto = new Aeropuerto("Astor Piazola", 7600, "juan b justo 10100");

        Comercial comercial1 = new Comercial("2000a", "LG", 20000, 2, 300, "Hangar", "Comercial");
        Comercial comercial2 = new Comercial("2020b", "Samsung", 30000, 4, 400, "Hangar", "Comercial");
        Privado privado1 = new Privado("234c", "Nokia", 5000, 3, 20, "Hangar", "Privado");
        Privado privado2 = new Privado("344a", "SonyEricson", 8000, 1, 30, "Hangar", "Privado");
        DeCarga deCarga1 = new DeCarga("356a", "Ford", 10000, 3, 0, "Hangar", "De Carga");
        DeCarga deCarga2 = new DeCarga("240b", "Chevrolet", 9000, 3, 0, "Hangar", "De Carga");
        Militar militar1 = new Militar("350c", "Nokia", 12000, 6, 6, "Hangar", "Militar");
        Militar militar2 = new Militar("380c", "Nokia", 1500, 5, 10, "Hangar", "Militar");

        System.out.println(aeropuerto.ingresarAvion(comercial1));
        System.out.println(aeropuerto.ingresarAvion(comercial2));
        System.out.println(aeropuerto.ingresarAvion(privado1));
        System.out.println(aeropuerto.ingresarAvion(privado2));
        System.out.println(aeropuerto.ingresarAvion(deCarga1));
        System.out.println(aeropuerto.ingresarAvion(deCarga2));
        System.out.println(aeropuerto.ingresarAvion(militar1));
        System.out.println(aeropuerto.ingresarAvion(militar2));

        Militar militar3 = new Militar("367c", "Nokia", 1500, 5, 10, "Hangar", "Militar");
        System.out.println(aeropuerto.ingresarAvion(militar3));



        aeropuerto.verAviones();

        aeropuerto.despliegeDeHangar("militar");
        System.out.println();
        aeropuerto.verAviones();

        Militar militar4 = new Militar("3893", "Nokia", 8900, 5, 10, "Hangar", "Militar");
        System.out.println(aeropuerto.ingresarAvion(militar4));


    }

}