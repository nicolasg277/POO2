package unac.edu.co;

import java.util.Scanner;

public class Vehiculos extends Thread{
    private String nameVehiculo;

    public Vehiculos(String nameVehiculo){
        this.nameVehiculo = nameVehiculo;

    }
    public String getNameVehiculo() {
        return nameVehiculo;
    }

    @Override
    public void run() {
        Scanner s = new Scanner((System.in));
        //dintancia a recorrer

        System.out.println("Tenemos este vehiculo " + getNameVehiculo());

    }
}
