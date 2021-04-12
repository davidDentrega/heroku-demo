package org.brenda.delarosa.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="Vacantes")
public class Vacante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//ATRIBUTOS INICIALES
	private Integer id;
	private String nombre; //NOMBRE DE LA OFERTA DE TRABAJO
	private String descripcion; //DESCRIPCION DE LA OFERTA DE TRABAJO
	private LocalDate fecha = LocalDate.now(); //FECHA DE PUBLICACION DE LA OFERTA DE TRABAJO
	private Double salario; //SALARIO APROXIMADO QUE SE OFRECE
	//variable adicional
	private Integer destacado; //1 = DESTACADO 0 = 
	private String imagen="logoem.jpg";
	private String estatus;
	private String detalles;
	
	
	@OneToOne
	@JoinColumn(name="idCategoria")
	//@Transient //para descartar este atributo, pues no tiene relacion en la tabla
	private Categoria categoria;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public Integer getDestacado() {
		return destacado;
	}
	public void setDestacado(Integer destacado) {
		this.destacado = destacado;
	}
	
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public String getDetalles() {
		return detalles;
	}
	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	@Override
	public String toString() {
		return "Vacante [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fecha=" + fecha
				+ ", salario=" + salario + ", destacado=" + destacado + ", imagen=" + imagen + ", estatus=" + estatus
				+ ", detalles=" + detalles + ", categoria=" + categoria + "]";
	}
	
	
	
	
	
	
	
}
