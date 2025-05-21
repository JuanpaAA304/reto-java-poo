package models;

public class Transmision {
    private String tipo;
    private int marchas;
    private String traccion;
    private String marca;
    private String modelo;

    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getMarchas() {
        return marchas;
    }

    public void setMarchas(int marchas) {
        this.marchas = marchas;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

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