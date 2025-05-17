package models;

public class Chasis {
    private String tipo;
    private String material;
    private String marca;
    private String modelo;
    private String color;
    private String dimensiones;
    private String peso;

    public Chasis() {}

    public Chasis(String tipo, String material, String marca, String modelo, String color, String dimensiones, String peso) {
        this.tipo = tipo;
        this.material = material;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.dimensiones = dimensiones;
        this.peso = peso;
    }

    public void cInfo() {
        System.out.println("♨️Informacion del chasis: ");
        System.out.println("Tipo: " + tipo);
        System.out.println("Material: " + material);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Dimensiones: " + dimensiones);
        System.out.println("Peso: " + peso);
    }
}
