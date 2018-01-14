package com.cice.modelo;

/**
 * 
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 *
 */
public class Asignatura {
	
	private String codigo;
	private String nombre;
	private String curso;
	
	public Asignatura(String codigo, String nombre, String curso) {
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.curso = curso;
	}
	
	public Asignatura() {
		
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Asignatura [codigo=" + codigo + ", nombre=" + nombre + ", curso=" + curso + "]";
	}
	
	
	
	

}
