package org.brenda.delarosa.model;

import java.time.LocalDate;

public class Solicitud {
	private Integer id;
	private LocalDate fecha; //FECHA RN QUE APLICO PARA LA OFERTA DE TRABAJO
	private String comentarios; //INFORMACION ADICIONAL
	private String archivo; //NOMBRE DEL ARCHIVO (PDF, DOCX DEL C.V.)
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	public String getArchivo() {
		return archivo;
	}
	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}
	@Override
	public String toString() {
		return "Solicitud [id=" + id + ", fecha=" + fecha + ", comentarios=" + comentarios + ", archivo=" + archivo
				+ "]";
	}
	
	
	
	
	
	
}
