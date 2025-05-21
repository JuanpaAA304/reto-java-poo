package models;

public class RegistroVehicular {
    private String placa;
    private String marca;
    private String modelo;
    private int año;
    private String tipo;
    private String transmision;
    private String motor;
    private String neumatico;
    private String matricula;
    private String propietario;
    private String fechaRegistro;

    

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getNeumatico() {
        return neumatico;
    }

    public void setNeumatico(String neumatico) {
        this.neumatico = neumatico;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public RegistroVehicular() {}

    public RegistroVehicular(String placa, String marca, String modelo, int año, String tipo, String transmision, String motor, String neumatico, String matricula, String propietario, String fechaRegistro) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.tipo = tipo;
        this.transmision = transmision;
        this.motor = motor;
        this.neumatico = neumatico;
        this.matricula = matricula;
        this.propietario = propietario;
        this.fechaRegistro = fechaRegistro;
    }

    public void reInfo() {
        System.out.println("🚗Registro del vehiculo: ");
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Tipo: " + tipo);
        System.out.println("Transmision: " + transmision);
        System.out.println("Motor: " + motor);
        System.out.println("Neumatico: " + neumatico);
        System.out.println("Matricula: " + matricula);
        System.out.println("Propietario: " + propietario);
        System.out.println("Fecha de registro: " + fechaRegistro);
    }



}
