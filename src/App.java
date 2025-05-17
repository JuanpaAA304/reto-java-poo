import models.Chasis;
import models.Mantenimiento;
import models.Motor;
import models.Neumatico;
import models.RegistroVehicular;
import models.Sensor;
import models.SistemaElectrico;
import models.SistemaFrenos;
import models.Transmision;
import models.Vehiculo;

public class App {
    public static void main(String[] args) throws Exception {
        Vehiculo miVehiculo = new Vehiculo("ABC123", "Toyota", "Corolla", 2020);
        miVehiculo.info();

        Motor miMotor = new Motor("Gasolina", 150, "2.0L");
        miMotor.mInfo();

        Transmision miTransmision = new Transmision("Automatica", 6, "Delantera", "Toyota", "Corolla");
        miTransmision.tInfo();

        Chasis miChasis = new Chasis("Sedan", "Acero", "Toyota", "Corolla", "Negro", "4.5m x 1.8m x 1.4m", "1300kg");
        miChasis.cInfo();

        Neumatico miNeumatico = new Neumatico("Radial", "Michelin", "Primacy 4", "205/55 R16", "2.3 bar", "9kg");
        miNeumatico.nInfo();

        SistemaElectrico miSistemaElectrico = new SistemaElectrico("12V", "Batería de plomo-ácido", "Alternador", "Toyota", "Corolla", "Sistema de audio JBL");
        miSistemaElectrico.seInfo();

        SistemaFrenos miSistemaFrenos = new SistemaFrenos("Disco", "Hidráulico", "ABS", "Toyota", "Corolla", "Frenos de disco ventilados");
        miSistemaFrenos.sfInfo();

        RegistroVehicular miRegistroVehicular = new RegistroVehicular("ABC123", "Toyota", "Corolla", 2020, "Sedan", "Automatica", "Gasolina", "Radial", "123456789", "Juan Perez", "01/01/2020");
        miRegistroVehicular.reInfo();

        Mantenimiento miMantenimiento = new Mantenimiento("Preventivo","Toyota","Corolla","2025-04-10","85000 km","$3500","Taller AutoPlus","Cambio de aceite y revisión general","Filtro de aceite, bujías");
        miMantenimiento.maInfo();

        Sensor miSensor = new Sensor("Sensor de velocidad y presión","Bosch","SPV-T300","120 km/h","90 °C","2.5 bar");
        miSensor.sInfo();
    }
}
    
    
