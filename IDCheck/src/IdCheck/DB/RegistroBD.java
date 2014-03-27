/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IdCheck.DB;

import IdCheck.NEGOCIOS.Registrox;
import IdCheck.SERVICIOS.ConectarServicio;
import IdCheck.SERVICIOS.Conexion;
import java.sql.SQLException;

/**
 *
 * @author Pervac
 */
public class RegistroBD {
    
    private Registrox clsReg;

    public RegistroBD(Registrox clsReg) {
        this.clsReg = clsReg;
    }

    public void Grabar() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        Conexion cdb = ConectarServicio.getInstancia().getConexionDB();
        cdb.un_sql = "select now() as Fechitayhora";
        cdb.resultado = cdb.us_st.executeQuery(cdb.un_sql);

        if (cdb.resultado != null) {
            if (cdb.resultado.next()) {
                clsReg.setFechayhora(cdb.resultado.getString("Fechitayhora"));

            }
        }

        
        
        cdb.ps = cdb.conexion.prepareStatement("INSERT INTO registro(`Fechayhora`,`idTipoPersonal`,`idEmpresaColaboradora`,`idAcceso`,`idEstado`) VALUES(?,?,?,?,?)");

        cdb.ps.setString(1, clsReg.getFechayhora());

        cdb.ps.setString(2, clsReg.getIdTipoPersonal());
        cdb.ps.setString(3, clsReg.getIdEmpresaColaboradora());

        cdb.ps.setString(4, clsReg.getIdAcceso());

        cdb.ps.setString(5, clsReg.getIdEstado());

        cdb.ps.executeUpdate();

    }
    
    public Registrox UltimoRegistrodeColaborador() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        Conexion cdb = ConectarServicio.getInstancia().getConexionDB();
        cdb.un_sql = "SELECT  idRegistro,    Fechayhora, idTipoPersonal,    idEmpresaColaboradora,  idAcceso,    idEstado FROM registro WHERE  idAcceso='" + clsReg.getIdAcceso() + "' order by Fechayhora desc  limit 1";
        cdb.resultado = cdb.us_st.executeQuery(cdb.un_sql);

        if (cdb.resultado != null) {
            if (cdb.resultado.next()) {
                clsReg.setIdRegistro(cdb.resultado.getString("idRegistro"));
                clsReg.setFechayhora(cdb.resultado.getString("Fechayhora"));
                clsReg.setIdTipoPersonal(cdb.resultado.getString("idTipoPersonal"));
                clsReg.setIdEmpresaColaboradora(cdb.resultado.getString("idEmpresaColaboradora"));
                clsReg.setIdAcceso(cdb.resultado.getString("idAcceso"));
              clsReg.setIdEstado(cdb.resultado.getString("idEstado"));
            }
        }

        return clsReg;

    }
    
}
