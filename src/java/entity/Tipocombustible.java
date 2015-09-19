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
 * Tipocombustible generated by hbm2java
 */
@Entity
@Table(name="tipocombustible"
    ,catalog="bdgasolinera"
)
public class Tipocombustible  implements java.io.Serializable {


     private Integer idtipocombustible;
     private String nombre;
     private Set detallebombatcs = new HashSet(0);

    public Tipocombustible() {
    }

	
    public Tipocombustible(String nombre) {
        this.nombre = nombre;
    }
    public Tipocombustible(String nombre, Set detallebombatcs) {
       this.nombre = nombre;
       this.detallebombatcs = detallebombatcs;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idtipocombustible", unique=true, nullable=false)
    public Integer getIdtipocombustible() {
        return this.idtipocombustible;
    }
    
    public void setIdtipocombustible(Integer idtipocombustible) {
        this.idtipocombustible = idtipocombustible;
    }

    
    @Column(name="nombre", nullable=false, length=50)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tipocombustible")
    public Set getDetallebombatcs() {
        return this.detallebombatcs;
    }
    
    public void setDetallebombatcs(Set detallebombatcs) {
        this.detallebombatcs = detallebombatcs;
    }




}


