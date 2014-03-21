

package IdCheck.NEGOCIOS;

import IdCheck.DB.PersonalBD;
import java.io.FileInputStream;
import java.io.IOException;

import java.sql.SQLException;



public class Personal {
    
   private String idpersonal; 
   private String nombres;
   private String apellidos;
   private String fechanac;
   private String cargo;
  private FileInputStream foto;

   
   private String idempresacolaboradora;
   private String idtipopersonal;
   
   
   

    public String getIdpersonal() {
        return idpersonal;
    }

    public void setIdpersonal(String idpersonal) {
        this.idpersonal = idpersonal;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechanac() {
        return fechanac;
    }

    public void setFechanac(String fechanac) {
        this.fechanac = fechanac;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public FileInputStream getFoto() {
        return foto;
    }

    public void setFoto(FileInputStream foto) {
        this.foto = foto;
    }

    public String getIdempresacolaboradora() {
        return idempresacolaboradora;
    }

    public void setIdempresacolaboradora(String idempresacolaboradora) {
        this.idempresacolaboradora = idempresacolaboradora;
    }

    public String getIdtipopersonal() {
        return idtipopersonal;
    }

    public void setIdtipopersonal(String idtipopersonal) {
        this.idtipopersonal = idtipopersonal;
    }

   

   
   
   public void grabar() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
   {
   PersonalBD pdb= new PersonalBD(this);
   pdb.Grabar();
   }
    public void borrar() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
   {
   PersonalBD pdb= new PersonalBD(this);
   pdb.Borrar();
   }
     public Personal leer() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
   {
   PersonalBD pdb= new PersonalBD(this);
   pdb.Leer();
       return  pdb.Leer();
   }
     
     public CustomImageIcon leerFoto(String idDNI) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException, IOException
   {
       PersonalBD pdb= new PersonalBD(this);
       pdb.DevolverFoto(idDNI);
       return  pdb.DevolverFoto(idDNI);
   }
}
