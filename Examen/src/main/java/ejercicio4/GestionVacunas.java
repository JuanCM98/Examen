package ejercicio4;

import java.util.Scanner;
/**
 * 
 * @author Juan Cañadas Marqués
 * @version 0.0.1
 * @date 2021/06/03
 *
 */

public class GestionVacunas {

	static Scanner teclado = new Scanner(System.in); 
		
public static void main(String[] args) {
	
	String nombre,dni,numVacuna="",vacuna1="",vacuna2="",mesVacuna1="",mesVacuna2="";

	
	System.out.println("Introduzca el nombre del paciente:");
	nombre = teclado.next();
	System.out.println("Introduzca el dni del paciente:");
	dni = teclado.next();
	System.out.println("¿Vacuna 1 o 2?");
	numVacuna = teclado.next();
	
	if(numVacuna.equals("1")) {
		System.out.println("Introduzca la vacuna 1: ");
		vacuna1 = teclado.next();
		System.out.println("Introduzca el mes de vacunación de vacuna 1:");
		mesVacuna1 = teclado.next();
		
	}else if(numVacuna.equals("2")) {
		
		System.out.println("Introduzca la vacuna 2: ");
		vacuna2 = teclado.next();
		System.out.println("Introduzca el mes de vacunación de vacuna 2:");
		mesVacuna2 = teclado.next();
		
	}else {
		System.out.println("Error");
	} 
					
	mostrar(nombre, dni, vacuna1, vacuna2, mesVacuna1, mesVacuna2);
	
	espera(nombre, vacuna1, vacuna2);	
	
	}
/**
 * Método para mostrar los datos de las vacunas realizadas a los pacientes.
 * @param nombre
 * @param dni
 * @param vacuna1
 * @param vacuna2
 * @param mesVacuna1
 * @param mesVacuna2
 */
private static void mostrar(String nombre, String dni, String vacuna1, String vacuna2, String mesVacuna1,
		String mesVacuna2) {
	System.out.println("VACUNACIÓN PACIENTE "+ nombre +"-"+ dni + "_________________");
	System.out.println("Vacuna 1 "+ vacuna1 +" Fecha:"+mesVacuna1);
	System.out.println("Vacuna 2 "+ vacuna2 +" Fecha:"+mesVacuna2);
}
/**
 * Método que inica al paciente el tiempo de espera para la siguiente dosis de vacuna.
 * @param nombre
 * @param vacuna1
 * @param vacuna2
 */
private static void espera(String nombre, String vacuna1, String vacuna2) {
	if(vacuna2.equals("")) {
		if(vacuna1.equals("Moderna")) {
			System.out.println("El paciente "+ nombre + " debe esperar 5 meses para la vacuna 2 ");
		}else if(vacuna1.equals("Pfizer")) {
			System.out.println("El paciente "+ nombre + "debe esperar 4 meses para la vacuna 2 ");
		}else if(vacuna1.equals("Janssen")) {
			System.out.println("El paciente está ya vacuando");
		}else {
			System.out.println("El paciente "+ nombre + " está ya vacunado ");
		}
	}
}
}
