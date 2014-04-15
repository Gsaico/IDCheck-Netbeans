/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IdCheck.DB;

import IdCheck.NEGOCIOS.Administrador;
import IdCheck.SERVICIOS.ConectarServicio;
import IdCheck.SERVICIOS.Conexion;
import java.sql.SQLException;
import static sun.rmi.transport.TransportConstants.Return;

/**
 *
 * @author Pervac
 */
public class AdministradorBD {
    
     private Administrador clsADM;

    public AdministradorBD(Administrador clsADM) {
        this.clsADM = clsADM;
    }

   

    public Boolean ValidarUsuario() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        Conexion cdb = ConectarServicio.getInstancia().getConexionDB();
        cdb.un_sql = "SELECT Pasword, idPersonal FROM administrador WHERE (idPersonal='" + clsADM.getIdpersonal() + "' && Pasword='" + clsADM.getPasword() + "')";
        cdb.resultado = cdb.us_st.executeQuery(cdb.un_sql);
        Boolean existe;
existe=false;
        String idusuario, contraseña;
        
        if (cdb.resultado != null) {
            if (cdb.resultado.next()) {
                 idusuario= cdb.resultado.getString("idPersonal");
                 contraseña= cdb.resultado.getString("Pasword");
                existe = true;
            } 
            
                     

        } else {

            existe = false;

        }
        return existe;

    }

   
    
    
}
