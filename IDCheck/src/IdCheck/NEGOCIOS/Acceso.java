

package IdCheck.NEGOCIOS;

import IdCheck.DB.AccesoBD;
import java.sql.SQLException;


public class Acceso {
   
    private int idacceso;
    private String idpersonal;
    private String fecha;
    private String fechadesde;
    private String fechahasta;
    private String nota;
    private boolean essalud;
    private boolean sctrsalud;
    private boolean sctrpensiones;
    private boolean pdtplame;
    private boolean afp;
    private boolean onp;
    //dato obligatorio
    private String idarea;
    
    private String idempresacolaboradora;
    
//dato obligatorio
    private String idtipopersonal;

    public int getIdacceso() {
        return idacceso;
    }

    public void setIdacceso(int idacceso) {
        this.idacceso = idacceso;
    }

    public String getIdpersonal() {
        return idpersonal;
    }

    public void setIdpersonal(String idpersonal) {
        this.idpersonal = idpersonal;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFechadesde() {
        return fechadesde;
    }

    public void setFechadesde(String fechadesde) {
        this.fechadesde = fechadesde;
    }

    public String getFechahasta() {
        return fechahasta;
    }

    public void setFechahasta(String fechahasta) {
        this.fechahasta = fechahasta;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public boolean isEssalud() {
        return essalud;
    }

    public void setEssalud(boolean essalud) {
        this.essalud = essalud;
    }

    public boolean isSctrsalud() {
        return sctrsalud;
    }

    public void setSctrsalud(boolean sctrsalud) {
        this.sctrsalud = sctrsalud;
    }

    public boolean isSctrpensiones() {
        return sctrpensiones;
    }

    public void setSctrpensiones(boolean sctrpensiones) {
        this.sctrpensiones = sctrpensiones;
    }

    public boolean isPdtplame() {
        return pdtplame;
    }

    public void setPdtplame(boolean pdtplame) {
        this.pdtplame = pdtplame;
    }

    public boolean isAfp() {
        return afp;
    }

    public void setAfp(boolean afp) {
        this.afp = afp;
    }

    public boolean isOnp() {
        return onp;
    }

    public void setOnp(boolean onp) {
        this.onp = onp;
    }

    public String getIdarea() {
        return idarea;
    }

    public void setIdarea(String idarea) {
        this.idarea = idarea;
    }

    public String getIdempresacolaboradora() {
        return idempresacolaboradora;
    }

    public void setIdempresacolaboradora(String idempresacolaboradora) {
        this.idempresacolaboradora = idempresacolaboradora;
    }

    public String getIdtipopersonal() {
        return idtipopersonal;
    }

    public void setIdtipopersonal(String idtipopersonal) {
        this.idtipopersonal = idtipopersonal;
    }

   
    public void GrabarXidpersonal() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
   {
   AccesoBD pdb= new AccesoBD(this);
   pdb.GrabarXidpersonal();
   }
    
  
    
    
}
