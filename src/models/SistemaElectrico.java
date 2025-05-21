package models;

public class SistemaElectrico {
    private String tipo;
    private String marca;
    private String modelo;
    private String bateria;
    private String luces;
    private String sensores;


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

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public String getLuces() {
        return luces;
    }

    public void setLuces(String luces) {
        this.luces = luces;
    }

    public String getSensores() {
        return sensores;
    }

    public void setSensores(String sensores) {
        this.sensores = sensores;
    }

    public SistemaElectrico() {}

    public SistemaElectrico(String tipo, String marca, String modelo, String bateria, String luces, String sensores) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.luces = luces;
        this.sensores = sensores;
    }

    public void seInfo() {
        System.out.println("🔋Informacion del sistema electrico: ");
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Bateria: " + bateria);
        System.out.println("Luces: " + luces);
        System.out.println("Sensores: " + sensores);
    }
}
