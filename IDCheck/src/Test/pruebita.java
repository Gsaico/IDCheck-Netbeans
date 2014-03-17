/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Test;

import IdCheck.NEGOCIOS.Personal;
import IdCheck.SERVICIOS.ConectarServicio;
import IdCheck.SERVICIOS.Conexion;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Blob;
import java.sql.SQLException;
import java.text.ParseException;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Properties;
import sun.misc.IOUtils;


/**
 *
 * @author Pervac
 */
public class pruebita {
    
  public static void main(String[]Args) throws ParseException, FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException

{
   try{

FileInputStream propFile= new FileInputStream(System.getProperty("user.dir") + "\\src\\IdCheck\\PRINCIPAL\\configurardb.txt");
Properties p= new Properties(System.getProperties());
p.load(propFile);

System.setProperties(p);
if(System.getProperty("mostrarproperties").compareTo("si")==0){
System.getProperties().list(System.out);
}
}
  catch (java.io.FileNotFoundException e){
System.out.println("No se encuentra el archivo de configuracion");
System.exit(-1);

}
  
  catch (java.io.IOException e) {
    
    System.out.println("Ocurrio algun error de I/O");
System.exit(-1);
  }
  
try{

    Conexion  cdb= ConectarServicio.getInstancia().getConexionDB();
        
}            
catch(java.lang.ClassNotFoundException e)
        {
        System.out.println("Ocurrio la Excepcion"+ e.toString());
        System.out.println("Es posible que mno se pueda encontrar la clase del conector JDBC" + System.getProperty("driver")+ ", Agreguela a su Classpath con la opcion -cp");
        System.exit(-1);
        }

catch(java.lang.InstantiationException e)
        {
        System.out.println("Ocurrio un error de instanciacion"+ e.toString());
         System.exit(-1);
        }
      catch(java.lang.IllegalAccessException e)
        {
        System.out.println("Ocurrio un error de acceso ilegal"+ e.toString());
         System.exit(-1);
        }  
    
    //hdhdhdhddh
Personal personal1=new Personal();
Date formatoFecha = new SimpleDateFormat("yyyy/mm/dd").parse("1982/10/26");
personal1.setIdpersonal("07484492");
personal1.setNombres("Grimaldo Percy");
personal1.setApellidos("Saico Ccapa");
personal1.setFechanac("1999/12/12");
personal1.setCargo("2");
//personal1.setFoto(nothing);
 String rutafoto = "C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg";
  FileInputStream fis =null;
   
                File file = new File(rutafoto);
                fis = new FileInputStream(file);
                            
         //   Blob var;
          //  var=fis;
            

   personal1.setFoto(fis);                 
                    
///jdsjhdhdhdfh
personal1.setIdempresacolaboradora("20100098041");
personal1.setIdtipopersonal("2");
personal1.grabar();

System.out.println(personal1.getApellidos());

 
}
  
    
}
