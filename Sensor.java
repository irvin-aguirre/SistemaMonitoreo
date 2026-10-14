public abstract class Sensor extends DispositivoElectronico {

    protected String unidadMedida;
    protected boolean estaCalibrado;

    public Sensor(String modelo, String fabricante,
                  double consumoEnergia, String unidadMedida) {

        super(modelo, fabricante, consumoEnergia);
        this.unidadMedida = unidadMedida;
        this.estaCalibrado = false;
    }

    public void calibrar() {
        estaCalibrado = true;
        System.out.println(modelo + " ha sido calibrado.");
    }

    public abstract double leerValor();
}