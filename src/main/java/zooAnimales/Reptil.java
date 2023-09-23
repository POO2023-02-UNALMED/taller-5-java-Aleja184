package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Reptil extends Animal{
	private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
	public static int iguanas= 0;
	public static int serpientes=0;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(String nombre,int edad,String habitat,String genero,String colorEscamas,int largoCola) {
		super(nombre,edad,habitat,genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}
	
	public Reptil() {
		iguanas++;
	}
	public ArrayList<Reptil> getListado() {
		return listado;
	}
	public void setListado(ArrayList<Reptil> listado) {
		this.listado = listado;
	}
	public int getIguanas() {
		return iguanas;
	}
	public void setIguanas(int iguanas) {
		this.iguanas = iguanas;
	}
	public int getSerpientes() {
		return serpientes;
	}
	public void setSerpientes(int serpientes) {
		this.serpientes = serpientes;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getLargoCola() {
		return largoCola;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	public static int cantidadReptiles() {
		return serpientes+iguanas;
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	public static Reptil crearIguana(String nombre,int edad,String genero) {
		Reptil iguana = new Reptil(nombre,edad,"humedal",genero,"verde",3);
		iguanas++;
		return iguana;
	}
	
	public static Reptil crearSerpiente(String nombre,int edad,String genero) {
		Reptil serpiente = new Reptil(nombre,edad,"jungla",genero,"blanco",1);
		serpientes++;
		return serpiente;
	}
}