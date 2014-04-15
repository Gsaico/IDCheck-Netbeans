/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IdCheck.DB;

import IdCheck.NEGOCIOS.LogicaAcceso;
import IdCheck.SERVICIOS.ConectarServicio;
import IdCheck.SERVICIOS.Conexion;
import java.sql.SQLException;

/**
 *
 * @author Pervac
 */
public class LogicaAccesoBD {
    
     private LogicaAcceso clsLogicaAcceso;

    public LogicaAccesoBD(LogicaAcceso clsLogicaAcceso) {
        this.clsLogicaAcceso = clsLogicaAcceso;
    }

    

    public LogicaAcceso VerificarAutorizacion() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        Conexion cdb = ConectarServicio.getInstancia().getConexionDB();
        cdb.un_sql = "SELECT IF (date(now()) BETWEEN t1.FechaDesde AND t1.FechaHasta, 1,0) AS Autorizacion,  t1.idTipoPersonal, t1.idEmpresaColaboradora,  t2.Apellidos, t2.Nombres, t1.idpersonal AS DNI, " +
"t3.NombreEmpresa, t4.NombreTipoPersonal " +
"FROM  acceso as t1 " +
"INNER JOIN  personal AS t2   ON t1.idPersonal=t2.idPersonal " +
"INNER JOIN  empresacolaboradora AS t3   ON t1.idEmpresaColaboradora=t3.idEmpresaColaboradora " +
"INNER JOIN  tipopersonal AS t4  ON  t1.idTipoPersonal=t4.idTipoPersonal " +
"WHERE  T1.idpersonal = '"+ clsLogicaAcceso.getIdacceso() +"'";
        
        cdb.resultado = cdb.us_st.executeQuery(cdb.un_sql);

        if (cdb.resultado != null) {
            if (cdb.resultado.next()) {
                clsLogicaAcceso.setAutorizacion(cdb.resultado.getInt("Autorizacion"));
                clsLogicaAcceso.setApellidos(cdb.resultado.getString("Apellidos"));
                clsLogicaAcceso.setNombres(cdb.resultado.getString("Nombres"));
                clsLogicaAcceso.setDni(cdb.resultado.getString("DNI"));
                clsLogicaAcceso.setNombreempresa(cdb.resultado.getString("NombreEmpresa"));
                clsLogicaAcceso.setNombretipopersonal(cdb.resultado.getString("NombreTipoPersonal"));
                clsLogicaAcceso.setIdTipoPersonal(cdb.resultado.getString("idTipoPersonal"));
                clsLogicaAcceso.setIdEmpresaColaboradora(cdb.resultado.getString("idEmpresaColaboradora"));
                
            }
        }

        return clsLogicaAcceso;

    }

    
    
    
}
