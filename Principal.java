package Parcial;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		Integer po = null;

		// Methods
		Propietario p = new Propietario("Alberto Aquiles", 1006047166,  39, 5668020);
		Propietario p1 = new Propietario("Juan Nitales", 1204047666,  49, 5662030);
		Propietario p2 = new Propietario("Elver Oleo", 1306037166, 29, 5663240);
		List<Propietario> propietarios = new ArrayList<>();
		propietarios.add(p);
		propietarios.add(p1);
		propietarios.add(p2);
		
		Inquilino i = new Inquilino(null, 0, 0, 0);
		List<Inquilino> inquilinos = new ArrayList<>();
		inquilinos.add(i);

		Inmueble in = new Inmueble(60000000, "Pequeño", 2005);
		Inmueble in1 = new Inmueble(120000000, "Mediano", 2004);
		Inmueble in2 = new Inmueble(300000000, "Grande", 2010);

		List<Inmueble> inmuebles = new ArrayList<>();
		inmuebles.add(in);
		inmuebles.add(in1);
		inmuebles.add(in2);

		ContratoArriendo c = new ContratoArriendo(1000000, "Pequeño", "6 meses", "Si disponble");
		ContratoArriendo c1 = new ContratoArriendo(2000000, "Mediano", "8 meses", "Si disponble");
		ContratoArriendo c2 = new ContratoArriendo(3000000, "Grande", "9 meses", "No disponble");
		List<ContratoArriendo> contratos = new ArrayList<>();
		contratos.add(c);
		contratos.add(c1);
		contratos.add(c2);


			Scanner s = new Scanner(System.in);
			System.out.println("Agencia inmobilaria");
			System.out.println("¿Desea saber el registro de un propietario o inquilino?");
			System.out.println("1 para propietario; 2 para inquilino");

			switch (s.nextInt()) {

			case 1:
				System.out.println("Hola propietario " + p.nombre);
				System.out.println( "Registro de datos: " +" Documento de identidad " +p.id + ", edad " + p.getEdad() + ", Contacto " +p.numeroTelefonico);
				System.out.println();
				System.out.println("---Registro de compra---");
				System.out.println();
				System.out.println("Precio del inmueble " + c.getPrecio() + ", tamaño del inmueble " +c.getTamaño() +", año que compro el inmueble " + c.getTiempoContracto());
				System.out.println();
				
				System.out.println("Hola propietario " + p1.nombre);
				System.out.println( "Registro de datos: " +" Documento de identidad " +p1.id + ", edad " + p1.getEdad() + ", Contacto " +p1.numeroTelefonico);
				System.out.println();
				System.out.println("---Registro de compra---");
				System.out.println();
				System.out.println("Precio del inmueble " + c1.getPrecio() + ", tamaño del inmueble " +c1.getTamaño() +", año que compro el inmueble " + c1.getTiempoContracto());
				System.out.println();
				
				System.out.println("Hola propietario " + p2.nombre);
				System.out.println( "Registro de datos: " +" Documento de identidad " +p2.id + ", edad " + p2.getEdad() + ", Contacto " +p2.numeroTelefonico);
				System.out.println();
				System.out.println("---Registro de compra---");
				System.out.println();
				System.out.println("Precio del inmueble " + c2.getPrecio() + ", tamaño del inmueble " +c2.getTamaño() +", año que compro el inmueble " + c2.getTiempoContracto());
				System.out.println();
				break;
			
			case 2:
				System.out.println("Hola inquilino");
				System.out.println("¿Cual es su nombre?");
				i.setNombre(s.next());
				System.out.println();
				try {
				System.out.println("¿Cual es su cédula?");
				i.setId(s.nextInt());
				System.out.println();
				
				System.out.println("¿Cual es su edad? ");
				
				i.setEdad(s.nextInt());
				System.out.println();
				
				System.out.println("¿Cual es su número telefonico?");
				i.setNumeroTelefonico(s.nextInt());
				
				
			
				System.out.println();

				System.out.println("---Contrato---");
				System.out.println("Contrato 1: " + "Precio " + c.getPrecio() + ". Tamaño: " + c.getTamaño()
						+ ". Tiempo de contrato: " + c.getTiempoContracto());
				System.out.println();
				System.out.println("Contrato 1: " + "Precio " + c1.getPrecio() + ". Tamaño: " + c1.getTamaño()
						+ ". Tiempo de contrato: " + c1.getTiempoContracto());
				System.out.println();
				System.out.println("Contrato 1: " + "Precio " + c2.getPrecio() + ". Tamaño: " + c2.getTamaño()
						+ ". Tiempo de contrato: " + c2.getTiempoContracto());
				System.out.println();

				System.out.println("¿Cual desea adquirir?");
				System.out.println("contrato1 oprima 1; contrato 2 oprima 2; contrato3 oprima 3");
				
				switch (s.nextInt()) {
				
				case 1:
					System.out.println(c.getDisponibilidad());
				
				
					break;
				case 2:
					System.out.println(c1.getDisponibilidad());
					break;
				case 3:
					System.out.println(c2.getDisponibilidad());
					break;
				}
				System.out.println("¿Desea continuar? \n 1 para si \n o cualquier otro numero para finalizar.");

				po = s.nextInt();
				}catch(InputMismatchException ee){
					System.out.println("Se introducieron caracteres no numericos");
					System.out.println("Por favor vuelve a intentarlo pero con números para tus datos.");
				}
				break;
				}
		
			System.out.println("Fin del programa");
		} 
}
