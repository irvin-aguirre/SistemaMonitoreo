public class SensorTemperatura extends Sensor {

    private double valorActual;

    public SensorTemperatura(String modelo, String fabricante,
                             double consumoEnergia) {
        super(modelo, fabricante, consumoEnergia, "°C");
        this.valorActual = 0.0;
    }

    @Override
    public double leerValor() {
        valorActual = 20.0 + Math.random() * 15.0;

        System.out.printf("Leyendo temperatura: %.2f %s%n",
                          valorActual, unidadMedida);

        return valorActual;
    }
}