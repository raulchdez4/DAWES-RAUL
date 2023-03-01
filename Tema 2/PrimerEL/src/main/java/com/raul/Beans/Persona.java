package com.raul.Beans;

import java.io.Serializable;

public class Persona implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer edad;
	private String nombre;
	
	public Persona() {
		super();
	}
	
	public Persona(Integer edad, String nombre) {
		super();
		this.edad = edad;
		this.nombre = nombre;
	}
	
	public Integer getEdad() {
		return edad;
	}
	
	public String getNombre() {
		return nombre;
	}
}
