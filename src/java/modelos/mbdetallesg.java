/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import entity.Detallecompra;
import entity.Detalleventa;
import hibernateutil.HibernateUtil;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author An
 */
@ManagedBean
@SessionScoped
public class mbdetallesg implements Serializable{
    Session session;

    public int getIddetallecompra() {
        return iddetallecompra;
    }

    public void setIddetallecompra(int iddetallecompra) {
        this.iddetallecompra = iddetallecompra;
    }
    private int iddetallecompra ;
    private int idetalleventa;

    public int getIdetalleventa() {
        return idetalleventa;
    }

    public void setIdetalleventa(int idetalleventa) {
        this.idetalleventa = idetalleventa;
    }

    /**
     * Creates a new instance of mbdetallesg
     */
    public mbdetallesg() {
    }
     public void verDetalles(ActionEvent miActionEvent, int iddetacompra) throws IOException {
        if (iddetacompra != 0) {
            this.iddetallecompra = iddetacompra;
            FacesContext.getCurrentInstance().getExternalContext().redirect("../administrador/detallecompra.xhtml");
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error", "No se pudo procesar la peticion"));
        }
    }
      public  List<Detallecompra> detallecompr(int valor ){
       session=null;
        Query query=null;
        try {
            valor=this.iddetallecompra;
            session=HibernateUtil.getSessionFactory().openSession();
            String hql="select dc.cantidad, p.precioCosto,p.nombre from Detallecompra as dc inner join dc.producto as p inner join dc.compra as c where c.idcompra=:iddetalle";
            query=session.createQuery(hql);
              query.setParameter("iddetalle", valor);
            return query.list();
        } catch (Exception e) {
        }finally{
        session.close();
        }
    return null;
    }
       public void verDetallesventa(ActionEvent miActionEvent, int iddetaventa) throws IOException {
        if (iddetaventa != 0) {
            this.idetalleventa = iddetaventa;
            FacesContext.getCurrentInstance().getExternalContext().redirect("../administrador/detalleventa.xhtml");
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error", "No se pudo procesar la peticion"));
        }
    }
       
        public  List<Detalleventa> detalleventa(int valores ){
       session=null;
        Query query=null;
        try {
            valores=this.idetalleventa;
            session=HibernateUtil.getSessionFactory().openSession();
            String hql="select p.codigo, p.nombre, p.precioVenta, dv.cantidad, dv.monto, dv.descuento, dv.subtotal from Detalleventa as dv inner join dv.venta as v inner join dv.producto as p where v.idventa=:iddetalleventa";
            query=session.createQuery(hql);
              query.setParameter("iddetalleventa", valores);
            return query.list();
        } catch (Exception e) {
        }finally{
        session.close();
        }
    return null;
    }
}