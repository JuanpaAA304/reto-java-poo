package models;

public class Motor {
    private String tipo;
    private int potencia;
    private String cilindraje;


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

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
