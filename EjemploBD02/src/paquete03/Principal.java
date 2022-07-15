/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import java.util.Scanner;
import paquete01.Enlace;
import paquete02.Auto;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) throws SQLException {
        /*Enlace c = new Enlace();
        a.establecerPlaca("LBNS0001");
        a.establecerValorMatricula(200.2);
        
        c.insertarAuto(a);
        */
        Enlace c = new Enlace();
        Auto a = new Auto();
        Scanner sc = new Scanner(System.in);
        
        boolean bandera = true; 
        

        while (bandera) {
            System.out.println("Ingrese la placa del auto: ");
            String cr = sc.nextLine();
            System.out.println("Ingrese el coste de la matricula: ");
            int e = sc.nextInt();

            a.establecerPlaca(cr);
            a.establecerValorMatricula(e);

            c.insertarAuto(a);
            sc.nextLine();
            System.out.println("Ingrese S si desea contuniar o N si desea terminar");
            String er = sc.nextLine();
            
            if(er.equals("N")){
                bandera = false; 
            }
        }
        
    }
}
