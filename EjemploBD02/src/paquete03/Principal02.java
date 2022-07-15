/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete01.Enlace;

/**
 *
 * @author camil
 */
public class Principal02 {
    public static void main(String[] args) {
        Enlace c = new Enlace();
        
        for (int i = 0; i < c.obtenerDataAuto().size(); i++) {
            System.out.printf("%s\n", c.obtenerDataAuto().get(i));
        }
    }
}
