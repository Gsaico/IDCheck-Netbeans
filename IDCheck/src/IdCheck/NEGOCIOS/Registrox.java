/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IdCheck.NEGOCIOS;

import IdCheck.DB.RegistroBD;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import jxl.write.DateTime;

/**
 *
 * @author Pervac
 */
public class Registrox {
    
private String idRegistro;
private String Fechayhora;
private String idEstado;
private String idTipoPersonal;
private String idEmpresaColaboradora;
private String idAcceso;

    public String getFechayhora() {
        return Fechayhora;
    }

    public void setFechayhora(String Fechayhora) {
        this.Fechayhora = Fechayhora;
    }

    public String getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(String idRegistro) {
        this.idRegistro = idRegistro;
    }
   

    public String getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(String idEstado) {
        this.idEstado = idEstado;
    }

    public String getIdTipoPersonal() {
        return idTipoPersonal;
    }

    public void setIdTipoPersonal(String idTipoPersonal) {
        this.idTipoPersonal = idTipoPersonal;
    }

    public String getIdEmpresaColaboradora() {
        return idEmpresaColaboradora;
    }

    public void setIdEmpresaColaboradora(String idEmpresaColaboradora) {
        this.idEmpresaColaboradora = idEmpresaColaboradora;
    }

    public String getIdAcceso() {
        return idAcceso;
    }

    public void setIdAcceso(String idAcceso) {
        this.idAcceso = idAcceso;
    }

    
    
    
 public void grabar() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
   {
   RegistroBD pdb= new RegistroBD(this);
   pdb.Grabar();
   }

      public Registrox UltimoRegistrodeColaborador() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
   {
   RegistroBD pdb= new RegistroBD(this);
   pdb.UltimoRegistrodeColaborador();
       return  pdb.UltimoRegistrodeColaborador();
   }
    
}
