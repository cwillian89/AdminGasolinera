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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Ctgmunicipio generated by hbm2java
 */
@Entity
@Table(name="ctgmunicipio"
    ,catalog="bdgasolinera"
)
public class Ctgmunicipio  implements java.io.Serializable {


     private Integer idctgMunicipio;
     private Ctgdepartamento ctgdepartamento;
     private String nombre;
     private Set clientes = new HashSet(0);

    public Ctgmunicipio() {
    }

	
    public Ctgmunicipio(Ctgdepartamento ctgdepartamento, String nombre) {
        this.ctgdepartamento = ctgdepartamento;
        this.nombre = nombre;
    }
    public Ctgmunicipio(Ctgdepartamento ctgdepartamento, String nombre, Set clientes) {
       this.ctgdepartamento = ctgdepartamento;
       this.nombre = nombre;
       this.clientes = clientes;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idctgMunicipio", unique=true, nullable=false)
    public Integer getIdctgMunicipio() {
        return this.idctgMunicipio;
    }
    
    public void setIdctgMunicipio(Integer idctgMunicipio) {
        this.idctgMunicipio = idctgMunicipio;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fkctgDepartamento", nullable=false)
    public Ctgdepartamento getCtgdepartamento() {
        return this.ctgdepartamento;
    }
    
    public void setCtgdepartamento(Ctgdepartamento ctgdepartamento) {
        this.ctgdepartamento = ctgdepartamento;
    }

    
    @Column(name="nombre", nullable=false, length=50)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="ctgmunicipio")
    public Set getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Set clientes) {
        this.clientes = clientes;
    }




}


