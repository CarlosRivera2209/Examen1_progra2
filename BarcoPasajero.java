package examen1_progra2;

import java.util.Scanner;

public final class BarcoPasajero extends Barco {

    private String[] nombresPasajeros;
    private double precioBoleto;
    private int contadorPasajeros;

    public BarcoPasajero(int maxPasajeros, double precioBoleto) {
        super("Barco Pasajero:");
        this.nombresPasajeros = new String[maxPasajeros];
        this.precioBoleto = precioBoleto;
        this.contadorPasajeros = 0;
    }

    public void agregarElemento() {
        if (contadorPasajeros < nombresPasajeros.length) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el nombre del pasajero:");
            String nombre = scanner.nextLine();
            nombresPasajeros[contadorPasajeros] = nombre;
            contadorPasajeros++;
        } else {
            System.out.println("El barco ya alcanzó su capacidad máxima de pasajeros.");
        }
    }

    public double vaciarCobrar() {
        double total = contadorPasajeros * precioBoleto;
        contadorPasajeros = 0;
        return total;
    }

    public double precioElemento() {
        return precioBoleto;
    }

    public String toString() {
        return super.toString() + " - Cantidad de Pasajeros que compraron boleto: " + contadorPasajeros;
    }

    public void listarPasajeros() {
        System.out.println("Pasajeros que compraron boleto:");
        listarPasajerosRecursivo(0);
    }

    private void listarPasajerosRecursivo(int index) {
        if (index < contadorPasajeros) {

        }
    }
}
