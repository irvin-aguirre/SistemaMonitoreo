public class DispositivoElectronico {

    protected String modelo;
    protected String fabricante;
    protected double consumoEnergia;
    protected boolean encendido;

    public DispositivoElectronico(String modelo, String fabricante,
                                  double consumoEnergia) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.consumoEnergia = consumoEnergia;
        this.encendido = false;
    }

    public void encender() {
        encendido = true;
        System.out.println(modelo + " se ha encendido.");
    }

    public void apagar() {
        encendido = false;
        System.out.println(modelo + " se ha apagado.");
    }

    public String obtenerEstado() {
        String estado;

        if (encendido) {
            estado = "Encendido";
        } else {
            estado = "Apagado";
        }

        return "Modelo: " + modelo
                + " | Fabricante: " + fabricante
                + " | Consumo: " + consumoEnergia + " W"
                + " | Estado: " + estado;
    }
}
