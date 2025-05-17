package models;

public class Transmision {
    private String tipo;
    private int marchas;
    private String traccion;
    private String marca;
    private String modelo;

    public Transmision() {}

    public Transmision(String tipo, int marchas, String traccion, String marca, String modelo) {
        this.tipo = tipo;
        this.marchas = marchas;
        this.traccion = traccion;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void tInfo() {
        System.out.println("🤺Informacion de la transmision: ");
        System.out.println("Tipo: " + tipo);
        System.out.println("Marchas: " + marchas);
        System.out.println("Traccion: " + traccion);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}