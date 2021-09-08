package informacionAlumnos;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumnos {
	
	public static ArrayList<String> obtenerNombres(int cantidadAlumnos,Scanner sc){
		String nombre;
		ArrayList<String> nombreAlumnos = new ArrayList<>();
		sc.nextLine();
		for (int i=0; i<cantidadAlumnos; i++) {
			System.out.println("Introduce el nombre del alumno");
			nombre = sc.nextLine();
			nombreAlumnos.add(nombre);
			//System.out.println(nombre);
			//nombreAlumnos.add(nombre);
		}
		return nombreAlumnos;
	}
	
	public static int leerIntDesdeTeclado() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		return num;
	}
	public static String leerStringDesdeTeclado() {
		Scanner sc = new Scanner(System.in);
		String texto = sc.nextLine();
		sc.close();
		return texto;
	}
	public static ArrayList<Integer> obtenerEdades(int cantidadAlumnos, ArrayList<String> nombreAlumnos, Scanner sc){
		ArrayList<Integer> edadesAlumnos = new ArrayList<>();
		for (String nombre:nombreAlumnos) {
			System.out.println("Introduce la edad del alumno "+nombre);
			int edad = sc.nextInt();
			edadesAlumnos.add(edad);
			
		}
		return edadesAlumnos;
	}
	
	public static float obtenerMediaEdades(ArrayList<Integer> edadesAlumnos) {
		float media = 0;
		int sumaEdades = 0;
		int totalAlumnos = 0;
		for(Integer edad:edadesAlumnos) {
			System.out.println("La edad es "+edad);
			sumaEdades += edad;
			totalAlumnos +=1;
		}
		media = sumaEdades/totalAlumnos;
		System.out.println("la media es "+media);
		return media;
	}
	
	public static void obtenerInformacionAlumno(int cantidadAlumnos, Scanner sc) {
		ArrayList<String> nombreAlumnos = null;
		ArrayList<Integer> edadAlumnos = null;
		nombreAlumnos = obtenerNombres(cantidadAlumnos,sc);
		edadAlumnos = obtenerEdades(cantidadAlumnos, nombreAlumnos,sc);
		float mediaEdades = obtenerMediaEdades(edadAlumnos);
		System.out.println("INFORMACIÓN DE CLASE:");
		for(int i=0;i<cantidadAlumnos;i++) {
			System.out.println("El alumno "+nombreAlumnos.get(i)+" tiene "+edadAlumnos.get(i)+" años");
		}
		System.out.println("La media de alumnos es: "+mediaEdades);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantas personas hay  en clase?");
		boolean esEntero = sc.hasNextInt();
		while(!esEntero) {
			sc.nextLine();
			System.out.println("Ha escrito mal la cantidad. Intentelo de nuevo");
			esEntero = sc.hasNextInt();
		}
		int numeroAlumnos = sc.nextInt();
		System.out.println(numeroAlumnos);
		obtenerInformacionAlumno(numeroAlumnos,sc);
		sc.close();
	}

}
