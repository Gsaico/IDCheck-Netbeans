/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IdCheck.DB;

import IdCheck.NEGOCIOS.TipoPersonal;
import IdCheck.SERVICIOS.ConectarServicio;
import IdCheck.SERVICIOS.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Pervac
 */
public class TipoPersonalBD {
    
     private TipoPersonal clsTipoPersonal;

    public TipoPersonalBD(TipoPersonal clsTipoPersonal) {
        this.clsTipoPersonal = clsTipoPersonal;
    }
    

   

    public ResultSet ListarTipoPersonal() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        Conexion cdb = ConectarServicio.getInstancia().getConexionDB();
        cdb.un_sql = "SELECT idTipoPersonal, NombreTipoPersonal FROM tipopersonal";
        cdb.resultado = cdb.us_st.executeQuery(cdb.un_sql);
        
        return cdb.resultado;

    }

    
    
    
    
}
