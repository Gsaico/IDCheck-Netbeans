

package IdCheck.DB;


import IdCheck.NEGOCIOS.Area;
import IdCheck.SERVICIOS.ConectarServicio;
import IdCheck.SERVICIOS.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;


public class AreaBD {
     private Area clsAcceso;

    

    public AreaBD(Area clsAcceso) {
        this.clsAcceso = clsAcceso;
    }

   

   

    public ResultSet ListarArea() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        Conexion cdb = ConectarServicio.getInstancia().getConexionDB();
        cdb.un_sql = "SELECT idArea, NombreArea FROM area";
        cdb.resultado = cdb.us_st.executeQuery(cdb.un_sql);
        
        return cdb.resultado;

    }
}
