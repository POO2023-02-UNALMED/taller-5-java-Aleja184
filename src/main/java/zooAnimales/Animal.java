package zooAnimales;
import gestion.Zona;

public class Animal {
	public static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal(String nombre,int edad,String habitat,String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	public String movimiento() {
		return "desplazarse";
	}
	
	public static String totalPorTipo() {
		return "Mamiferos:"+Mamifero.cantidadMamiferos()+"\nAves:"+Ave.cantidadAves()+"\nReptiles:"+Reptil.cantidadReptiles()+"\nPeces:"+Pez.cantidadPeces()+"\nAnfibios:"+Anfibio.cantidadAnfibios();
	}
	
	@Override
	public String toString() {
		if(this.zona==null) {
			return "Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat+" y mi genero es "+this.genero;
		}
		return "Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat+" y mi genero es "+this.genero+", la zona en la que me ubico es "+this.zona.getNombre()+", en el "+this.zona.getZoo().getNombre();
	}
}
