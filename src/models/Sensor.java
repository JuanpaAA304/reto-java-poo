package models;

public class Sensor {
    private String tipo;
    private String marca;
    private String modelo;
    private String velocidad;
    private String temperatura;
    private String presion; 

    

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

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getPresion() {
        return presion;
    }

    public void setPresion(String presion) {
        this.presion = presion;
    }

    public Sensor() {}

    public Sensor(String tipo, String marca, String modelo, String velocidad, String temperatura, String presion) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.temperatura = temperatura;
        this.presion = presion;
    }

    public void sInfo() {
        System.out.println("🛠️Informacion del sensor: ");
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Presion: " + presion);
    }
}
