package com.cice.negocio;

import java.util.ArrayList;
import java.util.Scanner;

import com.cice.modelo.Asignatura;

/**
 * 
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 *
 */

public class Universidad {
	
	private ArrayList <Asignatura> listaAsignaturas= new ArrayList <>();	
	
	public void showMenu() {
		Scanner sc = new Scanner (System.in);
		int opcion = 0;
		
		do {
			System.out.println("------------------------------------");
			System.out.println("Bienvenido a tu gestor de Universidad");
			System.out.println("Esto es lo que puedo hacer por ti:");
			System.out.println("1. Crear Asignatura");
			System.out.println("2. Eliminar Asignatura");
			System.out.println("3. Mostrar Asignaturas");			
			System.out.println("0. Salir");
			System.out.println("------------------------------------");
			opcion = sc.nextInt();
			
			controles (opcion);			
		}while (opcion!=0);
		sc.close();
	}
	
	private void controles (int opcion) {
		switch (opcion){
			case 0:
				break;
			case 1:
				//Crear Persona
				crearAsignatura();
				break;
			case 2:
				//Eliminar Datos Persona
				eliminarAsignatura();
				break;
			case 3:
				//Mostrar Persona
				mostrarAsignatura();
				break;			
			default:
				System.out.println("la opcion seleccionada no es valida");
				
				
		}
	}
	
	private void crearAsignatura () {
		Asignatura asignatura;
		Scanner sc = new Scanner (System.in);
		String nombre;
		String codigo;
		String curso;
		
		System.out.println("Introduce un nombre");
		nombre=sc.nextLine();			
		System.out.println("Introduce un Codigo");
		codigo=sc.next();
		
		while(comprobarAsignatura(codigo)) {
			System.out.println("Los datos de esta Asignatura ya existen");
			System.out.println("Introduce un Codigo");
			codigo=sc.next();		
		}
		System.out.println("Introduce un curso");
		curso=sc.next();	
		
		asignatura = new Asignatura (codigo, nombre, curso);
		listaAsignaturas.add(asignatura);
		
			
	}
	
	private boolean comprobarAsignatura(String codigo) {
		
		boolean bandera = false;
		
		if(listaAsignaturas.size()>0)
		for (Asignatura asignatura : listaAsignaturas) {			
			if(asignatura.getCodigo().equals(codigo))
				bandera = true;
			
		}
		return bandera;
		
	}
	
	private void eliminarAsignatura() {
		int opcion = 0;
		int seleccion = 0;
		Scanner sc = new Scanner (System.in);
		
		if(listaAsignaturas.size()>0) {
			for (Asignatura asignatura : listaAsignaturas) {
				System.out.println("------------------------------------------------");
				System.out.println("Seleccione una Asignatura a eliminar");
				System.out.println(opcion+1 + ") " + asignatura.toString());
				opcion++;
			}
		System.out.println("------------------------------------------------");
		seleccion = sc.nextInt();
		seleccion--;
		if(seleccion < listaAsignaturas.size()) {
			listaAsignaturas.remove(seleccion);
		}
		else {
			System.out.println("Opcion erronea");
		}
		
		}
		else {
			System.out.println("El Gestor está vacio todavia debe crear una Asignatura antes");
		}
		
	}
	
	private void mostrarAsignatura() {
		int opcion = 0;
		

		if(listaAsignaturas.size()>0) {
		for (Asignatura asignatura : listaAsignaturas) {
			System.out.println("------------------------------------------------");
			System.out.println(opcion+1 + ") " + asignatura.toString());
			opcion++;
		}
		System.out.println("------------------------------------------------");
		}
		else {
			System.out.println("El Gestor está vacio todavia debe crear una Asignatura antes");
		}
	}
}

