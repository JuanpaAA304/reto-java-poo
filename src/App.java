import models.*;

public class App {
    public static void main(String[] args) throws Exception {
        // VEHICULO 1
        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.setPlaca("ABC123");
        vehiculo1.setMarca("Toyota");
        vehiculo1.setModelo("Corolla");
        vehiculo1.setAño(2020);

        Motor motor1 = new Motor();
        motor1.setTipo("Gasolina");
        motor1.setPotencia(150);
        motor1.setCilindraje("2000cc");

        Transmision transmision1 = new Transmision("Automatica", 6, "Delantera", "Toyota", "Corolla");

        Chasis chasis1 = new Chasis();
        chasis1.setTipo("Monocasco");
        chasis1.setMaterial("Acero");
        chasis1.setMarca("Toyota");
        chasis1.setModelo("Corolla");
        chasis1.setColor("Blanco");
        chasis1.setDimensiones("4.62m x 1.77m x 1.45m");
        chasis1.setPeso("1300kg");

        Neumatico neumatico1 = new Neumatico();
        neumatico1.setTipo("Radial");
        neumatico1.setMarca("Michelin");
        neumatico1.setModelo("Primacy 4");
        neumatico1.setDimensiones("205/55 R16");
        neumatico1.setPresion("32 PSI");
        neumatico1.setPeso("10kg");

        SistemaElectrico sistemaElectrico1 = new SistemaElectrico();
        sistemaElectrico1.setTipo("Híbrido");
        sistemaElectrico1.setMarca("Toyota");
        sistemaElectrico1.setModelo("Corolla");
        sistemaElectrico1.setBateria("Lithium-ion");
        sistemaElectrico1.setLuces("LED");
        sistemaElectrico1.setSensores("Presión de neumáticos, temperatura del motor");

        SistemaFrenos frenos1 = new SistemaFrenos();
        frenos1.setTipo("Disco");
        frenos1.setMarca("Toyota");
        frenos1.setModelo("Corolla");
        frenos1.setDiscos("Delanteros y traseros");
        frenos1.setAbs("Sí");
        frenos1.setEstado("Operativo");

        RegistroVehicular registro1 = new RegistroVehicular();
        registro1.setPlaca("ABC123");
        registro1.setMarca("Toyota");
        registro1.setModelo("Corolla");
        registro1.setAño(2020);
        registro1.setTipo("Sedán");
        registro1.setTransmision("Automática");
        registro1.setMotor("Gasolina");
        registro1.setNeumatico("Radial");
        registro1.setMatricula("123456");
        registro1.setPropietario("Juan Pérez");
        registro1.setFechaRegistro("2020-01-01");

        Mantenimiento mantenimiento1 = new Mantenimiento();
        mantenimiento1.setTipo("Cambio de aceite");
        mantenimiento1.setMarca("Toyota");
        mantenimiento1.setModelo("Corolla");
        mantenimiento1.setFecha("2023-01-01");
        mantenimiento1.setKilometraje("50000 km");
        mantenimiento1.setCosto("100 USD");
        mantenimiento1.setTaller("Taller Mecánico");
        mantenimiento1.setObservaciones("Cambio de aceite y filtro");
        mantenimiento1.setPiezas_cambiadas("Aceite, filtro de aceite");

        Sensor sensor1 = new Sensor();
        sensor1.setTipo("Temperatura");
        sensor1.setMarca("Bosch");
        sensor1.setModelo("BME280");
        sensor1.setVelocidad("1000 Hz");
        sensor1.setTemperatura("25 °C");
        sensor1.setPresion("1013 hPa");

        System.out.println("🚗 Vehiculo 1:");
        System.out.println("Placa: " + vehiculo1.getPlaca());
        System.out.println("Marca: " + vehiculo1.getMarca());
        System.out.println("Modelo: " + vehiculo1.getModelo());
        System.out.println("Año: " + vehiculo1.getAño());
        System.out.println("Motor: " + motor1.getTipo() + ", " + motor1.getPotencia() + "hp, " + motor1.getCilindraje());
        System.out.println("Transmision: " + transmision1.getTipo() + ", " + transmision1.getMarchas() + " marchas, " + transmision1.getTraccion());
        System.out.println("Chasis: " + chasis1.getTipo() + ", " + chasis1.getMaterial() + ", " + chasis1.getColor() + ", " + chasis1.getDimensiones() + ", " + chasis1.getPeso());
        System.out.println("Neumatico: " + neumatico1.getMarca() + " " + neumatico1.getModelo() + ", " + neumatico1.getDimensiones() + ", " + neumatico1.getPresion());
        System.out.println("Sistema Electrico: " + sistemaElectrico1.getTipo() + ", Batería: " + sistemaElectrico1.getBateria() + ", Luces: " + sistemaElectrico1.getLuces() + ", Sensores: " + sistemaElectrico1.getSensores());
        System.out.println("Frenos: " + frenos1.getTipo() + ", Discos: " + frenos1.getDiscos() + ", ABS: " + frenos1.getAbs());
        System.out.println("Registro: " + registro1.getMatricula() + ", Propietario: " + registro1.getPropietario() + ", Fecha: " + registro1.getFechaRegistro());
        System.out.println("Mantenimiento: " + mantenimiento1.getTipo() + ", Fecha: " + mantenimiento1.getFecha() + ", Taller: " + mantenimiento1.getTaller() + ", Observaciones: " + mantenimiento1.getObservaciones());
        System.out.println("Sensor: " + sensor1.getTipo() + ", Marca: " + sensor1.getMarca() + ", Modelo: " + sensor1.getModelo() + ", Temp: " + sensor1.getTemperatura() + ", Presion: " + sensor1.getPresion());
        System.out.println("----------------------");

        // VEHICULO 2
        Vehiculo vehiculo2 = new Vehiculo();
        vehiculo2.setPlaca("XYZ789");
        vehiculo2.setMarca("Honda");
        vehiculo2.setModelo("Civic");
        vehiculo2.setAño(2019);

        Motor motor2 = new Motor();
        motor2.setTipo("Diesel");
        motor2.setPotencia(120);
        motor2.setCilindraje("1800cc");

        Transmision transmision2 = new Transmision();
        transmision2.setTipo("Manual");
        transmision2.setMarchas(5);
        transmision2.setTraccion("Trasera");
        transmision2.setMarca("Honda");
        transmision2.setModelo("Civic");

        Chasis chasis2 = new Chasis();
        chasis2.setTipo("Estructura tubular");
        chasis2.setMaterial("Aluminio");
        chasis2.setMarca("Honda");
        chasis2.setModelo("Civic");
        chasis2.setColor("Negro");
        chasis2.setDimensiones("4.67m x 1.80m x 1.42m");
        chasis2.setPeso("1250kg");

        Neumatico neumatico2 = new Neumatico();
        neumatico2.setTipo("Radial");
        neumatico2.setMarca("Bridgestone");
        neumatico2.setModelo("Dueler H/L 400");
        neumatico2.setDimensiones("225/65 R17");
        neumatico2.setPresion("34 PSI");
        neumatico2.setPeso("12kg");

        SistemaElectrico sistemaElectrico2 = new SistemaElectrico();
        sistemaElectrico2.setTipo("Gasolina");
        sistemaElectrico2.setMarca("Honda");
        sistemaElectrico2.setModelo("Civic");
        sistemaElectrico2.setBateria("Ácido-plomo");
        sistemaElectrico2.setLuces("Halógenas");
        sistemaElectrico2.setSensores("ABS, control de tracción");

        SistemaFrenos frenos2 = new SistemaFrenos();
        frenos2.setTipo("Tambor");
        frenos2.setMarca("Honda");
        frenos2.setModelo("Civic");
        frenos2.setDiscos("Traseros");
        frenos2.setAbs("No");
        frenos2.setEstado("Operativo");

        RegistroVehicular registro2 = new RegistroVehicular();
        registro2.setPlaca("XYZ789");
        registro2.setMarca("Honda");
        registro2.setModelo("Civic");
        registro2.setAño(2019);
        registro2.setTipo("Hatchback");
        registro2.setTransmision("Manual");
        registro2.setMotor("Gasolina");
        registro2.setNeumatico("Radial");
        registro2.setMatricula("654321");
        registro2.setPropietario("María López");
        registro2.setFechaRegistro("2019-05-15");

        Mantenimiento mantenimiento2 = new Mantenimiento();
        mantenimiento2.setTipo("Cambio de frenos");
        mantenimiento2.setMarca("Honda");
        mantenimiento2.setModelo("Civic");
        mantenimiento2.setFecha("2023-02-15");
        mantenimiento2.setKilometraje("60000 km");
        mantenimiento2.setCosto("200 USD");
        mantenimiento2.setTaller("Taller de Frenos");
        mantenimiento2.setObservaciones("Cambio de pastillas y discos de freno");
        mantenimiento2.setPiezas_cambiadas("Pastillas de freno, discos de freno");

        Sensor sensor2 = new Sensor();
        sensor2.setTipo("Presión");
        sensor2.setMarca("Honeywell");
        sensor2.setModelo("HSC");
        sensor2.setVelocidad("500 Hz");
        sensor2.setTemperatura("30 °C");
        sensor2.setPresion("1000 hPa");

        System.out.println("🚗 Vehiculo 2:");
        System.out.println("Placa: " + vehiculo2.getPlaca());
        System.out.println("Marca: " + vehiculo2.getMarca());
        System.out.println("Modelo: " + vehiculo2.getModelo());
        System.out.println("Año: " + vehiculo2.getAño());
        System.out.println("Motor: " + motor2.getTipo() + ", " + motor2.getPotencia() + "hp, " + motor2.getCilindraje());
        System.out.println("Transmision: " + transmision2.getTipo() + ", " + transmision2.getMarchas() + " marchas, " + transmision2.getTraccion());
        System.out.println("Chasis: " + chasis2.getTipo() + ", " + chasis2.getMaterial() + ", " + chasis2.getColor() + ", " + chasis2.getDimensiones() + ", " + chasis2.getPeso());
        System.out.println("Neumatico: " + neumatico2.getMarca() + " " + neumatico2.getModelo() + ", " + neumatico2.getDimensiones() + ", " + neumatico2.getPresion());
        System.out.println("Sistema Electrico: " + sistemaElectrico2.getTipo() + ", Batería: " + sistemaElectrico2.getBateria() + ", Luces: " + sistemaElectrico2.getLuces() + ", Sensores: " + sistemaElectrico2.getSensores());
        System.out.println("Frenos: " + frenos2.getTipo() + ", Discos: " + frenos2.getDiscos() + ", ABS: " + frenos2.getAbs());
        System.out.println("Registro: " + registro2.getMatricula() + ", Propietario: " + registro2.getPropietario() + ", Fecha: " + registro2.getFechaRegistro());
        System.out.println("Mantenimiento: " + mantenimiento2.getTipo() + ", Fecha: " + mantenimiento2.getFecha() + ", Taller: " + mantenimiento2.getTaller() + ", Observaciones: " + mantenimiento2.getObservaciones());
        System.out.println("Sensor: " + sensor2.getTipo() + ", Marca: " + sensor2.getMarca() + ", Modelo: " + sensor2.getModelo() + ", Temp: " + sensor2.getTemperatura() + ", Presion: " + sensor2.getPresion());
        System.out.println("----------------------");

        // VEHICULO 3
        Vehiculo vehiculo3 = new Vehiculo();
        vehiculo3.setPlaca("LMN456");
        vehiculo3.setMarca("Ford");
        vehiculo3.setModelo("Focus");
        vehiculo3.setAño(2021);

        Motor motor3 = new Motor();
        motor3.setTipo("Híbrido");
        motor3.setPotencia(200);
        motor3.setCilindraje("2500cc");

        Transmision transmision3 = new Transmision();
        transmision3.setTipo("CVT");
        transmision3.setMarchas(7);
        transmision3.setTraccion("Delantera");
        transmision3.setMarca("Nissan");
        transmision3.setModelo("Altima");

        Chasis chasis3 = new Chasis();
        chasis3.setTipo("Monocasco");
        chasis3.setMaterial("Acero");
        chasis3.setMarca("Nissan");
        chasis3.setModelo("Altima");
        chasis3.setColor("Gris");
        chasis3.setDimensiones("4.90m x 1.85m x 1.45m");
        chasis3.setPeso("1400kg");

        Neumatico neumatico3 = new Neumatico();
        neumatico3.setTipo("Radial");
        neumatico3.setMarca("Goodyear");
        neumatico3.setModelo("Eagle F1 Asymmetric 3");
        neumatico3.setDimensiones("245/40 R18");
        neumatico3.setPresion("36 PSI");
        neumatico3.setPeso("11kg");

        SistemaElectrico sistemaElectrico3 = new SistemaElectrico();
        sistemaElectrico3.setTipo("Eléctrico");
        sistemaElectrico3.setMarca("Nissan");
        sistemaElectrico3.setModelo("Leaf");
        sistemaElectrico3.setBateria("Lithium-ion");
        sistemaElectrico3.setLuces("LED");
        sistemaElectrico3.setSensores("Control de estabilidad, asistencia de arranque en pendiente");

        SistemaFrenos frenos3 = new SistemaFrenos();
        frenos3.setTipo("Disco");
        frenos3.setMarca("Nissan");
        frenos3.setModelo("Altima");
        frenos3.setDiscos("Delanteros y traseros");
        frenos3.setAbs("Sí");
        frenos3.setEstado("Operativo");

        RegistroVehicular registro3 = new RegistroVehicular();
        registro3.setPlaca("LMN456");
        registro3.setMarca("Ford");
        registro3.setModelo("Focus");
        registro3.setAño(2021);
        registro3.setTipo("Sedán");
        registro3.setTransmision("Automática");
        registro3.setMotor("Gasolina");
        registro3.setNeumatico("Radial");
        registro3.setMatricula("789012");
        registro3.setPropietario("Carlos García");
        registro3.setFechaRegistro("2021-03-10");

        Mantenimiento mantenimiento3 = new Mantenimiento();
        mantenimiento3.setTipo("Cambio de batería");
        mantenimiento3.setMarca("Nissan");
        mantenimiento3.setModelo("Altima");
        mantenimiento3.setFecha("2023-03-10");
        mantenimiento3.setKilometraje("70000 km");
        mantenimiento3.setCosto("150 USD");
        mantenimiento3.setTaller("Taller de Baterías");
        mantenimiento3.setObservaciones("Cambio de batería");
        mantenimiento3.setPiezas_cambiadas("Batería");

        Sensor sensor3 = new Sensor();
        sensor3.setTipo("Humedad");
        sensor3.setMarca("Sensirion");
        sensor3.setModelo("SHT31");
        sensor3.setVelocidad("200 Hz");
        sensor3.setTemperatura("20 °C");
        sensor3.setPresion("950 hPa");

        System.out.println("🚗 Vehiculo 3:");
        System.out.println("Placa: " + vehiculo3.getPlaca());
        System.out.println("Marca: " + vehiculo3.getMarca());
        System.out.println("Modelo: " + vehiculo3.getModelo());
        System.out.println("Año: " + vehiculo3.getAño());
        System.out.println("Motor: " + motor3.getTipo() + ", " + motor3.getPotencia() + "hp, " + motor3.getCilindraje());
        System.out.println("Transmision: " + transmision3.getTipo() + ", " + transmision3.getMarchas() + " marchas, " + transmision3.getTraccion());
        System.out.println("Chasis: " + chasis3.getTipo() + ", " + chasis3.getMaterial() + ", " + chasis3.getColor() + ", " + chasis3.getDimensiones() + ", " + chasis3.getPeso());
        System.out.println("Neumatico: " + neumatico3.getMarca() + " " + neumatico3.getModelo() + ", " + neumatico3.getDimensiones() + ", " + neumatico3.getPresion());
        System.out.println("Sistema Electrico: " + sistemaElectrico3.getTipo() + ", Batería: " + sistemaElectrico3.getBateria() + ", Luces: " + sistemaElectrico3.getLuces() + ", Sensores: " + sistemaElectrico3.getSensores());
        System.out.println("Frenos: " + frenos3.getTipo() + ", Discos: " + frenos3.getDiscos() + ", ABS: " + frenos3.getAbs());
        System.out.println("Registro: " + registro3.getMatricula() + ", Propietario: " + registro3.getPropietario() + ", Fecha: " + registro3.getFechaRegistro());
        System.out.println("Mantenimiento: " + mantenimiento3.getTipo() + ", Fecha: " + mantenimiento3.getFecha() + ", Taller: " + mantenimiento3.getTaller() + ", Observaciones: " + mantenimiento3.getObservaciones());
        System.out.println("Sensor: " + sensor3.getTipo() + ", Marca: " + sensor3.getMarca() + ", Modelo: " + sensor3.getModelo() + ", Temp: " + sensor3.getTemperatura() + ", Presion: " + sensor3.getPresion());
        System.out.println("----------------------");

        // VEHICULO 4
        Vehiculo vehiculo4 = new Vehiculo();
        vehiculo4.setPlaca("DEF456");
        vehiculo4.setMarca("Chevrolet");
        vehiculo4.setModelo("Sonic");
        vehiculo4.setAño(2022);

        Motor motor4 = new Motor();
        motor4.setTipo("Electrico");
        motor4.setPotencia(100);
        motor4.setCilindraje("1500cc");

        Transmision transmision4 = new Transmision();
        transmision4.setTipo("Manual");
        transmision4.setMarchas(6);
        transmision4.setTraccion("Trasera");
        transmision4.setMarca("Ford");
        transmision4.setModelo("Mustang");

        Chasis chasis4 = new Chasis();
        chasis4.setTipo("Estructura tubular");
        chasis4.setMaterial("Aluminio");
        chasis4.setMarca("Ford");
        chasis4.setModelo("Mustang");
        chasis4.setColor("Rojo");
        chasis4.setDimensiones("4.78m x 1.91m x 1.38m");
        chasis4.setPeso("1500kg");

        Neumatico neumatico4 = new Neumatico();
        neumatico4.setTipo("Radial");
        neumatico4.setMarca("Pirelli");
        neumatico4.setModelo("Cinturato P7");
        neumatico4.setDimensiones("195/65 R15");
        neumatico4.setPresion("30 PSI");
        neumatico4.setPeso("9kg");

        SistemaElectrico sistemaElectrico4 = new SistemaElectrico();
        sistemaElectrico4.setTipo("Gasolina");
        sistemaElectrico4.setMarca("Ford");
        sistemaElectrico4.setModelo("Mustang");
        sistemaElectrico4.setBateria("Ácido-plomo");
        sistemaElectrico4.setLuces("Xenón");
        sistemaElectrico4.setSensores("Control de tracción, asistencia de frenado");

        SistemaFrenos frenos4 = new SistemaFrenos();
        frenos4.setTipo("Disco");
        frenos4.setMarca("Ford");
        frenos4.setModelo("Mustang");
        frenos4.setDiscos("Delanteros y traseros");
        frenos4.setAbs("Sí");
        frenos4.setEstado("Operativo");

        RegistroVehicular registro4 = new RegistroVehicular();
        registro4.setPlaca("DEF456");
        registro4.setMarca("Chevrolet");
        registro4.setModelo("Sonic");
        registro4.setAño(2022);
        registro4.setTipo("Hatchback");
        registro4.setTransmision("Manual");
        registro4.setMotor("Gasolina");
        registro4.setNeumatico("Radial");
        registro4.setMatricula("345678");
        registro4.setPropietario("Ana Torres");
        registro4.setFechaRegistro("2022-07-20");

        Mantenimiento mantenimiento4 = new Mantenimiento();
        mantenimiento4.setTipo("Cambio de neumáticos");
        mantenimiento4.setMarca("Ford");
        mantenimiento4.setModelo("Mustang");
        mantenimiento4.setFecha("2023-04-20");
        mantenimiento4.setKilometraje("80000 km");
        mantenimiento4.setCosto("400 USD");
        mantenimiento4.setTaller("Taller de Neumáticos");
        mantenimiento4.setObservaciones("Cambio de neumáticos");
        mantenimiento4.setPiezas_cambiadas("Neumáticos");

        Sensor sensor4 = new Sensor();
        sensor4.setTipo("Acelerómetro");
        sensor4.setMarca("STMicroelectronics");
        sensor4.setModelo("LIS3DH");
        sensor4.setVelocidad("100 Hz");
        sensor4.setTemperatura("15 °C");
        sensor4.setPresion("980 hPa");

        System.out.println("🚗 Vehiculo 4:");
        System.out.println("Placa: " + vehiculo4.getPlaca());
        System.out.println("Marca: " + vehiculo4.getMarca());
        System.out.println("Modelo: " + vehiculo4.getModelo());
        System.out.println("Año: " + vehiculo4.getAño());
        System.out.println("Motor: " + motor4.getTipo() + ", " + motor4.getPotencia() + "hp, " + motor4.getCilindraje());
        System.out.println("Transmision: " + transmision4.getTipo() + ", " + transmision4.getMarchas() + " marchas, " + transmision4.getTraccion());
        System.out.println("Chasis: " + chasis4.getTipo() + ", " + chasis4.getMaterial() + ", " + chasis4.getColor() + ", " + chasis4.getDimensiones() + ", " + chasis4.getPeso());
        System.out.println("Neumatico: " + neumatico4.getMarca() + " " + neumatico4.getModelo() + ", " + neumatico4.getDimensiones() + ", " + neumatico4.getPresion());
        System.out.println("Sistema Electrico: " + sistemaElectrico4.getTipo() + ", Batería: " + sistemaElectrico4.getBateria() + ", Luces: " + sistemaElectrico4.getLuces() + ", Sensores: " + sistemaElectrico4.getSensores());
        System.out.println("Frenos: " + frenos4.getTipo() + ", Discos: " + frenos4.getDiscos() + ", ABS: " + frenos4.getAbs());
        System.out.println("Registro: " + registro4.getMatricula() + ", Propietario: " + registro4.getPropietario() + ", Fecha: " + registro4.getFechaRegistro());
        System.out.println("Mantenimiento: " + mantenimiento4.getTipo() + ", Fecha: " + mantenimiento4.getFecha() + ", Taller: " + mantenimiento4.getTaller() + ", Observaciones: " + mantenimiento4.getObservaciones());
        System.out.println("Sensor: " + sensor4.getTipo() + ", Marca: " + sensor4.getMarca() + ", Modelo: " + sensor4.getModelo() + ", Temp: " + sensor4.getTemperatura() + ", Presion: " + sensor4.getPresion());
        System.out.println("----------------------");
    }
}
    
