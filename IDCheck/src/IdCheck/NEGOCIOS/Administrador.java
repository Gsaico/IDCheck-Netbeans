/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IdCheck.NEGOCIOS;

import IdCheck.DB.AdministradorBD;
import java.sql.SQLException;

/**
 *
 * @author Pervac
 */
public class Administrador {
    
     private String idpersonal; 
   private String Pasword;

    public String getIdpersonal() {
        return idpersonal;
    }

    public void setIdpersonal(String idpersonal) {
        this.idpersonal = idpersonal;
    }

    public String getPasword() {
        return Pasword;
    }

    public void setPasword(String Pasword) {
        this.Pasword = Pasword;
    }
   
    public Boolean ValidarUsuario() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
   {
       AdministradorBD adb = new AdministradorBD(this);
       adb.ValidarUsuario();

       return adb.ValidarUsuario();
      
   } 
}
