package ec.edu.ups.controlador;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.CategoryFacade;
import ec.edu.ups.ejb.PedidoFacade;
import ec.edu.ups.entidad.Pedido;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class PedidoBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @EJB
    private PedidoFacade ejbPedidoFacade;
    
    private List<Pedido> list;
    private String descripcion;

    public PedidoBean() {
    }    

    @PostConstruct
    public void init() {
	list = ejbPedidoFacade.findAll();
    }
        
    public Pedido[] getList() {
	return list.toArray(new Pedido[0]);
    }

    public void setList(List<Pedido> list) {
	this.list = list;
    }

    public String getDescripcion() {
	return descripcion;
    }

    public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
    }

    public String add() {
	ejbPedidoFacade.create(new Pedido(this.descripcion));
	list = ejbPedidoFacade.findAll();
	return null;
    }

    public String delete(Pedido c) {	
	ejbPedidoFacade.remove(c);
	list = ejbPedidoFacade.findAll();
	return null;
    }

    public String edit(Pedido c) {
	c.setEditable(true);
	return null;
    }

    public String save(Pedido c) {
	ejbPedidoFacade.edit(c);
	c.setEditable(false);
	return null;
    }

}