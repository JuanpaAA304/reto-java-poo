package models;

public class Vehiculo {

    private String placa;
    private String marca;
    private String modelo;
    private int año;

    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Vehiculo() {}

    public Vehiculo(String placa, String marca, String modelo, int año) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public void info() {
        System.out.println("🚗Informacion del vehiculo: ");
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
    }

}