package models;

public class Neumatico {
    private String tipo;
    private String marca;
    private String modelo;
    private String dimensiones;
    private String presion;
    private String peso;

    public Neumatico() {}

    public Neumatico(String tipo, String marca, String modelo, String dimensiones, String presion, String peso) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.dimensiones = dimensiones;
        this.presion = presion;
        this.peso = peso;
    }

    public void nInfo() {
        System.out.println("🛞Informacion del neumatico: ");
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Dimensiones: " + dimensiones);
        System.out.println("Presion: " + presion);
        System.out.println("Peso: " + peso);
    }
}
