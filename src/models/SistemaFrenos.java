package models;

public class SistemaFrenos {
    private String tipo;
    private String marca;
    private String modelo;
    private String discos;
    private String abs;
    private String estado;

    

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

    public String getDiscos() {
        return discos;
    }

    public void setDiscos(String discos) {
        this.discos = discos;
    }

    public String getAbs() {
        return abs;
    }

    public void setAbs(String abs) {
        this.abs = abs;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

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
