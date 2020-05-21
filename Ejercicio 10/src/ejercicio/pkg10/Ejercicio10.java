/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg10;
import javax.swing.JFrame;

public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SeleccionMultiple mul = new SeleccionMultiple();
        mul.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mul.setSize( 350, 140 );
        mul.setVisible( true );
    }
    
}
