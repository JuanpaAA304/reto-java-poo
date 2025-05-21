package models;

public class Neumatico {
    private String tipo;
    private String marca;
    private String modelo;
    private String dimensiones;
    private String presion;
    private String peso;

    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getPresion() {
        return presion;
    }

    public void setPresion(String presion) {
        this.presion = presion;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

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
