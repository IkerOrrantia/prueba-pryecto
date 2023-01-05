package clases;

import java.io.Serializable;

public class Pelicula implements Pagable, Serializable {
	protected int id;
	protected String nombre;
	protected int id_genero;
	protected double precio;
	protected String director;
	protected int anyo;
	protected int cantidad;
	protected String descripcion;

	/**
	 * Constructor con argumentos
	 * 
	 * @param id        identificativo único
	 * @param nombre    del producto
	 * @param categoria del mueble
	 * @param precio    del mueble
	 */
	public Pelicula(int id, String nombre, String director, int id_genero, int anyo, double precio, int cantidad, String descripcion) {
		this.id = id;
		this.nombre = nombre;
		this.director = director;
		this.id_genero = id_genero;
		this.anyo = anyo;
		this.setPrecio(precio);
		this.cantidad = cantidad;
		this.descripcion = descripcion;
	}

	/**
	 * Constructor por defecto, crea una pelicula con id -1, "Sin nombre" de Genero
	 * precio 0
	 */
	public Pelicula() {
		super();
		this.setPrecio(0);
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getGenero() {
		return id_genero;
	}

	public void setGenero(int id_genero) {
		this.id_genero = id_genero;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio >= 0) {
			this.precio = precio;
		}
	}
	
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return nombre ;
	}

}