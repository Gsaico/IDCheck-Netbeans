/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IdCheck.NEGOCIOS;

import IdCheck.DB.LogicaAccesoBD;
import java.io.FileInputStream;
import java.sql.SQLException;

/**
 *
 * @author Pervac
 */
public class LogicaAcceso {
    private String autorizacion;
    private String idacceso;
    private FileInputStream  foto;
    private String apellidos;
    private String nombres;
    private String dni;
    private String nombreempresa;
    private String nombretipopersonal;

    public String getAutorizacion() {
        return autorizacion;
    }

    public void setAutorizacion(String autorizacion) {
        this.autorizacion = autorizacion;
    }

    public String getIdacceso() {
        return idacceso;
    }

    public void setIdacceso(String idacceso) {
        this.idacceso = idacceso;
    }

    public FileInputStream getFoto() {
        return foto;
    }

    public void setFoto(FileInputStream foto) {
        this.foto = foto;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreempresa() {
        return nombreempresa;
    }

    public void setNombreempresa(String nombreempresa) {
        this.nombreempresa = nombreempresa;
    }

    public String getNombretipopersonal() {
        return nombretipopersonal;
    }

    public void setNombretipopersonal(String nombretipopersonal) {
        this.nombretipopersonal = nombretipopersonal;
    }
    
    
       public LogicaAcceso VerificarAutorizacion() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
   {
   LogicaAccesoBD pdb= new LogicaAccesoBD(this);
   pdb.VerificarAutorizacion();
       return  pdb.VerificarAutorizacion();
   }
}
