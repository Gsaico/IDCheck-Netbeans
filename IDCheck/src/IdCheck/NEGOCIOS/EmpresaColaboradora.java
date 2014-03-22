/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IdCheck.NEGOCIOS;

import IdCheck.DB.EmpresaColaboradoraBD;
import java.sql.SQLException;

/**
 *
 * @author Pervac
 */
public class EmpresaColaboradora {
    private String NombreEmpresa;
    private String Gerente;
    private String Telefono;
    private String Email;
    private String idEmpresaColaboradora;

    public String getNombreEmpresa() {
        return NombreEmpresa;
    }

    public void setNombreEmpresa(String NombreEmpresa) {
        this.NombreEmpresa = NombreEmpresa;
    }

    public String getGerente() {
        return Gerente;
    }

    public void setGerente(String Gerente) {
        this.Gerente = Gerente;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getIdEmpresaColaboradora() {
        return idEmpresaColaboradora;
    }

    public void setIdEmpresaColaboradora(String idEmpresaColaboradora) {
        this.idEmpresaColaboradora = idEmpresaColaboradora;
    }
    
 public EmpresaColaboradora ListarEmpresaXID() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
   {
       EmpresaColaboradoraBD pdb= new EmpresaColaboradoraBD(this);
       pdb.ListarEmpresaXID();
       return  pdb.ListarEmpresaXID();
   }    
    
    
    
    
}
