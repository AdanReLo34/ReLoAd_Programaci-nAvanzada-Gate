/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg14;
import javax.swing.JFrame;

public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Teclas teclas = new Teclas();
        teclas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        teclas.setSize( 350, 200 );
        teclas.setVisible( true );
    }
    
}
