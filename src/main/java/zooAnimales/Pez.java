package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Pez extends Animal{
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public static int salmones = 0;
	public static int bacalaos = 0;
	private String colorEscamas;
	private static int cantidadAletas;
	
	public Pez(String nombre,int edad,String habitat,String genero,String colorEscamas,int cantidadAletas) {
		super(nombre,edad,habitat,genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}
	
	public ArrayList<Pez> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Pez> listado) {
		this.listado = listado;
	}

	public int getSalmones() {
		return salmones;
	}

	public void setSalmones(int salmones) {
		this.salmones = salmones;
	}

	public int getBacalaos() {
		return bacalaos;
	}

	public void setBacalaos(int bacalaos) {
		this.bacalaos = bacalaos;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}

	public Pez() {
		salmones++;
	}
	
	public static int cantidadPeces() {
		return salmones+bacalaos;
	}
	
	public String movimiento() {
		return "nadar";
	}
	
	public static Pez crearSalmon(String nombre,int edad,String genero) {
		Pez salmon = new Pez(nombre,edad,"oceano",genero,"rojo",6);
		salmones++;
		return salmon;
	}
	
	public static Pez crearBacalao(String nombre,int edad,String genero) {
		Pez bacalao = new Pez(nombre,edad,"oceano",genero,"gris",6);
		bacalaos++;
		return bacalao;
	}

}
