import models.*;

public class App {
    public static void main(String[] args) throws Exception {

        // VEHICULOS
        Vehiculo miVehiculo = new Vehiculo();
        miVehiculo.setPlaca("ABC123");
        miVehiculo.setMarca("Toyota");
        miVehiculo.setModelo("Corolla");
        miVehiculo.setAño(2020);

        Vehiculo miVehiculo2 = new Vehiculo();
        miVehiculo2.setPlaca("XYZ789");
        miVehiculo2.setMarca("Honda");
        miVehiculo2.setModelo("Civic");
        miVehiculo2.setAño(2019);

        Vehiculo miVehiculo3 = new Vehiculo();
        miVehiculo3.setPlaca("LMN456");
        miVehiculo3.setMarca("Ford");
        miVehiculo3.setModelo("Focus");
        miVehiculo3.setAño(2021);

        Vehiculo miVehiculo4 = new Vehiculo();
        miVehiculo4.setPlaca("DEF456");
        miVehiculo4.setMarca("Chevrolet");
        miVehiculo4.setModelo("Sonic");
        miVehiculo4.setAño(2022);
       
        System.out.println("🚗Informacion del vehiculo: ");
        System.out.println("Placa: " + miVehiculo.getPlaca());
        System.out.println("Marca: " + miVehiculo.getMarca());
        System.out.println("Modelo: " + miVehiculo.getModelo());
        System.out.println("Año: " + miVehiculo.getAño());

        System.out.println("🚗Informacion del vehiculo 2: ");
        System.out.println("Placa: " + miVehiculo2.getPlaca());
        System.out.println("Marca: " + miVehiculo2.getMarca());
        System.out.println("Modelo: " + miVehiculo2.getModelo());
        System.out.println("Año: " + miVehiculo2.getAño());

        System.out.println("🚗Informacion del vehiculo 3: ");
        System.out.println("Placa: " + miVehiculo3.getPlaca());
        System.out.println("Marca: " + miVehiculo3.getMarca());
        System.out.println("Modelo: " + miVehiculo3.getModelo());
        System.out.println("Año: " + miVehiculo3.getAño());

        System.out.println("🚗Informacion del vehiculo 4: ");
        System.out.println("Placa: " + miVehiculo4.getPlaca());
        System.out.println("Marca: " + miVehiculo4.getMarca());
        System.out.println("Modelo: " + miVehiculo4.getModelo());
        System.out.println("Año: " + miVehiculo4.getAño());

        System.out.println("----------------------");

        // MOTOR

        Motor miMotor = new Motor();
        miMotor.setTipo("Gasolina");
        miMotor.setPotencia(150);
        miMotor.setCilindraje("2000cc");

        Motor miMotor2 = new Motor();
        miMotor2.setTipo("Diesel");
        miMotor2.setPotencia(120);
        miMotor2.setCilindraje("1800cc");

        Motor miMotor3 = new Motor();
        miMotor3.setTipo("Híbrido");
        miMotor3.setPotencia(200);
        miMotor3.setCilindraje("2500cc");

        Motor miMotor4 = new Motor();
        miMotor4.setTipo("Electrico");
        miMotor4.setPotencia(100);
        miMotor4.setCilindraje("1500cc");


        System.out.println("🤖Informacion del motor: ");
        System.out.println("Tipo: " + miMotor.getTipo());
        System.out.println("Potencia: " + miMotor.getPotencia());
        System.out.println("Cilindraje: " + miMotor.getCilindraje());

        System.out.println("🤖Informacion del motor 2: ");
        System.out.println("Tipo: " + miMotor2.getTipo());
        System.out.println("Potencia: " + miMotor2.getPotencia());
        System.out.println("Cilindraje: " + miMotor2.getCilindraje());

        System.out.println("🤖Informacion del motor 3: ");
        System.out.println("Tipo: " + miMotor3.getTipo());
        System.out.println("Potencia: " + miMotor3.getPotencia());
        System.out.println("Cilindraje: " + miMotor3.getCilindraje());

        System.out.println("🤖Informacion del motor 4: ");
        System.out.println("Tipo: " + miMotor4.getTipo());
        System.out.println("Potencia: " + miMotor4.getPotencia());
        System.out.println("Cilindraje: " + miMotor4.getCilindraje());

        System.out.println("----------------------");

        // TRANSMISION

        Transmision miTransmision = new Transmision("Automatica", 6, "Delantera", "Toyota", "Corolla");
        miTransmision.setTipo("Automatica");
        miTransmision.setMarchas(6);
        miTransmision.setTraccion("Delantera");
        miTransmision.setMarca("Toyota");
        miTransmision.setModelo("Corolla");


        Transmision miTransmision2 = new Transmision();
        miTransmision2.setTipo("Manual");
        miTransmision2.setMarchas(5);
        miTransmision2.setTraccion("Trasera");
        miTransmision2.setMarca("Honda");
        miTransmision2.setModelo("Civic");

        Transmision miTransmision3 = new Transmision();
        miTransmision3.setTipo("CVT");
        miTransmision3.setMarchas(7);
        miTransmision3.setTraccion("Delantera");
        miTransmision3.setMarca("Nissan");
        miTransmision3.setModelo("Altima");

        Transmision miTransmision4 = new Transmision();
        miTransmision4.setTipo("Manual");
        miTransmision4.setMarchas(6);
        miTransmision4.setTraccion("Trasera");
        miTransmision4.setMarca("Ford");
        miTransmision4.setModelo("Mustang");

        System.out.println("🚗Informacion de la transmision: ");
        System.out.println("Tipo: " + miTransmision.getTipo());
        System.out.println("Marchas: " + miTransmision.getMarchas());
        System.out.println("Traccion: " + miTransmision.getTraccion());
        System.out.println("Marca: " + miTransmision.getMarca());
        System.out.println("Modelo: " + miTransmision.getModelo());

        System.out.println("🚗Informacion de la transmision 2: ");
        System.out.println("Tipo: " + miTransmision2.getTipo());
        System.out.println("Marchas: " + miTransmision2.getMarchas());
        System.out.println("Traccion: " + miTransmision2.getTraccion());
        System.out.println("Marca: " + miTransmision2.getMarca());
        System.out.println("Modelo: " + miTransmision2.getModelo());

        System.out.println("🚗Informacion de la transmision 3: ");
        System.out.println("Tipo: " + miTransmision3.getTipo());
        System.out.println("Marchas: " + miTransmision3.getMarchas());
        System.out.println("Traccion: " + miTransmision3.getTraccion());
        System.out.println("Marca: " + miTransmision3.getMarca());
        System.out.println("Modelo: " + miTransmision3.getModelo());

        System.out.println("🚗Informacion de la transmision 4: ");
        System.out.println("Tipo: " + miTransmision4.getTipo());
        System.out.println("Marchas: " + miTransmision4.getMarchas());
        System.out.println("Traccion: " + miTransmision4.getTraccion());
        System.out.println("Marca: " + miTransmision4.getMarca());
        System.out.println("Modelo: " + miTransmision4.getModelo());

        System.out.println("----------------------");

        // CHASIS

        Chasis miChasis = new Chasis();
        miChasis.setTipo("Monocasco");
        miChasis.setMaterial("Acero");
        miChasis.setMarca("Toyota");
        miChasis.setModelo("Corolla");
        miChasis.setColor("Blanco");
        miChasis.setDimensiones("4.62m x 1.77m x 1.45m");
        miChasis.setPeso("1300kg");

        Chasis miChasis2 = new Chasis();
        miChasis2.setTipo("Estructura tubular");
        miChasis2.setMaterial("Aluminio");
        miChasis2.setMarca("Honda");
        miChasis2.setModelo("Civic");
        miChasis2.setColor("Negro");
        miChasis2.setDimensiones("4.67m x 1.80m x 1.42m");
        miChasis2.setPeso("1250kg");

        Chasis miChasis3 = new Chasis();
        miChasis3.setTipo("Monocasco");
        miChasis3.setMaterial("Acero");
        miChasis3.setMarca("Nissan");
        miChasis3.setModelo("Altima");
        miChasis3.setColor("Gris");
        miChasis3.setDimensiones("4.90m x 1.85m x 1.45m");
        miChasis3.setPeso("1400kg");

        Chasis miChasis4 = new Chasis();
        miChasis4.setTipo("Estructura tubular");
        miChasis4.setMaterial("Aluminio");
        miChasis4.setMarca("Ford");
        miChasis4.setModelo("Mustang");
        miChasis4.setColor("Rojo");
        miChasis4.setDimensiones("4.78m x 1.91m x 1.38m");
        miChasis4.setPeso("1500kg");


        System.out.println("♨️Informacion del chasis: ");
        System.out.println("Tipo: " + miChasis.getTipo());
        System.out.println("Material: " + miChasis.getMaterial());
        System.out.println("Marca: " + miChasis.getMarca());
        System.out.println("Modelo: " + miChasis.getModelo());
        System.out.println("Color: " + miChasis.getColor());
        System.out.println("Dimensiones: " + miChasis.getDimensiones());
        System.out.println("Peso: " + miChasis.getPeso());

        System.out.println("♨️Informacion del chasis 2: ");
        System.out.println("Tipo: " + miChasis2.getTipo());
        System.out.println("Material: " + miChasis2.getMaterial());
        System.out.println("Marca: " + miChasis2.getMarca());
        System.out.println("Modelo: " + miChasis2.getModelo());
        System.out.println("Color: " + miChasis2.getColor());
        System.out.println("Dimensiones: " + miChasis2.getDimensiones());
        System.out.println("Peso: " + miChasis2.getPeso());

        System.out.println("♨️Informacion del chasis 3: ");
        System.out.println("Tipo: " + miChasis3.getTipo());
        System.out.println("Material: " + miChasis3.getMaterial());
        System.out.println("Marca: " + miChasis3.getMarca());
        System.out.println("Modelo: " + miChasis3.getModelo());
        System.out.println("Color: " + miChasis3.getColor());
        System.out.println("Dimensiones: " + miChasis3.getDimensiones());
        System.out.println("Peso: " + miChasis3.getPeso());

        System.out.println("♨️Informacion del chasis 4: ");
        System.out.println("Tipo: " + miChasis4.getTipo());
        System.out.println("Material: " + miChasis4.getMaterial());
        System.out.println("Marca: " + miChasis4.getMarca());
        System.out.println("Modelo: " + miChasis4.getModelo());
        System.out.println("Color: " + miChasis4.getColor());
        System.out.println("Dimensiones: " + miChasis4.getDimensiones());
        System.out.println("Peso: " + miChasis4.getPeso());

        System.out.println("----------------------");

        // NEUMATICO

        Neumatico miNeumatico = new Neumatico();
        miNeumatico.setTipo("Radial");
        miNeumatico.setMarca("Michelin");
        miNeumatico.setModelo("Primacy 4");
        miNeumatico.setDimensiones("205/55 R16");
        miNeumatico.setPresion("32 PSI");
        miNeumatico.setPeso("10kg");

        Neumatico miNeumatico2 = new Neumatico();
        miNeumatico2.setTipo("Radial");
        miNeumatico2.setMarca("Bridgestone");
        miNeumatico2.setModelo("Dueler H/L 400");
        miNeumatico2.setDimensiones("225/65 R17");
        miNeumatico2.setPresion("34 PSI");
        miNeumatico2.setPeso("12kg");

        Neumatico miNeumatico3 = new Neumatico();
        miNeumatico3.setTipo("Radial");
        miNeumatico3.setMarca("Goodyear");
        miNeumatico3.setModelo("Eagle F1 Asymmetric 3");
        miNeumatico3.setDimensiones("245/40 R18");
        miNeumatico3.setPresion("36 PSI");
        miNeumatico3.setPeso("11kg");

        Neumatico miNeumatico4 = new Neumatico();
        miNeumatico4.setTipo("Radial");
        miNeumatico4.setMarca("Pirelli");
        miNeumatico4.setModelo("Cinturato P7");
        miNeumatico4.setDimensiones("195/65 R15");
        miNeumatico4.setPresion("30 PSI");
        miNeumatico4.setPeso("9kg");

        System.out.println("🛞Informacion del neumatico: ");
        System.out.println("Tipo: " + miNeumatico.getTipo());
        System.out.println("Marca: " + miNeumatico.getMarca());
        System.out.println("Modelo: " + miNeumatico.getModelo());
        System.out.println("Dimensiones: " + miNeumatico.getDimensiones());
        System.out.println("Presion: " + miNeumatico.getPresion());
        System.out.println("Peso: " + miNeumatico.getPeso());

        System.out.println("🛞Informacion del neumatico 2: ");
        System.out.println("Tipo: " + miNeumatico2.getTipo());
        System.out.println("Marca: " + miNeumatico2.getMarca());
        System.out.println("Modelo: " + miNeumatico2.getModelo());
        System.out.println("Dimensiones: " + miNeumatico2.getDimensiones());
        System.out.println("Presion: " + miNeumatico2.getPresion());
        System.out.println("Peso: " + miNeumatico2.getPeso());

        System.out.println("🛞Informacion del neumatico 3: ");
        System.out.println("Tipo: " + miNeumatico3.getTipo());
        System.out.println("Marca: " + miNeumatico3.getMarca());
        System.out.println("Modelo: " + miNeumatico3.getModelo());
        System.out.println("Dimensiones: " + miNeumatico3.getDimensiones());
        System.out.println("Presion: " + miNeumatico3.getPresion());
        System.out.println("Peso: " + miNeumatico3.getPeso());

        System.out.println("🛞Informacion del neumatico 4: ");
        System.out.println("Tipo: " + miNeumatico4.getTipo());
        System.out.println("Marca: " + miNeumatico4.getMarca());
        System.out.println("Modelo: " + miNeumatico4.getModelo());
        System.out.println("Dimensiones: " + miNeumatico4.getDimensiones());
        System.out.println("Presion: " + miNeumatico4.getPresion());
        System.out.println("Peso: " + miNeumatico4.getPeso());

        System.out.println("----------------------");

        // SISTEMA ELECTRICO

        SistemaElectrico miSistemaElectrico = new SistemaElectrico();
        miSistemaElectrico.setTipo("Híbrido");
        miSistemaElectrico.setMarca("Toyota");
        miSistemaElectrico.setModelo("Corolla");
        miSistemaElectrico.setBateria("Lithium-ion");
        miSistemaElectrico.setLuces("LED");
        miSistemaElectrico.setSensores("Presión de neumáticos, temperatura del motor");

        SistemaElectrico miSistemaElectrico2 = new SistemaElectrico();
        miSistemaElectrico2.setTipo("Gasolina");
        miSistemaElectrico2.setMarca("Honda");
        miSistemaElectrico2.setModelo("Civic");
        miSistemaElectrico2.setBateria("Ácido-plomo");
        miSistemaElectrico2.setLuces("Halógenas");
        miSistemaElectrico2.setSensores("ABS, control de tracción");

        SistemaElectrico miSistemaElectrico3 = new SistemaElectrico();
        miSistemaElectrico3.setTipo("Eléctrico");
        miSistemaElectrico3.setMarca("Nissan");
        miSistemaElectrico3.setModelo("Leaf");
        miSistemaElectrico3.setBateria("Lithium-ion");
        miSistemaElectrico3.setLuces("LED");
        miSistemaElectrico3.setSensores("Control de estabilidad, asistencia de arranque en pendiente");

        SistemaElectrico miSistemaElectrico4 = new SistemaElectrico();
        miSistemaElectrico4.setTipo("Gasolina");
        miSistemaElectrico4.setMarca("Ford");
        miSistemaElectrico4.setModelo("Mustang");
        miSistemaElectrico4.setBateria("Ácido-plomo");
        miSistemaElectrico4.setLuces("Xenón");
        miSistemaElectrico4.setSensores("Control de tracción, asistencia de frenado");
        

        System.out.println("🔋Informacion del sistema electrico: ");
        System.out.println("Tipo: " + miSistemaElectrico.getTipo());
        System.out.println("Marca: " + miSistemaElectrico.getMarca());
        System.out.println("Modelo: " + miSistemaElectrico.getModelo());
        System.out.println("Batería: " + miSistemaElectrico.getBateria());
        System.out.println("Luces: " + miSistemaElectrico.getLuces());
        System.out.println("Sensores: " + miSistemaElectrico.getSensores());

        System.out.println("🔋Informacion del sistema electrico 2: ");
        System.out.println("Tipo: " + miSistemaElectrico2.getTipo());
        System.out.println("Marca: " + miSistemaElectrico2.getMarca());
        System.out.println("Modelo: " + miSistemaElectrico2.getModelo());
        System.out.println("Batería: " + miSistemaElectrico2.getBateria());
        System.out.println("Luces: " + miSistemaElectrico2.getLuces());
        System.out.println("Sensores: " + miSistemaElectrico2.getSensores());

        System.out.println("🔋Informacion del sistema electrico 3: ");
        System.out.println("Tipo: " + miSistemaElectrico3.getTipo());
        System.out.println("Marca: " + miSistemaElectrico3.getMarca());
        System.out.println("Modelo: " + miSistemaElectrico3.getModelo());
        System.out.println("Batería: " + miSistemaElectrico3.getBateria());
        System.out.println("Luces: " + miSistemaElectrico3.getLuces());
        System.out.println("Sensores: " + miSistemaElectrico3.getSensores());

        System.out.println("🔋Informacion del sistema electrico 4: ");
        System.out.println("Tipo: " + miSistemaElectrico4.getTipo());
        System.out.println("Marca: " + miSistemaElectrico4.getMarca());
        System.out.println("Modelo: " + miSistemaElectrico4.getModelo());
        System.out.println("Batería: " + miSistemaElectrico4.getBateria());
        System.out.println("Luces: " + miSistemaElectrico4.getLuces());
        System.out.println("Sensores: " + miSistemaElectrico4.getSensores());

        System.out.println("----------------------");

        // SISTEMA DE FRENOS

        SistemaFrenos miSistemaFrenos = new SistemaFrenos();
        miSistemaFrenos.setTipo("Disco");
        miSistemaFrenos.setMarca("Toyota");
        miSistemaFrenos.setModelo("Corolla");
        miSistemaFrenos.setDiscos("Delanteros y traseros");
        miSistemaFrenos.setAbs("Sí");
        miSistemaFrenos.setEstado("Operativo");

        SistemaFrenos miSistemaFrenos2 = new SistemaFrenos();
        miSistemaFrenos2.setTipo("Tambor");
        miSistemaFrenos2.setMarca("Honda");
        miSistemaFrenos2.setModelo("Civic");
        miSistemaFrenos2.setDiscos("Traseros");
        miSistemaFrenos2.setAbs("No");
        miSistemaFrenos2.setEstado("Operativo");

        SistemaFrenos miSistemaFrenos3 = new SistemaFrenos();
        miSistemaFrenos3.setTipo("Disco");
        miSistemaFrenos3.setMarca("Nissan");
        miSistemaFrenos3.setModelo("Altima");
        miSistemaFrenos3.setDiscos("Delanteros y traseros");
        miSistemaFrenos3.setAbs("Sí");
        miSistemaFrenos3.setEstado("Operativo");

        SistemaFrenos miSistemaFrenos4 = new SistemaFrenos();
        miSistemaFrenos4.setTipo("Disco");
        miSistemaFrenos4.setMarca("Ford");
        miSistemaFrenos4.setModelo("Mustang");
        miSistemaFrenos4.setDiscos("Delanteros y traseros");
        miSistemaFrenos4.setAbs("Sí");
        miSistemaFrenos4.setEstado("Operativo");

        System.out.println("🛑Informacion del sistema de frenos: ");
        System.out.println("Tipo: " + miSistemaFrenos.getTipo());
        System.out.println("Marca: " + miSistemaFrenos.getMarca());
        System.out.println("Modelo: " + miSistemaFrenos.getModelo());
        System.out.println("Discos: " + miSistemaFrenos.getDiscos());
        System.out.println("ABS: " + miSistemaFrenos.getAbs());
        System.out.println("Estado: " + miSistemaFrenos.getEstado());

        System.out.println("🛑Informacion del sistema de frenos 2: ");
        System.out.println("Tipo: " + miSistemaFrenos2.getTipo());
        System.out.println("Marca: " + miSistemaFrenos2.getMarca());
        System.out.println("Modelo: " + miSistemaFrenos2.getModelo());
        System.out.println("Discos: " + miSistemaFrenos2.getDiscos());
        System.out.println("ABS: " + miSistemaFrenos2.getAbs());
        System.out.println("Estado: " + miSistemaFrenos2.getEstado());

        System.out.println("🛑Informacion del sistema de frenos 3: ");
        System.out.println("Tipo: " + miSistemaFrenos3.getTipo());
        System.out.println("Marca: " + miSistemaFrenos3.getMarca());
        System.out.println("Modelo: " + miSistemaFrenos3.getModelo());
        System.out.println("Discos: " + miSistemaFrenos3.getDiscos());
        System.out.println("ABS: " + miSistemaFrenos3.getAbs());
        System.out.println("Estado: " + miSistemaFrenos3.getEstado());

        System.out.println("🛑Informacion del sistema de frenos 4: ");
        System.out.println("Tipo: " + miSistemaFrenos4.getTipo());
        System.out.println("Marca: " + miSistemaFrenos4.getMarca());
        System.out.println("Modelo: " + miSistemaFrenos4.getModelo());
        System.out.println("Discos: " + miSistemaFrenos4.getDiscos());
        System.out.println("ABS: " + miSistemaFrenos4.getAbs());
        System.out.println("Estado: " + miSistemaFrenos4.getEstado());

        System.out.println("----------------------");

        // REGISTRO VEHICULAR

        RegistroVehicular miRegistroVehicular = new RegistroVehicular();
        miRegistroVehicular.setPlaca("ABC123");
        miRegistroVehicular.setMarca("Toyota");
        miRegistroVehicular.setModelo("Corolla");
        miRegistroVehicular.setAño(2020);
        miRegistroVehicular.setTipo("Sedán");
        miRegistroVehicular.setTransmision("Automática");
        miRegistroVehicular.setMotor("Gasolina");
        miRegistroVehicular.setNeumatico("Radial");
        miRegistroVehicular.setMatricula("123456");
        miRegistroVehicular.setPropietario("Juan Pérez");
        miRegistroVehicular.setFechaRegistro("2020-01-01");

        RegistroVehicular miRegistroVehicular2 = new RegistroVehicular();
        miRegistroVehicular2.setPlaca("XYZ789");
        miRegistroVehicular2.setMarca("Honda");
        miRegistroVehicular2.setModelo("Civic");
        miRegistroVehicular2.setAño(2019);
        miRegistroVehicular2.setTipo("Hatchback");
        miRegistroVehicular2.setTransmision("Manual");
        miRegistroVehicular2.setMotor("Gasolina");
        miRegistroVehicular2.setNeumatico("Radial");
        miRegistroVehicular2.setMatricula("654321");
        miRegistroVehicular2.setPropietario("María López");
        miRegistroVehicular2.setFechaRegistro("2019-05-15");

        RegistroVehicular miRegistroVehicular3 = new RegistroVehicular();
        miRegistroVehicular3.setPlaca("LMN456");
        miRegistroVehicular3.setMarca("Ford");
        miRegistroVehicular3.setModelo("Focus");
        miRegistroVehicular3.setAño(2021);
        miRegistroVehicular3.setTipo("Sedán");
        miRegistroVehicular3.setTransmision("Automática");
        miRegistroVehicular3.setMotor("Gasolina");
        miRegistroVehicular3.setNeumatico("Radial");
        miRegistroVehicular3.setMatricula("789012");
        miRegistroVehicular3.setPropietario("Carlos García");
        miRegistroVehicular3.setFechaRegistro("2021-03-10");

        RegistroVehicular miRegistroVehicular4 = new RegistroVehicular();
        miRegistroVehicular4.setPlaca("DEF456");
        miRegistroVehicular4.setMarca("Chevrolet");
        miRegistroVehicular4.setModelo("Sonic");
        miRegistroVehicular4.setAño(2022);
        miRegistroVehicular4.setTipo("Hatchback");
        miRegistroVehicular4.setTransmision("Manual");
        miRegistroVehicular4.setMotor("Gasolina");
        miRegistroVehicular4.setNeumatico("Radial");
        miRegistroVehicular4.setMatricula("345678");
        miRegistroVehicular4.setPropietario("Ana Torres");
        miRegistroVehicular4.setFechaRegistro("2022-07-20");

        System.out.println("🚗Registro del vehiculo: ");
        System.out.println("Placa: " + miRegistroVehicular.getPlaca());
        System.out.println("Marca: " + miRegistroVehicular.getMarca());
        System.out.println("Modelo: " + miRegistroVehicular.getModelo());
        System.out.println("Año: " + miRegistroVehicular.getAño());
        System.out.println("Tipo: " + miRegistroVehicular.getTipo());
        System.out.println("Transmision: " + miRegistroVehicular.getTransmision());
        System.out.println("Motor: " + miRegistroVehicular.getMotor());
        System.out.println("Neumatico: " + miRegistroVehicular.getNeumatico());
        System.out.println("Matricula: " + miRegistroVehicular.getMatricula());
        System.out.println("Propietario: " + miRegistroVehicular.getPropietario());
        System.out.println("Fecha de registro: " + miRegistroVehicular.getFechaRegistro());

        System.out.println("🚗Registro del vehiculo 2: ");
        System.out.println("Placa: " + miRegistroVehicular2.getPlaca());
        System.out.println("Marca: " + miRegistroVehicular2.getMarca());
        System.out.println("Modelo: " + miRegistroVehicular2.getModelo());
        System.out.println("Año: " + miRegistroVehicular2.getAño());
        System.out.println("Tipo: " + miRegistroVehicular2.getTipo());
        System.out.println("Transmision: " + miRegistroVehicular2.getTransmision());
        System.out.println("Motor: " + miRegistroVehicular2.getMotor());
        System.out.println("Neumatico: " + miRegistroVehicular2.getNeumatico());
        System.out.println("Matricula: " + miRegistroVehicular2.getMatricula());
        System.out.println("Propietario: " + miRegistroVehicular2.getPropietario());
        System.out.println("Fecha de registro: " + miRegistroVehicular2.getFechaRegistro());

        System.out.println("🚗Registro del vehiculo 3: ");
        System.out.println("Placa: " + miRegistroVehicular3.getPlaca());
        System.out.println("Marca: " + miRegistroVehicular3.getMarca());
        System.out.println("Modelo: " + miRegistroVehicular3.getModelo());
        System.out.println("Año: " + miRegistroVehicular3.getAño());
        System.out.println("Tipo: " + miRegistroVehicular3.getTipo());
        System.out.println("Transmision: " + miRegistroVehicular3.getTransmision());
        System.out.println("Motor: " + miRegistroVehicular3.getMotor());
        System.out.println("Neumatico: " + miRegistroVehicular3.getNeumatico());
        System.out.println("Matricula: " + miRegistroVehicular3.getMatricula());
        System.out.println("Propietario: " + miRegistroVehicular3.getPropietario());
        System.out.println("Fecha de registro: " + miRegistroVehicular3.getFechaRegistro());

        System.out.println("🚗Registro del vehiculo 4: ");
        System.out.println("Placa: " + miRegistroVehicular4.getPlaca());
        System.out.println("Marca: " + miRegistroVehicular4.getMarca());
        System.out.println("Modelo: " + miRegistroVehicular4.getModelo());
        System.out.println("Año: " + miRegistroVehicular4.getAño());
        System.out.println("Tipo: " + miRegistroVehicular4.getTipo());
        System.out.println("Transmision: " + miRegistroVehicular4.getTransmision());
        System.out.println("Motor: " + miRegistroVehicular4.getMotor());
        System.out.println("Neumatico: " + miRegistroVehicular4.getNeumatico());
        System.out.println("Matricula: " + miRegistroVehicular4.getMatricula());
        System.out.println("Propietario: " + miRegistroVehicular4.getPropietario());
        System.out.println("Fecha de registro: " + miRegistroVehicular4.getFechaRegistro());


        System.out.println("----------------------");

        // MANTENIMIENTO

        Mantenimiento miMantenimiento = new Mantenimiento();
        miMantenimiento.setTipo("Cambio de aceite");
        miMantenimiento.setMarca("Toyota");
        miMantenimiento.setModelo("Corolla");
        miMantenimiento.setFecha("2023-01-01");
        miMantenimiento.setKilometraje("50000 km");
        miMantenimiento.setCosto("100 USD");
        miMantenimiento.setTaller("Taller Mecánico");
        miMantenimiento.setObservaciones("Cambio de aceite y filtro");
        miMantenimiento.setPiezas_cambiadas("Aceite, filtro de aceite");

        Mantenimiento miMantenimiento2 = new Mantenimiento();
        miMantenimiento2.setTipo("Cambio de frenos");
        miMantenimiento2.setMarca("Honda");
        miMantenimiento2.setModelo("Civic");
        miMantenimiento2.setFecha("2023-02-15");
        miMantenimiento2.setKilometraje("60000 km");
        miMantenimiento2.setCosto("200 USD");
        miMantenimiento2.setTaller("Taller de Frenos");
        miMantenimiento2.setObservaciones("Cambio de pastillas y discos de freno");
        miMantenimiento2.setPiezas_cambiadas("Pastillas de freno, discos de freno");

        Mantenimiento miMantenimiento3 = new Mantenimiento();
        miMantenimiento3.setTipo("Cambio de batería");
        miMantenimiento3.setMarca("Nissan");
        miMantenimiento3.setModelo("Altima");
        miMantenimiento3.setFecha("2023-03-10");
        miMantenimiento3.setKilometraje("70000 km");
        miMantenimiento3.setCosto("150 USD");
        miMantenimiento3.setTaller("Taller de Baterías");
        miMantenimiento3.setObservaciones("Cambio de batería");
        miMantenimiento3.setPiezas_cambiadas("Batería");

        Mantenimiento miMantenimiento4 = new Mantenimiento();
        miMantenimiento4.setTipo("Cambio de neumáticos");
        miMantenimiento4.setMarca("Ford");
        miMantenimiento4.setModelo("Mustang");
        miMantenimiento4.setFecha("2023-04-20");
        miMantenimiento4.setKilometraje("80000 km");
        miMantenimiento4.setCosto("400 USD");
        miMantenimiento4.setTaller("Taller de Neumáticos");
        miMantenimiento4.setObservaciones("Cambio de neumáticos");
        miMantenimiento4.setPiezas_cambiadas("Neumáticos");


        System.out.println("🔧Informacion del mantenimiento: ");
        System.out.println("Tipo: " + miMantenimiento.getTipo());
        System.out.println("Marca: " + miMantenimiento.getMarca());
        System.out.println("Modelo: " + miMantenimiento.getModelo());
        System.out.println("Fecha: " + miMantenimiento.getFecha());
        System.out.println("Kilometraje: " + miMantenimiento.getKilometraje());
        System.out.println("Costo: " + miMantenimiento.getCosto());
        System.out.println("Taller: " + miMantenimiento.getTaller());
        System.out.println("Observaciones: " + miMantenimiento.getObservaciones());
        System.out.println("Piezas cambiadas: " + miMantenimiento.getPiezas_cambiadas());

        System.out.println("🔧Informacion del mantenimiento 2: ");
        System.out.println("Tipo: " + miMantenimiento2.getTipo());
        System.out.println("Marca: " + miMantenimiento2.getMarca());
        System.out.println("Modelo: " + miMantenimiento2.getModelo());
        System.out.println("Fecha: " + miMantenimiento2.getFecha());
        System.out.println("Kilometraje: " + miMantenimiento2.getKilometraje());
        System.out.println("Costo: " + miMantenimiento2.getCosto());
        System.out.println("Taller: " + miMantenimiento2.getTaller());
        System.out.println("Observaciones: " + miMantenimiento2.getObservaciones());
        System.out.println("Piezas cambiadas: " + miMantenimiento2.getPiezas_cambiadas());

        System.out.println("🔧Informacion del mantenimiento 3: ");
        System.out.println("Tipo: " + miMantenimiento3.getTipo());
        System.out.println("Marca: " + miMantenimiento3.getMarca());
        System.out.println("Modelo: " + miMantenimiento3.getModelo());
        System.out.println("Fecha: " + miMantenimiento3.getFecha());
        System.out.println("Kilometraje: " + miMantenimiento3.getKilometraje());
        System.out.println("Costo: " + miMantenimiento3.getCosto());
        System.out.println("Taller: " + miMantenimiento3.getTaller());
        System.out.println("Observaciones: " + miMantenimiento3.getObservaciones());
        System.out.println("Piezas cambiadas: " + miMantenimiento3.getPiezas_cambiadas());

        System.out.println("🔧Informacion del mantenimiento 4: ");
        System.out.println("Tipo: " + miMantenimiento4.getTipo());
        System.out.println("Marca: " + miMantenimiento4.getMarca());
        System.out.println("Modelo: " + miMantenimiento4.getModelo());
        System.out.println("Fecha: " + miMantenimiento4.getFecha());
        System.out.println("Kilometraje: " + miMantenimiento4.getKilometraje());
        System.out.println("Costo: " + miMantenimiento4.getCosto());
        System.out.println("Taller: " + miMantenimiento4.getTaller());
        System.out.println("Observaciones: " + miMantenimiento4.getObservaciones());
        System.out.println("Piezas cambiadas: " + miMantenimiento4.getPiezas_cambiadas());

        
        System.out.println("----------------------");

        Sensor miSensor = new Sensor();
        miSensor.setTipo("Temperatura");
        miSensor.setMarca("Bosch");
        miSensor.setModelo("BME280");
        miSensor.setVelocidad("1000 Hz");
        miSensor.setTemperatura("25 °C");
        miSensor.setPresion("1013 hPa");

        Sensor miSensor2 = new Sensor();
        miSensor2.setTipo("Presión");
        miSensor2.setMarca("Honeywell");
        miSensor2.setModelo("HSC");
        miSensor2.setVelocidad("500 Hz");
        miSensor2.setTemperatura("30 °C");
        miSensor2.setPresion("1000 hPa");

        Sensor miSensor3 = new Sensor();
        miSensor3.setTipo("Humedad");
        miSensor3.setMarca("Sensirion");
        miSensor3.setModelo("SHT31");
        miSensor3.setVelocidad("200 Hz");
        miSensor3.setTemperatura("20 °C");
        miSensor3.setPresion("950 hPa");

        Sensor miSensor4 = new Sensor();
        miSensor4.setTipo("Acelerómetro");
        miSensor4.setMarca("STMicroelectronics");
        miSensor4.setModelo("LIS3DH");
        miSensor4.setVelocidad("100 Hz");
        miSensor4.setTemperatura("15 °C");
        miSensor4.setPresion("980 hPa");

        System.out.println("🛠️Informacion del sensor: ");
        System.out.println("Tipo: " + miSensor.getTipo());
        System.out.println("Marca: " + miSensor.getMarca());
        System.out.println("Modelo: " + miSensor.getModelo());
        System.out.println("Velocidad: " + miSensor.getVelocidad());
        System.out.println("Temperatura: " + miSensor.getTemperatura());
        System.out.println("Presion: " + miSensor.getPresion());

        System.out.println("🛠️Informacion del sensor 2: ");
        System.out.println("Tipo: " + miSensor2.getTipo());
        System.out.println("Marca: " + miSensor2.getMarca());
        System.out.println("Modelo: " + miSensor2.getModelo());
        System.out.println("Velocidad: " + miSensor2.getVelocidad());
        System.out.println("Temperatura: " + miSensor2.getTemperatura());
        System.out.println("Presion: " + miSensor2.getPresion());

        System.out.println("🛠️Informacion del sensor 3: ");
        System.out.println("Tipo: " + miSensor3.getTipo());
        System.out.println("Marca: " + miSensor3.getMarca());
        System.out.println("Modelo: " + miSensor3.getModelo());
        System.out.println("Velocidad: " + miSensor3.getVelocidad());
        System.out.println("Temperatura: " + miSensor3.getTemperatura());
        System.out.println("Presion: " + miSensor3.getPresion());

        System.out.println("🛠️Informacion del sensor 4: ");
        System.out.println("Tipo: " + miSensor4.getTipo());
        System.out.println("Marca: " + miSensor4.getMarca());
        System.out.println("Modelo: " + miSensor4.getModelo());
        System.out.println("Velocidad: " + miSensor4.getVelocidad());
        System.out.println("Temperatura: " + miSensor4.getTemperatura());
        System.out.println("Presion: " + miSensor4.getPresion());

        System.out.println("----------------------");
    }
}
    
    
