package exbasic8;

import java.util.Scanner;

public class ExBasic8 {

	public static void main(String[] args) {
	
		//Creamos el escáner 
		Scanner sc= new Scanner (System.in); 
		
		//Declaramos las variables
		String nombre;
		int edad;
		
		//Pedimos los datos y guardamos
		System.out.print("Introduzca su nombre y pulse Intro: ");
		nombre=sc.nextLine();
		System.out.print("Introduzca su edad y pulse Intro: ");
		edad=sc.nextInt();
		
		//Devolvemos el resultado 
		System.out.println("Hola "+nombre+", tienes "+edad+" años, ¡qué mayor eres!");
		
		//Cerramos el escáner
		sc.close();
		
		
		
	}

}
