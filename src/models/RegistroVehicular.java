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
