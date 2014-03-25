

package IdCheck.DB;

import IdCheck.NEGOCIOS.Acceso;
import IdCheck.SERVICIOS.ConectarServicio;
import IdCheck.SERVICIOS.Conexion;
import java.sql.SQLException;

public class AccesoBD {
    
     private Acceso clsA;

    public AccesoBD(Acceso clsA) {
        this.clsA = clsA;
    }

    public void GrabarXidpersonal() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        Conexion cdb = ConectarServicio.getInstancia().getConexionDB();
        cdb.un_sql = "SELECT * FROM acceso WHERE idPersonal='" + clsA.getIdpersonal() + "'";
        cdb.resultado = cdb.us_st.executeQuery(cdb.un_sql);

        if (cdb.resultado != null) {
            if (cdb.resultado.next()) {

              
                cdb.ps = cdb.conexion.prepareStatement("UPDATE acceso SET "

                        + "Fecha= ?, "
                        + "FechaDesde= ?, "
                        + "FechaHasta= ?, "
                        + "Nota= ?, "
                        + "Essalud= ?, "
                        + "sctrSalud= ?, "
                        + "sctrPensiones= ?, "
                        + "pdtplame= ?, "
                        + "afp= ?, "
                        + "onp= ?, "
                        + "idArea= ?, "
                        + "idEmpresaColaboradora= ?, "
                        + "idTipoPersonal= ?");

               
                
             
                cdb.ps.setString(1, clsA.getFecha());
                cdb.ps.setString(2, clsA.getFechadesde());
                cdb.ps.setString(3, clsA.getFechahasta());
                cdb.ps.setString(4, clsA.getNota());
                
                cdb.ps.setBoolean(5, clsA.isEssalud());
                cdb.ps.setBoolean(6, clsA.isSctrsalud());
                cdb.ps.setBoolean(7, clsA.isSctrpensiones());
                cdb.ps.setBoolean(8, clsA.isPdtplame());
                cdb.ps.setBoolean(9, clsA.isAfp());
                cdb.ps.setBoolean(10, clsA.isOnp());

                cdb.ps.setString(11, clsA.getIdarea());

                cdb.ps.setString(12, clsA.getIdtipopersonal());
                cdb.ps.setString(13, clsA.getIdempresacolaboradora());

                cdb.ps.executeUpdate();

                

            } else {
                cdb.ps = cdb.conexion.prepareStatement("INSERT INTO acceso VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

             
                
                cdb.ps.setString(1, clsA.getIdpersonal());
                cdb.ps.setString(2, clsA.getFecha());
                cdb.ps.setString(3, clsA.getFechadesde());
                cdb.ps.setString(4, clsA.getFechahasta());
                cdb.ps.setString(5, clsA.getNota());
                
                cdb.ps.setBoolean(6, clsA.isEssalud());
                cdb.ps.setBoolean(7, clsA.isSctrsalud());
                cdb.ps.setBoolean(8, clsA.isSctrpensiones());
                cdb.ps.setBoolean(9, clsA.isPdtplame());
                cdb.ps.setBoolean(10, clsA.isAfp());
                cdb.ps.setBoolean(11, clsA.isOnp());

                cdb.ps.setString(12, clsA.getIdarea());
               
                cdb.ps.setString(13, clsA.getIdtipopersonal());
                cdb.ps.setString(14, clsA.getIdempresacolaboradora());
                cdb.ps.executeUpdate();

            }

        } else {
                 cdb.ps = cdb.conexion.prepareStatement("INSERT INTO acceso VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

             
                
                cdb.ps.setString(1, clsA.getIdpersonal());
                cdb.ps.setString(2, clsA.getFecha());
                cdb.ps.setString(3, clsA.getFechadesde());
                cdb.ps.setString(4, clsA.getFechahasta());
                cdb.ps.setString(5, clsA.getNota());
                
                cdb.ps.setBoolean(6, clsA.isEssalud());
                cdb.ps.setBoolean(7, clsA.isSctrsalud());
                cdb.ps.setBoolean(8, clsA.isSctrpensiones());
                cdb.ps.setBoolean(9, clsA.isPdtplame());
                cdb.ps.setBoolean(10, clsA.isAfp());
                cdb.ps.setBoolean(11, clsA.isOnp());

                cdb.ps.setString(12, clsA.getIdarea());
               
                cdb.ps.setString(13, clsA.getIdtipopersonal());
                cdb.ps.setString(14, clsA.getIdempresacolaboradora());
                cdb.ps.executeUpdate();
        }

    }

    public Acceso LeerxIDACCESO() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        Conexion cdb = ConectarServicio.getInstancia().getConexionDB();
        cdb.un_sql = "SELECT * FROM acceso WHERE idPersonal='" + clsA.getIdpersonal() + "'";
        cdb.resultado = cdb.us_st.executeQuery(cdb.un_sql);

        if (cdb.resultado != null) {
            if (cdb.resultado.next()) {
                

                clsA.setIdpersonal(cdb.resultado.getString("idPersonal"));
                clsA.setFecha(cdb.resultado.getString("Fecha"));
                clsA.setFechadesde(cdb.resultado.getString("FechaDesde"));
                clsA.setFechahasta(cdb.resultado.getString("FechaHasta"));
                clsA.setNota(cdb.resultado.getString("Nota"));

                clsA.setEssalud(cdb.resultado.getBoolean("Essalud"));
                clsA.setSctrsalud(cdb.resultado.getBoolean("sctrSalud"));
                clsA.setSctrpensiones(cdb.resultado.getBoolean("sctrPensiones"));
                clsA.setPdtplame(cdb.resultado.getBoolean("pdtplame"));
                clsA.setAfp(cdb.resultado.getBoolean("afp"));
                clsA.setOnp(cdb.resultado.getBoolean("onp"));
                           
                clsA.setIdarea(cdb.resultado.getString("idArea"));                           
                clsA.setIdempresacolaboradora(cdb.resultado.getString("idEmpresaColaboradora"));   
                clsA.setIdtipopersonal(cdb.resultado.getString("idTipoPersonal"));   
                                
                
            }
        }

        return clsA;

    }
    
}
