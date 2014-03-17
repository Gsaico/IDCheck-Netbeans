

package IdCheck.SERVICIOS;

import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion_mySQL  extends Conexion{
    
    private String opciones;

    public Conexion_mySQL() throws SQLException, 
                                   ClassNotFoundException, 
                                   InstantiationException, 
                                   IllegalAccessException {
        
        opciones = System.clearProperty("options");
        iniciardb();
        
    }
    public void iniciardb() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException
    {
    s_conexion=jdbc + host + "/" + database + "?";
    Class.forName(driver).newInstance();
    conexion=DriverManager.getConnection(s_conexion,username,password);
    dbmt=conexion.getMetaData();
    us_st=conexion.createStatement();
    
    }
    
    
    
}
