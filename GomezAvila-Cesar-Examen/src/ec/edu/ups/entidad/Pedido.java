package ec.edu.ups.entidad;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Categoria
 *
 */
@Entity
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int numero;
    private Date fecha;
    private String nombreCliente;
    @OneToMany(mappedBy = "comida")
    private List<Comida> comida;
    @OneToMany(mappedBy = "tarjetaCredito")
    private List<tarjetaCredito> tarjetaCredito;
    private Double subtotal;
    private Double iva;
    private Double total;

    public Pedido() {

    }

    

    public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public Date getFecha() {
		return fecha;
	}



	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}



	public String getNombreCliente() {
		return nombreCliente;
	}



	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}



	public Double getSubtotal() {
		return subtotal;
	}



	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}



	public Double getIva() {
		return iva;
	}



	public void setIva(Double iva) {
		this.iva = iva;
	}



	public Double getTotal() {
		return total;
	}



	public void setTotal(Double total) {
		this.total = total;
	}

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + numero;
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Pedido other = (Pedido) obj;
	if (numero != other.numero)
	    return false;
	return true;
    }



	@Override
	public String toString() {
		return "Pedido [numero=" + numero + ", fecha=" + fecha + ", nombreCliente=" + nombreCliente + ", comida="
				+ comida + ", subtotal=" + subtotal + ", iva=" + iva + ", total=" + total + "]";
	}

}
