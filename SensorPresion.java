public class SensorPresion extends Sensor {

    private double valorActual;

    public SensorPresion(String modelo, String fabricante,
                         double consumoEnergia) {
        super(modelo, fabricante, consumoEnergia, "hPa");
        this.valorActual = 0.0;
    }

    @Override
    public double leerValor() {
        valorActual = 900.0 + Math.random() * 200.0;

        System.out.printf("Leyendo presión: %.2f %s%n",
                          valorActual, unidadMedida);

        return valorActual;
    }
}