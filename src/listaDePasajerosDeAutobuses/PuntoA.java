package listaDePasajerosDeAutobuses;

/**
 *
 * @author Alan Eduardo
 */
import java.util.LinkedHashMap;

public class PuntoA {

    LinkedHashMap<Integer, String> lista = new LinkedHashMap();

    private void insertar() {
        int pos = 5;
        lista.put(0, "Hola");
        lista.put(1, "Bueno");
        lista.put(2, "Dias");
        lista.put(3, "Adios");

        if (lista.containsKey(pos)) {

        } else {
            System.out.println("La posición no existe en la lista.");
        }

    }

    private void eliminar() {

        lista.remove(0);

        if (lista.isEmpty()) {
            System.out.println("La lista está vacía.");
        }
    }

    private void compruebaSiExiste() {
        String palabra = "Hola";
        boolean verifica = false;
        if (lista.containsValue(palabra)) {
            verifica = true;
            System.out.println(verifica);
        } else {
            verifica = false;
            System.out.println(verifica);
        }
    }

    private void obtenerElemento() {
        int numero = 3;
        if (lista.containsKey(numero)) {
            System.out.println("Elemento " + lista.get(numero));
        } else {
            System.out.println("La posición no existe en la lista.");
        }

    }

    private void actualizado() {
        int numero = 4;

        if (lista.containsKey(numero)) {

        } else if (lista.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            System.out.println("La posición no existe en la lista.");
            lista.put(numero, "Genial");
        }

        System.out.println(lista);
    }

    public static void main(String[] args) {
        PuntoA objeto = new PuntoA();

        objeto.insertar();
        objeto.eliminar();
        objeto.compruebaSiExiste();
        objeto.obtenerElemento();
        objeto.actualizado();
    }

}
