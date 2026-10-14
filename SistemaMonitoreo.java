import java.util.ArrayList;

public class SistemaMonitoreo {

    public static void main(String[] args) {

        ArrayList<Sensor> listaSensores = new ArrayList<>();

        // Crear sensores de temperatura
        listaSensores.add(
                new SensorTemperatura("DHT11", "Aosong", 0.05));
        listaSensores.add(
                new SensorTemperatura("DS18B20", "Maxim", 0.03));

        // Crear sensores de presión
        listaSensores.add(
                new SensorPresion("BMP280", "Bosch", 0.01));
        listaSensores.add(
                new SensorPresion("BMP180", "Bosch", 0.02));

        // Crear sensores de aceleración
        listaSensores.add(
                new SensorAceleracion("ADXL345", "Analog Devices", 0.02));
        listaSensores.add(
                new SensorAceleracion("MPU6050", "InvenSense", 0.05));

        // Recorrer la lista y ejecutar los métodos
        for (Sensor sensor : listaSensores) {

            System.out.println("\n");
            System.out.println(sensor.obtenerEstado());

            sensor.encender();
            sensor.calibrar();

            double lectura = sensor.leerValor();

            System.out.printf("Resultado final: %.2f %s%n",
                    lectura, sensor.unidadMedida);

            System.out.println("Estado de calibración: "
                    + sensor.estaCalibrado);

            System.out.println(sensor.obtenerEstado());
        }
    }
}