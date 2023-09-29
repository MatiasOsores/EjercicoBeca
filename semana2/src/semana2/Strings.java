package semana2;

import java.util.Arrays;

public class Strings {

	
	public static void main(String[] args) {
		
		
		
//		String nombreUsuario = "pEpe";
//		
//		String nombreLimpio = nombreUsuario.toLowerCase();
//		
//		System.out.println(nombreLimpio);
//		
//		
//		String nombreRepo = "neoris";
//		
//		//el .contains sirve para verificar si tiene la palabra puesta
//		if(nombreRepo.contains("neoris")){
//			System.out.println("enviar email");}
		
		
		String saludo = "hola que tal";
		String[] saludoPartido1 = saludo.split("");
		
		System.out.println(Arrays.toString(saludoPartido1));
		
		String despedida = "adios no te vere \nNunca mas";
		
		System.out.println(despedida);
		
		String comillasConComillas = "es para poner \"comillas\" en las comillas";
		System.out.println(comillasConComillas);
		
		
		String nombre = "eEe la";
		String nombreLimpio = nombre.toLowerCase();
		//el trim borra los espacios que esten al rededor de lo declarado
		nombreLimpio = nombreLimpio.trim();
		//nombreLimpio = nombreLimpio.replace(" ","la");
		
		
		
		
		String cosa1 = "cosita";
		String cosa2 = "cosita";
		System.out.println(cosa1.indexOf("c"));
		
		
		//.equals hay que usar para verificar en un if las cadenas de texto
		if(cosa1.equals(cosa2)) {
			System.out.println("son iguales");
		}
		
		
		
//		String nombreUsuari = "mir";
//		
//		if(!nombreUsuari.isEmpty()) {
//			
//			String nombreUsuari = nombre.toLowerCase();
//			//el trim borra los espacios que esten al rededor de lo declarado
//			nombreLimpio = nombreLimpio.trim();
//			
//		}
//		
		
		String palabra = "banana";
		char letra = 'a';
		int contador = 0;
		
		for(int i = 0; i<palabra.length();i++) {
			if(palabra.charAt(i) == letra) {
				contador = contador +1;
			}
			
		}
		
		System.out.println("la cantidad de A son:"+contador);
		
		
		
		
	}
	
	
	
}
