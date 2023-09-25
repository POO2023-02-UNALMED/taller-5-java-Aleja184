package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal{
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones=0;
	public static int aguilas=0;
	private String colorPlumas;
	
	public Ave(String nombre,int edad,String habitat,String genero,String colorPlumas) {
		super(nombre,edad,habitat,genero);
		this.colorPlumas = colorPlumas;
		Ave.listado.add(this);
	}
	
	public ArrayList<Ave> getListado() {
		return listado;
	}


	public int getHalcones() {
		return halcones;
	}

	public void setHalcones(int halcones) {
		this.halcones = halcones;
	}

	public int getAguilas() {
		return aguilas;
	}

	public void setAguilas(int aguilas) {
		this.aguilas = aguilas;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}

	public Ave() {
		this(null,0,null,null,null);
	}
	public static int cantidadAves() {
		return Ave.listado.size();
	}
	
	public String movimiento() {
		return "volar";
	}
	
	public static Ave crearHalcon(String nombre,int edad,String genero) {
		Ave halcon = new Ave(nombre,edad,"montanas",genero,"cafe glorioso");
		halcones++;
		return halcon;
	}
	
	public static Ave crearAguila(String nombre,int edad,String genero) {
		Ave aguila = new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");
		aguilas++;
		return aguila;
	}
}
