package entity;
// Generated 19-sep-2015 2:07:46 by Hibernate Tools 4.3.1


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
 * Cliente generated by hbm2java
 */
@Entity
@Table(name="cliente"
    ,catalog="bdgasolinera"
)
public class Cliente  implements java.io.Serializable {


     private Integer idcliente;
     private Ctgmunicipio ctgmunicipio;
     private Ctgtipocliente ctgtipocliente;
     private String codigo;
     private String primerNombre;
     private String segundoNombre;
     private String primerApellido;
     private String segundoApellido;
     private Date fechaRegistro;
     private String tipoDocumento;
     private String numeroDocumento;
     private String telefonoFijo;
     private String telefonoMovil;
     private String mail;
     private String direccion;
     private String estado;
     private Set ventas = new HashSet(0);
     private Set cventas = new HashSet(0);

    public Cliente() {
    }

	
    public Cliente(Ctgmunicipio ctgmunicipio, Ctgtipocliente ctgtipocliente, String codigo, String segundoNombre, String segundoApellido, Date fechaRegistro, String tipoDocumento, String numeroDocumento, String estado) {
        this.ctgmunicipio = ctgmunicipio;
        this.ctgtipocliente = ctgtipocliente;
        this.codigo = codigo;
        this.segundoNombre = segundoNombre;
        this.segundoApellido = segundoApellido;
        this.fechaRegistro = fechaRegistro;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.estado = estado;
    }
    public Cliente(Ctgmunicipio ctgmunicipio, Ctgtipocliente ctgtipocliente, String codigo, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, Date fechaRegistro, String tipoDocumento, String numeroDocumento, String telefonoFijo, String telefonoMovil, String mail, String direccion, String estado, Set ventas, Set cventas) {
       this.ctgmunicipio = ctgmunicipio;
       this.ctgtipocliente = ctgtipocliente;
       this.codigo = codigo;
       this.primerNombre = primerNombre;
       this.segundoNombre = segundoNombre;
       this.primerApellido = primerApellido;
       this.segundoApellido = segundoApellido;
       this.fechaRegistro = fechaRegistro;
       this.tipoDocumento = tipoDocumento;
       this.numeroDocumento = numeroDocumento;
       this.telefonoFijo = telefonoFijo;
       this.telefonoMovil = telefonoMovil;
       this.mail = mail;
       this.direccion = direccion;
       this.estado = estado;
       this.ventas = ventas;
       this.cventas = cventas;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idcliente", unique=true, nullable=false)
    public Integer getIdcliente() {
        return this.idcliente;
    }
    
    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fkctgMunicipio", nullable=false)
    public Ctgmunicipio getCtgmunicipio() {
        return this.ctgmunicipio;
    }
    
    public void setCtgmunicipio(Ctgmunicipio ctgmunicipio) {
        this.ctgmunicipio = ctgmunicipio;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fkctgTipoCliente", nullable=false)
    public Ctgtipocliente getCtgtipocliente() {
        return this.ctgtipocliente;
    }
    
    public void setCtgtipocliente(Ctgtipocliente ctgtipocliente) {
        this.ctgtipocliente = ctgtipocliente;
    }

    
    @Column(name="codigo", nullable=false, length=50)
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
    @Column(name="primer_nombre", length=45)
    public String getPrimerNombre() {
        return this.primerNombre;
    }
    
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    
    @Column(name="segundo_nombre", nullable=false, length=45)
    public String getSegundoNombre() {
        return this.segundoNombre;
    }
    
    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    
    @Column(name="primer_apellido", length=45)
    public String getPrimerApellido() {
        return this.primerApellido;
    }
    
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    
    @Column(name="segundo_apellido", nullable=false, length=45)
    public String getSegundoApellido() {
        return this.segundoApellido;
    }
    
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="fecha_registro", nullable=false, length=10)
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    
    @Column(name="tipo_documento", nullable=false, length=35)
    public String getTipoDocumento() {
        return this.tipoDocumento;
    }
    
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    
    @Column(name="numero_documento", nullable=false, length=25)
    public String getNumeroDocumento() {
        return this.numeroDocumento;
    }
    
    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    
    @Column(name="telefono_fijo", length=11)
    public String getTelefonoFijo() {
        return this.telefonoFijo;
    }
    
    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    
    @Column(name="telefono_movil", length=11)
    public String getTelefonoMovil() {
        return this.telefonoMovil;
    }
    
    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    
    @Column(name="mail", length=25)
    public String getMail() {
        return this.mail;
    }
    
    public void setMail(String mail) {
        this.mail = mail;
    }

    
    @Column(name="direccion", length=150)
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    @Column(name="estado", nullable=false, length=1)
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="cliente")
    public Set getVentas() {
        return this.ventas;
    }
    
    public void setVentas(Set ventas) {
        this.ventas = ventas;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="cliente")
    public Set getCventas() {
        return this.cventas;
    }
    
    public void setCventas(Set cventas) {
        this.cventas = cventas;
    }




}

