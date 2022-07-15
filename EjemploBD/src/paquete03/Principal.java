/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import paquete01.Enlace;
import paquete02.Ciudad;

import javax.swing.plaf.ComponentUI;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) throws SQLException {
        Enlace c = new Enlace();
        /*Ciudad ciudad = new Ciudad("MAchala", 5048756);
        c.insertarCiudad(ciudad);
         */
        Scanner sc = new Scanner(System.in);
        
        boolean bandera = true; 
        

        while (bandera) {
            System.out.println("Ingrese el nombre de la cuidad: ");
            String cr = sc.nextLine();
            System.out.println("Ingrese la problacion de la ciudad: ");
            int e = sc.nextInt();

            Ciudad ciudad = new Ciudad(cr, e);
            c.insertarCiudad(ciudad);
            sc.nextLine();
            
            System.out.println("Ingrese S si desea contuniar o N si desea terminar");
            String er = sc.nextLine();
            
            if(er.equals("N")){
                bandera = false; 
            }
        }
            
        /* for (int i = 0; i < c.obtenerDataCiudad().size(); i++) {S
        s
            System.out.printf("%s", c.obtenerDataCiudad().get(i));
        }
         */
    }
}
