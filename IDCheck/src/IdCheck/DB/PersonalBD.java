/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IdCheck.DB;

import IdCheck.NEGOCIOS.CustomImageIcon;
import IdCheck.NEGOCIOS.Personal;
import IdCheck.SERVICIOS.ConectarServicio;
import IdCheck.SERVICIOS.Conexion;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import javax.imageio.ImageIO;

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
               
                if (p.getFoto() != null) {
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
                cdb.ps.setBinaryStream(5, p.getFoto());
                cdb.ps.setString(6, p.getIdempresacolaboradora());
                cdb.ps.setString(7, p.getIdtipopersonal());
                cdb.ps.setString(8, p.getIdpersonal());
                cdb.ps.executeUpdate();
                
                }else{
                cdb.ps = cdb.conexion.prepareStatement("UPDATE personal SET "
                        + "Nombres= ? , "
                        + "Apellidos= ? ,"
                        + "FechaNac= ? ,"
                        + "Cargo= ? ,"
                        + "idEmpresaColaboradora= ? ,"
                        + "idTipoPersonal= ? "
                        + "WHERE idPersonal= ? ");

                cdb.ps.setString(1, p.getNombres());
                cdb.ps.setString(2, p.getApellidos());
                cdb.ps.setString(3, p.getFechanac());
                cdb.ps.setString(4, p.getCargo());
            ;
                cdb.ps.setString(5, p.getIdempresacolaboradora());
                cdb.ps.setString(6, p.getIdtipopersonal());
                cdb.ps.setString(7, p.getIdpersonal());
                cdb.ps.executeUpdate();
                
                }
                
                
                

            } else {
                cdb.ps = cdb.conexion.prepareStatement("INSERT INTO personal VALUES(?,?,?,?,?,?,?,?)");

                cdb.ps.setString(1, p.getIdpersonal());
                cdb.ps.setString(2, p.getNombres());
                cdb.ps.setString(3, p.getApellidos());
                cdb.ps.setString(4, p.getFechanac());

                if (p.getFoto() != null) {
                    cdb.ps.setBinaryStream(5, p.getFoto());
                }
                cdb.ps.setString(6, p.getCargo());
                cdb.ps.setString(7, p.getIdempresacolaboradora());
                cdb.ps.setString(8, p.getIdtipopersonal());

                cdb.ps.executeUpdate();

            }

        } else {
            cdb.ps = cdb.conexion.prepareStatement("INSERT INTO personal VALUES(?,?,?,?,?,?,?,?)");

            cdb.ps.setString(1, p.getIdpersonal());
            cdb.ps.setString(2, p.getNombres());
            cdb.ps.setString(3, p.getApellidos());
            cdb.ps.setString(4, p.getFechanac());

            if (p.getFoto() != null) {
                cdb.ps.setBinaryStream(5, p.getFoto());
            }
            cdb.ps.setString(6, p.getCargo());
            cdb.ps.setString(7, p.getIdempresacolaboradora());
            cdb.ps.setString(8, p.getIdtipopersonal());

            cdb.ps.executeUpdate();
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
                //p.setFoto(cdb.resultado.getBinaryStream("Foto"));
                p.setIdempresacolaboradora(cdb.resultado.getString("idEmpresaColaboradora"));
                p.setIdtipopersonal(cdb.resultado.getString("idTipoPersonal"));
            } 
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

     public CustomImageIcon DevolverFoto(String idDNI) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException
    {
       
        
        
       Conexion cdb = ConectarServicio.getInstancia().getConexionDB();
       CustomImageIcon ii = null;
        InputStream is = null;
        
       try{
           
        cdb.un_sql = "SELECT foto FROM personal WHERE idPersonal = '" + idDNI + "'";
        
        cdb.resultado = cdb.us_st.executeQuery(cdb.un_sql);
           
           if(cdb.resultado.next()){
               is = cdb.resultado.getBinaryStream(1);
               if(is != null)
               {
                   
                   BufferedImage bi = ImageIO.read(is);
                   ii = new CustomImageIcon(bi);
               }
               
           }
           
           
       }catch(SQLException ex){ex.printStackTrace();}
       catch(IOException ex){ex.printStackTrace();}
        
        return ii;
    }

}
