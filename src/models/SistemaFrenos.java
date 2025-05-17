package models;

public class SistemaFrenos {
    private String tipo;
    private String marca;
    private String modelo;
    private String discos;
    private String abs;
    private String estado;

    public SistemaFrenos() {}

    public SistemaFrenos(String tipo, String marca, String modelo, String discos, String abs, String estado) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.discos = discos;
        this.abs = abs;
        this.estado = estado;
    }

    public void sfInfo() {
        System.out.println("🛑Informacion del sistema de frenos: ");
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Discos: " + discos);
        System.out.println("ABS: " + abs);
        System.out.println("Estado: " + estado);
    }
}
