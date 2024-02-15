package examen1_progra2;

public final class BarcoPesquero extends Barco {

    private int pecesCapturados;
    private final TipoPesquero tipo;

    public BarcoPesquero(TipoPesquero tipo) {
        super("Barco Pesquero");
        this.pecesCapturados = 0;
        this.tipo = tipo;
    }

    public void agregarElemento() {
        pecesCapturados++;
    }

    public double vaciarCobrar() {
        double total = pecesCapturados * tipo.price;
        pecesCapturados = 0;
        return total;
    }

    public double precioElemento() {
        return tipo.price;
    }

    public String toString() {
        return super.toString() + " - Tipo: " + tipo.name() + ", Peces Capturados: " + pecesCapturados;
    }
}
