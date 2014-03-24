/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IdCheck.NEGOCIOS;

import IdCheck.DB.AreaBD;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Pervac
 */
public class Area {
    private int idarea;
    private String nombrearea;

    public int getIdarea() {
        return idarea;
    }

    public void setIdarea(int idarea) {
        this.idarea = idarea;
    }

    public String getNombrearea() {
        return nombrearea;
    }

    public void setNombrearea(String nombrearea) {
        this.nombrearea = nombrearea;
    }
    
     public ResultSet ListarArea() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
   {
       AreaBD adb = new AreaBD(this);
       adb.ListarArea();

       return adb.ListarArea();
      
   } 
    
    
}
