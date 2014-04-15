
package IdCheck.CONTROLADOR;

import IdCheck.NEGOCIOS.Personal;
import java.sql.SQLException;
import java.util.Date;

public class ControladorPersonal {

    public void AgregarPersonal(String idpersonal, String nombres, String apellidos,
            String fechanac, String cargo, 
            String idempresacolaboradora, String idtipopersonal)
            throws ClassNotFoundException, InstantiationException,
            IllegalAccessException, SQLException {
        Personal p = new Personal();
        p.setIdpersonal(idpersonal);
        p.setNombres(nombres);
        p.setApellidos(apellidos);
        p.setFechanac(fechanac);
        p.setCargo(cargo);
      
       

        p.grabar();
    }

    public void EliminarPersonal(String idpersonal)
            throws ClassNotFoundException, InstantiationException,
            IllegalAccessException, SQLException {
        Personal p = new Personal();
        p.setIdpersonal(idpersonal);

        p.borrar();

    }
   

    
    
}
