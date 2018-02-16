package com.ecodeup.articulos.model;

import java.util.Date;

public class Articulo {
	private int id;
	private String origen;
	private String destino;
	private String paquete;
	private Date fecha;
	private String remitente;
	private String transportista;
	private double precio;

	public Articulo(int id, String origen, String destino, String paquete, Date fecha, String remitente,
			String transportista, double precio) {
		this.id = id;
		this.origen = origen;
		this.destino = destino;
		this.paquete = paquete;
		this.fecha = fecha;
		this.remitente = remitente;
		this.transportista = transportista;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getPaquete() {
		return paquete;
	}

	public void setPaquete(String paquete) {
		this.paquete = paquete;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getRemitente() {
		return remitente;
	}

	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}

	public String getTransportista() {
		return transportista;
	}

	public void setTransportista(String transportista) {
		this.transportista = transportista;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	// public Articulo(int id, String codigo, String nombre, String descripcion,
	// double existencia, double precio) {
	// this.id = id;
	// this.codigo = codigo;
	// this.nombre = nombre;
	// this.descripcion = descripcion;
	// this.existencia = existencia;
	// this.precio = precio;
	// }
	// getters y setters
	// public int getId() {
	// return id;
	// }
	// public void setId(int id) {
	// this.id = id;
	// }
	// public String getCodigo() {
	// return codigo;
	// }
	// public void setCodigo(String codigo) {
	// this.codigo = codigo;
	// }
	// public String getNombre() {
	// return nombre;
	// }
	// public void setNombre(String nombre) {
	// this.nombre = nombre;
	// }
	// public String getDescripcion() {
	// return descripcion;
	// }
	// public void setDescripcion(String descripcion) {
	// this.descripcion = descripcion;
	// }
	// public double getExistencia() {
	// return existencia;
	// }
	// public void setExistencia(double existencia) {
	// this.existencia = existencia;
	// }
	// public double getPrecio() {
	// return precio;
	// }
	// public void setPrecio(double precio) {
	// this.precio = precio;
	// }
}