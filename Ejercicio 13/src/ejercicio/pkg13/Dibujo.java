/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg13;
import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JPanel;

public class Dibujo extends JPanel{
    private int cuenta = 0;
    
    //arreglo de 10000 referencias a java.awt.Point
    private Point puntos[] = new Point[ 10000 ];
    
    //establece la GUI y registra el manejador de eventos del ratón
    public Dibujo(){
    
        addMouseMotionListener( 
        new MouseMotionAdapter() //Clase interna anónima
        {
            public void mouseDragged( MouseEvent evento ){
            
                if ( cuenta < puntos.length)
                {
                    puntos[ cuenta ] = evento.getPoint(); //Busca el punto
                    cuenta++; //incrementa el numero de puntos en el arreglo
                    repaint(); //Vuelve a dibuar JFrame
                
                }//fin del if
            }//fin del metodo mouseDragged
        
        }//fin de la clase interna anonima
        );//fin de la llamada a addMouseMotionListener
    }//Fin del constructor de PanelDibujo
    
    //dibuja un óvalo en un cuadro delimitador de 4x4
    public void paintComponent ( Graphics g ){
    
        super.paintComponent( g ); //Borra el área del dibujo
        
        //dibuja todos los puntos en el arreglo
        
        for(int i =0; i<cuenta; i++)
            g.fillOval(puntos[ i ].x, puntos[ i ].y, 4, 4);
    }//Fin del metodo paintComponent

    void setDefaultCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}//Fin de la clase Dibujo
