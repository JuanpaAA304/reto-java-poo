package models;

public class Mantenimiento {
    private String tipo;
    private String marca;
    private String modelo;
    private String fecha;
    private String kilometraje;
    private String costo;
    private String taller;
    private String observaciones;
    private String piezas_cambiadas;

    public Mantenimiento() {}

    public Mantenimiento(String tipo, String marca, String modelo, String fecha, String kilometraje, String costo, String taller, String observaciones, String piezas_cambiadas) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.fecha = fecha;
        this.kilometraje = kilometraje;
        this.costo = costo;
        this.taller = taller;
        this.observaciones = observaciones;
        this.piezas_cambiadas = piezas_cambiadas;
    }

    public void maInfo() {
        System.out.println("🔧Informacion del mantenimiento: ");
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Fecha: " + fecha);
        System.out.println("Kilometraje: " + kilometraje);
        System.out.println("Costo: " + costo);
        System.out.println("Taller: " + taller);
        System.out.println("Observaciones: " + observaciones);
        System.out.println("Piezas cambiadas: " + piezas_cambiadas);
    }
}
