package unac.edu.co;

import java.util.Scanner;

public class PrincipalFinalPuntoTen {
    public static void main(String[] args ){
        //nombres
        Scanner a = new Scanner(System.in);
        Vehiculos c = new Vehiculos("Carro ");
        Vehiculos c1 = new Vehiculos("Moto ");
        Vehiculos c2 = new Vehiculos("Bicicleta ");
        //Vehiculos que poseemos
        System.out.println("¿Cuanta distancia quiere que recorra el "+ c.getNameVehiculo() +  "? En metros" );
        int g = a.nextInt();
        System.out.println("¿Cuanta distancia quiere que recorra el "+ c1.getNameVehiculo() +  "? En metros" );
        int q = a.nextInt();
        System.out.println("¿Cuanta distancia quiere que recorra el "+ c2.getNameVehiculo() +  "? En metros" );
        int e = a.nextInt();
        System.out.println(c.getNameVehiculo() + " recorrera " + g + " m") ;
        System.out.println(c1.getNameVehiculo() + " recorrera " + q + " m") ;
        System.out.println(c2.getNameVehiculo() + " recorrera " + e + " m") ;

        c.start();
        c1.start();
        c2.start();



    }

}
