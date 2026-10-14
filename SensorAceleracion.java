public class SensorAceleracion extends Sensor {

    private double valorEjeX;
    private double valorEjeY;
    private double valorEjeZ;

    public SensorAceleracion(String modelo, String fabricante,
                             double consumoEnergia) {
        super(modelo, fabricante, consumoEnergia, "m/s^2");

        this.valorEjeX = 0.0;
        this.valorEjeY = 0.0;
        this.valorEjeZ = 0.0;
    }

    @Override
    public double leerValor() {
        valorEjeX = -10.0 + Math.random() * 20.0;
        valorEjeY = -10.0 + Math.random() * 20.0;
        valorEjeZ = -10.0 + Math.random() * 20.0;

        double magnitud = Math.sqrt(
                Math.pow(valorEjeX, 2)
                + Math.pow(valorEjeY, 2)
                + Math.pow(valorEjeZ, 2)
        );

        System.out.printf(
                "Leyendo aceleración: X = %.2f, Y = %.2f, Z = %.2f %s%n",
                valorEjeX, valorEjeY, valorEjeZ, unidadMedida
        );

        System.out.printf("Magnitud de aceleración: %.2f %s%n",
                          magnitud, unidadMedida);

        return magnitud;
    }
}