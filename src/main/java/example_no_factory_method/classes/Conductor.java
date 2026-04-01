package example_no_factory_method.classes;

public class Conductor {

    private Vehiculo vehiculo;

    public Conductor (int tipo){
        switch (tipo) {
            case 1:
                this.vehiculo = new Carro();
                break;
            case 2:
                this.vehiculo = new Motor();
                break;
            case 3:
                this.vehiculo = new Camion();
                break;
            default:
                throw new IllegalArgumentException("Tipo de vehículo no válido");
        }
    }

    public void cleanup() {
        if(vehiculo != null) vehiculo = null;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}
