package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Mamifero extends Animal{
	 private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	 public static int caballos=0;
	 public static int leones=0;
	 private boolean pelaje;
	 private int patas;
	 
	 public Mamifero(String nombre,int edad,String habitat,String genero,boolean pelaje,int patas) {
		super(nombre,edad,habitat,genero);
		this.pelaje = pelaje;
		this.patas = patas;
		Mamifero.listado.add(this);
	}
	 
	 public ArrayList<Mamifero> getListado() {
		return Mamifero.listado;
	}


	public int getCaballos() {
		return caballos;
	}

	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}

	public int getLeones() {
		return leones;
	}

	public void setLeones(int leones) {
		this.leones = leones;
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public Mamifero() {
		this(null,0,null,null,false,0);
		Mamifero.listado.add(this);
	}
	 
	 public static int cantidadMamiferos() {
		 return Mamifero.listado.size();
	 }
	 
	 public static Mamifero crearCaballo(String nombre,int edad,String genero) {
		 Mamifero caballo = new Mamifero(nombre,edad,"pradera",genero,true,4);
		 caballos++;
		 return caballo;
	 }
	 
	 public static Mamifero crearLeon(String nombre,int edad,String genero) {
		 Mamifero leon = new Mamifero(nombre,edad,"selva",genero,true,4);
		 leones++;
		 return leon;
	 }
	
}
