package models;

public class Vehiculo {

    private String placa;
    private String marca;
    private String modelo;
    private int año;

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