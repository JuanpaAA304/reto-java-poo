package models;

public class Motor {
    private String tipo;
    private int potencia;
    private String cilindraje;

    public Motor() {}

    public Motor(String tipo, int potencia, String cilindraje) {
        this.tipo = tipo;
        this.potencia = potencia;
        this.cilindraje = cilindraje;
    }

    public void mInfo() {
        System.out.println("🤖Informacion del motor: ");
        System.out.println("Tipo: " + tipo);
        System.out.println("Potencia: " + potencia);
        System.out.println("Marca: " + cilindraje);
    }
}
