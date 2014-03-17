/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Pervac
 */
public class prueba2 {
    public static void main(String[] args) {
		
		FileInputStream fileInputStream = null;
		File file = new File("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg");
		byte[] fileArray = new byte[(int) file.length()];
 
		try {
			// Con este código se obtienen los bytes del archivo.
			fileInputStream = new FileInputStream(file);
			fileInputStream.read(fileArray);
			fileInputStream.close();
 
			// Con este código se agregan los bytes al archivo.
			FileOutputStream fileOuputStream = new FileOutputStream("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert2.jpg");
			fileOuputStream.write(fileArray);
			fileOuputStream.close();
 
		} catch (Exception e) {
			//Manejar Error
		}
	}
}
