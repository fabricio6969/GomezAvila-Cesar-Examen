package ec.edu.ups.entidad;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: tarjetaCredito
 *
 */
@Entity
public class tarjetaCredito implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private int  numeroTarjeta;
	private String nombreTitular;
	private Date fechaCad;
	private int cvv;
	@OneToMany(mappedBy = "pedido")
	private List<Pedido> pedido;
	
	public tarjetaCredito() {
	}

	public int getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(int numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getNombreTitular() {
		return nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	public Date getFechaCad() {
		return fechaCad;
	}

	public void setFechaCad(Date fechaCad) {
		this.fechaCad = fechaCad;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public List<Pedido> getPedido() {
		return pedido;
	}

	public void setPedido(List<Pedido> pedido) {
		this.pedido = pedido;
	}

	@Override
	public String toString() {
		return "tarjetaCredito [numeroTarjeta=" + numeroTarjeta + ", nombreTitular=" + nombreTitular + ", fechaCad="
				+ fechaCad + ", cvv=" + cvv + ", pedido=" + pedido + "]";
	}
   
}
