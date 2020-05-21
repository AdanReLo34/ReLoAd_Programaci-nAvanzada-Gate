/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2;

import javax.swing.JFrame;

/**
 *
 * @author adark
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LabelFrame marcoEtiqueta = new LabelFrame(); //crea objeto LabelFrame
        marcoEtiqueta.setSize( 275, 180); //establece el tamaño del marco
        marcoEtiqueta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoEtiqueta.setVisible(true);//muestra el marco
    }
    
}
