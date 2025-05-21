package models;

public class Mantenimiento {
    private String tipo;
    private String marca;
    private String modelo;
    private String fecha;
    private String kilometraje;
    private String costo;
    private String taller;
    private String observaciones;
    private String piezas_cambiadas;

    

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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getTaller() {
        return taller;
    }

    public void setTaller(String taller) {
        this.taller = taller;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getPiezas_cambiadas() {
        return piezas_cambiadas;
    }

    public void setPiezas_cambiadas(String piezas_cambiadas) {
        this.piezas_cambiadas = piezas_cambiadas;
    }

    public Mantenimiento() {}

    public Mantenimiento(String tipo, String marca, String modelo, String fecha, String kilometraje, String costo, String taller, String observaciones, String piezas_cambiadas) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.fecha = fecha;
        this.kilometraje = kilometraje;
        this.costo = costo;
        this.taller = taller;
        this.observaciones = observaciones;
        this.piezas_cambiadas = piezas_cambiadas;
    }

    public void maInfo() {
        System.out.println("🔧Informacion del mantenimiento: ");
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Fecha: " + fecha);
        System.out.println("Kilometraje: " + kilometraje);
        System.out.println("Costo: " + costo);
        System.out.println("Taller: " + taller);
        System.out.println("Observaciones: " + observaciones);
        System.out.println("Piezas cambiadas: " + piezas_cambiadas);
    }
}
