package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal{
	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public static int ranas = 0;
	public static int salamandras = 0;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre,int edad,String habitat,String genero,String colorPiel,boolean venenoso) {
		super(nombre,edad,habitat,genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}
	
	public ArrayList<Anfibio> getListado() {
		return Anfibio.listado;
	}

	public int getRanas() {
		return ranas;
	}

	public void setRanas(int ranas) {
		this.ranas = ranas;
	}

	public int getSalamandras() {
		return salamandras;
	}

	public void setSalamandras(int salamandras) {
		this.salamandras = salamandras;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}

	public Anfibio() {
		this(null,0,null,null,null,false);
	}
	
	public static int cantidadAnfibios() {
		return Anfibio.listado.size();
	}
	
	public String movimiento() {
		return "saltar";
	}
	
	public static Anfibio crearRana(String nombre,int edad,String genero) {
		Anfibio rana = new Anfibio(nombre,edad,"selva",genero,"rojo",true);
		ranas++;
		return rana;
	}
	
	public static Anfibio crearSalamandra(String nombre,int edad,String genero) {
		Anfibio salamandra = new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
		salamandras++;
		return salamandra;
	}
}
