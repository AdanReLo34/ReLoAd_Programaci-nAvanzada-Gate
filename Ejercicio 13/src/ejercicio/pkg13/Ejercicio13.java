/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg13;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejercicio13 {

    public static void main(String[] args) {
        //Crea objeto JFrame
        JFrame aplicacion = new JFrame ("Ostia, un artista");
        
        Dibujo dibujo = new Dibujo(); 
        aplicacion.add( dibujo, BorderLayout.CENTER );
        
        aplicacion.add( new JLabel( "El rato es su pincel master"), BorderLayout.SOUTH);
        
        aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        aplicacion.setSize( 400, 200);
        aplicacion.setVisible( true );
    }
    
}
