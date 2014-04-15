/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IdCheck.DB;

import IdCheck.NEGOCIOS.EmpresaColaboradora;
import IdCheck.SERVICIOS.ConectarServicio;
import IdCheck.SERVICIOS.Conexion;
import java.sql.SQLException;

/**
 *
 * @author Pervac
 */
public class EmpresaColaboradoraBD {
    
    private EmpresaColaboradora clsEC;

    public EmpresaColaboradoraBD(EmpresaColaboradora clsEC) {
        this.clsEC = clsEC;
    }

   

    public EmpresaColaboradora ListarEmpresaXID() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        Conexion cdb = ConectarServicio.getInstancia().getConexionDB();
        cdb.un_sql = "SELECT NombreEmpresa, Gerente, Telefono, Email, idEmpresaColaboradora FROM empresacolaboradora WHERE idEmpresaColaboradora='" + clsEC.getIdEmpresaColaboradora() + "'";
        
        cdb.resultado = cdb.us_st.executeQuery(cdb.un_sql);
       
       
        
        if (cdb.resultado != null) {
            if (cdb.resultado.next()) {
                clsEC.setNombreEmpresa(cdb.resultado.getString("NombreEmpresa")); 
                clsEC.setGerente(cdb.resultado.getString("Gerente")); 
                clsEC.setTelefono(cdb.resultado.getString("Telefono")); 
                clsEC.setEmail(cdb.resultado.getString("Email")); 
                clsEC.setIdEmpresaColaboradora(cdb.resultado.getString("idEmpresaColaboradora")); 
           
            } 
        
        } 
       return clsEC;

    }
    
}
