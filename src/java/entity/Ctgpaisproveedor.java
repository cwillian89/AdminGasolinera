package entity;
// Generated 19-sep-2015 2:07:46 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Ctgpaisproveedor generated by hbm2java
 */
@Entity
@Table(name="ctgpaisproveedor"
    ,catalog="bdgasolinera"
)
public class Ctgpaisproveedor  implements java.io.Serializable {


     private Integer idctgPaisProveedor;
     private String codigo;
     private String nombre;
     private Set proveedors = new HashSet(0);

    public Ctgpaisproveedor() {
    }

	
    public Ctgpaisproveedor(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    public Ctgpaisproveedor(String codigo, String nombre, Set proveedors) {
       this.codigo = codigo;
       this.nombre = nombre;
       this.proveedors = proveedors;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idctgPaisProveedor", unique=true, nullable=false)
    public Integer getIdctgPaisProveedor() {
        return this.idctgPaisProveedor;
    }
    
    public void setIdctgPaisProveedor(Integer idctgPaisProveedor) {
        this.idctgPaisProveedor = idctgPaisProveedor;
    }

    
    @Column(name="codigo", nullable=false, length=50)
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
    @Column(name="nombre", nullable=false, length=50)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="ctgpaisproveedor")
    public Set getProveedors() {
        return this.proveedors;
    }
    
    public void setProveedors(Set proveedors) {
        this.proveedors = proveedors;
    }




}


