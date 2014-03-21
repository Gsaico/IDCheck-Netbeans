/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IdCheck.NEGOCIOS;

import IdCheck.DB.TipoPersonalBD;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Pervac
 */
public class TipoPersonal {
    
    private int TipoPersonal;
    private String NombreTipoPersonal;

    public int getTipoPersonal() {
        return TipoPersonal;
    }

    public void setTipoPersonal(int TipoPersonal) {
        this.TipoPersonal = TipoPersonal;
    }

    public String getNombreTipoPersonal() {
        return NombreTipoPersonal;
    }

    public void setNombreTipoPersonal(String NombreTipoPersonal) {
        this.NombreTipoPersonal = NombreTipoPersonal;
    }
     public ResultSet ListarTipoPersonal() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
   {
       TipoPersonalBD adb = new TipoPersonalBD(this);
       adb.ListarTipoPersonal();

       return adb.ListarTipoPersonal();
      
   } 
    
    
    
}
