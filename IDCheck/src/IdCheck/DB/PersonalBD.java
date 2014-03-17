/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IdCheck.DB;

import IdCheck.NEGOCIOS.Personal;
import IdCheck.SERVICIOS.ConectarServicio;
import IdCheck.SERVICIOS.Conexion;
import java.sql.SQLException;

/**
 *
 * @author Pervac
 */
public class PersonalBD {

    private Personal p;

    public PersonalBD(Personal p) {
        this.p = p;
    }

    public void Grabar() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        Conexion cdb = ConectarServicio.getInstancia().getConexionDB();
        cdb.un_sql = "SELECT * FROM personal WHERE idPersonal='" + p.getIdpersonal() + "'";
        cdb.resultado = cdb.us_st.executeQuery(cdb.un_sql);

        if (cdb.resultado != null) {
            if (cdb.resultado.next()) {
cdb = ConectarServicio.getInstancia().getConexionDB();
                cdb.ps = cdb.conexion.prepareStatement("UPDATE personal SET "
                        + "Nombres= ? , "
                        + "Apellidos= ? ,"
                        + "FechaNac= ? ,"
                        + "Cargo= ? ,"
                        + "Foto= ? ,"
                        + "idEmpresaColaboradora= ? ,"
                        + "idTipoPersonal= ? "
                        + "WHERE idPersonal= ? ");

                cdb.ps.setString(1, p.getNombres());
                cdb.ps.setString(2, p.getApellidos());
                cdb.ps.setString(3, p.getFechanac());
                cdb.ps.setString(4, p.getCargo());
             if (p.getFoto() != null) {
                    cdb.ps.setBinaryStream(5, p.getFoto());
                }
                cdb.ps.setString(6, p.getIdempresacolaboradora());
                cdb.ps.setString(7, p.getIdtipopersonal());
                cdb.ps.setString(8, p.getIdpersonal());

               
               cdb.ps.executeUpdate();
               

                //cdb.un_sql = "UPDATE personal SET  Nombres='" + p.getNombres()
                //        + "', Apellidos='" + p.getApellidos() + "', FechaNac='" + p.getFechanac() + "',  Cargo='" + p.getCargo()
                //        + "', Foto="+ p.getFoto()  +", idEmpresaColaboradora='" + p.getIdempresacolaboradora()
                //       + "', idTipoPersonal='" + p.getIdtipopersonal() + "' WHERE idPersonal='" + p.getIdpersonal() + "'";
                // cdb.us_st.executeUpdate(cdb.un_sql);
                
            } else {
                cdb.un_sql = "INSERT INTO personal VALUES(  '" + p.getIdpersonal() + "', '" + p.getNombres()
                        + "', '" + p.getApellidos() + "','" + p.getFechanac() + "'," + p.getCargo()
                        + "," + p.getFoto() + "," + p.getIdempresacolaboradora()
                        + "," + p.getIdtipopersonal() + ")";

                cdb.us_st.executeUpdate(cdb.un_sql);

            }

        } else {
            cdb.un_sql = "INSERT INTO personal VALUES(  '" + p.getIdpersonal() + "', '" + p.getNombres()
                    + "', '" + p.getApellidos() + "'," + p.getFechanac() + "," + p.getCargo()
                    + "," + p.getFoto() + "," + p.getIdempresacolaboradora()
                    + "," + p.getIdtipopersonal() + ")";

            cdb.us_st.executeUpdate(cdb.un_sql);
        }

    }

    public Personal Leer() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        Conexion cdb = ConectarServicio.getInstancia().getConexionDB();
        cdb.un_sql = "SELECT * FROM personal WHERE idPersonal='" + p.getIdpersonal() + "'";
        cdb.resultado = cdb.us_st.executeQuery(cdb.un_sql);

        if (cdb.resultado != null) {
            if (cdb.resultado.next()) {
                p.setIdpersonal(cdb.resultado.getString("idpersonal"));
                p.setNombres(cdb.resultado.getString("Nombres"));
                p.setApellidos(cdb.resultado.getString("Apellidos"));
                p.setFechanac(cdb.resultado.getString("FechaNac"));
                p.setCargo(cdb.resultado.getString("Cargo"));
                //  p.setFoto(cdb.resultado.getByte("Foto"));
                p.setIdempresacolaboradora(cdb.resultado.getString("idEmpresaColaboradora"));
                p.setIdtipopersonal(cdb.resultado.getString("idTipoPersonal"));
            } else {
                throw new Error("Registro: " + p.getIdpersonal() + "No se encuentra en la tabla personal" + this.getClass().getName());
            }
        } else {
            throw new Error("Consulta en Registro: " + p.getIdpersonal() + "Ha devuelto un resordset null ubicación" + this.getClass().getName());
        }
        return p;

    }

    public void Borrar() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        Conexion cdb = ConectarServicio.getInstancia().getConexionDB();
        cdb.un_sql = "DELETE FROM personal WHERE idPersonal='" + p.getIdpersonal() + "'";
        cdb.us_st.executeUpdate(cdb.un_sql);
    }


}
