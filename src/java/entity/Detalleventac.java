package entity;
// Generated 19-sep-2015 2:07:46 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Detalleventac generated by hbm2java
 */
@Entity
@Table(name="detalleventac"
    ,catalog="bdgasolinera"
)
public class Detalleventac  implements java.io.Serializable {


     private Integer iddetalleventac;
     private Cventa cventa;
     private Detallebombatc detallebombatc;
     private BigDecimal cantidad;
     private BigDecimal precio;
     private BigDecimal descuento;

    public Detalleventac() {
    }

    public Detalleventac(Cventa cventa, Detallebombatc detallebombatc, BigDecimal cantidad, BigDecimal precio, BigDecimal descuento) {
       this.cventa = cventa;
       this.detallebombatc = detallebombatc;
       this.cantidad = cantidad;
       this.precio = precio;
       this.descuento = descuento;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="iddetalleventac", unique=true, nullable=false)
    public Integer getIddetalleventac() {
        return this.iddetalleventac;
    }
    
    public void setIddetalleventac(Integer iddetalleventac) {
        this.iddetalleventac = iddetalleventac;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fkcventa", nullable=false)
    public Cventa getCventa() {
        return this.cventa;
    }
    
    public void setCventa(Cventa cventa) {
        this.cventa = cventa;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fkdetallebombatc", nullable=false)
    public Detallebombatc getDetallebombatc() {
        return this.detallebombatc;
    }
    
    public void setDetallebombatc(Detallebombatc detallebombatc) {
        this.detallebombatc = detallebombatc;
    }

    
    @Column(name="cantidad", nullable=false, precision=12)
    public BigDecimal getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    
    @Column(name="precio", nullable=false, precision=12)
    public BigDecimal getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    
    @Column(name="descuento", nullable=false, precision=12)
    public BigDecimal getDescuento() {
        return this.descuento;
    }
    
    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }




}

