package entity;
// Generated 19-sep-2015 2:07:46 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Venta generated by hbm2java
 */
@Entity
@Table(name="venta"
    ,catalog="bdgasolinera"
)
public class Venta  implements java.io.Serializable {


     private Integer idventa;
     private Cliente cliente;
     private Ctgformapago ctgformapago;
     private Ctgtipofactura ctgtipofactura;
     private Detallecaja detallecaja;
     private Empleado empleado;
     private BigDecimal moto;
     private Date fecha;
     private Set detalleventas = new HashSet(0);

    public Venta() {
    }

	
    public Venta(Cliente cliente, Ctgformapago ctgformapago, Ctgtipofactura ctgtipofactura, Detallecaja detallecaja, Empleado empleado, BigDecimal moto, Date fecha) {
        this.cliente = cliente;
        this.ctgformapago = ctgformapago;
        this.ctgtipofactura = ctgtipofactura;
        this.detallecaja = detallecaja;
        this.empleado = empleado;
        this.moto = moto;
        this.fecha = fecha;
    }
    public Venta(Cliente cliente, Ctgformapago ctgformapago, Ctgtipofactura ctgtipofactura, Detallecaja detallecaja, Empleado empleado, BigDecimal moto, Date fecha, Set detalleventas) {
       this.cliente = cliente;
       this.ctgformapago = ctgformapago;
       this.ctgtipofactura = ctgtipofactura;
       this.detallecaja = detallecaja;
       this.empleado = empleado;
       this.moto = moto;
       this.fecha = fecha;
       this.detalleventas = detalleventas;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idventa", unique=true, nullable=false)
    public Integer getIdventa() {
        return this.idventa;
    }
    
    public void setIdventa(Integer idventa) {
        this.idventa = idventa;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fkcliente", nullable=false)
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fkctgFormaPago", nullable=false)
    public Ctgformapago getCtgformapago() {
        return this.ctgformapago;
    }
    
    public void setCtgformapago(Ctgformapago ctgformapago) {
        this.ctgformapago = ctgformapago;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fkctgTipoFactura", nullable=false)
    public Ctgtipofactura getCtgtipofactura() {
        return this.ctgtipofactura;
    }
    
    public void setCtgtipofactura(Ctgtipofactura ctgtipofactura) {
        this.ctgtipofactura = ctgtipofactura;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fkdetalleCaja", nullable=false)
    public Detallecaja getDetallecaja() {
        return this.detallecaja;
    }
    
    public void setDetallecaja(Detallecaja detallecaja) {
        this.detallecaja = detallecaja;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fkempleado", nullable=false)
    public Empleado getEmpleado() {
        return this.empleado;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    
    @Column(name="moto", nullable=false, precision=12)
    public BigDecimal getMoto() {
        return this.moto;
    }
    
    public void setMoto(BigDecimal moto) {
        this.moto = moto;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="fecha", nullable=false, length=10)
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="venta")
    public Set getDetalleventas() {
        return this.detalleventas;
    }
    
    public void setDetalleventas(Set detalleventas) {
        this.detalleventas = detalleventas;
    }




}


