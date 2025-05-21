package models;

public class Chasis {
    private String tipo;
    private String material;
    private String marca;
    private String modelo;
    private String color;
    private String dimensiones;
    private String peso;



    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

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
