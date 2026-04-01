package example_factory_method;

import example_factory_method.classes.Conductor;
import example_factory_method.classes.Vehiculo;

public class Main {
    public static void main(String[] args) {
        // Motor
        FactoryVehiculo motorFactory = new MotorFactory();
        Conductor conductorMotor = new Conductor(motorFactory);
        Vehiculo motor = conductorMotor.getVehiculo();
        motor.mostrarInfo();

        //Camion
        FactoryVehiculo camionFactory = new CamionFactory();
        Conductor conductorCamion = new Conductor(camionFactory);
        Vehiculo camion = conductorCamion.getVehiculo();
        camion.mostrarInfo();

        //Carro
        FactoryVehiculo carroFactory = new CarroFactory();
        Conductor conductorCarro = new Conductor(carroFactory);
        Vehiculo carro = conductorCarro.getVehiculo();
        carro.mostrarInfo();
    }
}
