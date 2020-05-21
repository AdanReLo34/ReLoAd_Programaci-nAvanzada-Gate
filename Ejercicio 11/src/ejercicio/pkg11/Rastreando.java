/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg11;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Rastreando extends JFrame{
    private JPanel Raton; //Panel donde ocurrirá el ebento
    private JLabel Estado; //Etiqueta de información
    
    //El constructor de Rastreando establece la GUI
    public Rastreando (){
   
        super("Eventos con ratón");
        Raton = new JPanel();
        Raton.setBackground(Color.MAGENTA);
        add( Raton,BorderLayout.CENTER );
        
        Estado = new JLabel ("Estas fuera del panel el hermano");
        add( Estado, BorderLayout.SOUTH );
        //Crea y registra un componente que de escucha para los eventos de raton y de movimiento
        Manejador manejador = new Manejador();
        Raton.addMouseListener( manejador );
        Raton.addMouseMotionListener( manejador );
        
    }//fin del constructor
    
    private class Manejador implements MouseListener, MouseMotionListener{
   
        public void mouseClicked( MouseEvent evento ){
        
            Estado.setText( String.format( "Presiono en [%d, %d]", evento.getX(), evento.getY()));
            
        }//Fin del metodo mouseClicked
        
    //Maneja evento cuando se oprime el ratón
        public void mousePressed( MouseEvent evento){
        
            Estado.setText( String.format( "Presiono en [%d, %d]", evento.getX(), evento.getY()));
            
        }//Fin del método moousePressed
        
        //Maneja evento cuando se suelta el botón del ratón después de arrastrarlo
        public void mouseReleased( MouseEvent evento ){
        
            Estado.setText( String.format("Se solto en [%d, %d]", evento.getX(),evento.getY()));
        }//Fin del método mouseRelease
        
        //Maneja evento cuando el ratón entra al área
        public void mouseEntered( MouseEvent evento){
        
            Estado.setText( String.format ("Ratón entro en [%d, %d]", evento.getX(), evento.getY()));
            Raton.setBackground(Color.YELLOW);
            
            
        }//Fin del metodo mouseEntered
        
        //Maneja evento cuando el ratón sale del área
        public void mouseExited( MouseEvent evento){
       
            Estado.setText( String.format ("Ratón fuera de panel"));
            Raton.setBackground(Color.CYAN);
            
        }//Fin de mouseExited
        
        //el evento cuando el usuario arrastra el ratón con el botón oprimido
        public void mouseDragged ( MouseEvent evento){
        
            Estado.setText( String.format( "Se arrastro en [%d, %d]", evento.getX(),evento.getY()));
            
        }   //Fin del método mouseDragged
        
        //maneja evento cuando el usuario mueve el ratón
        public void mouseMoved( MouseEvent evento){
        
            Estado.setText( String.format( "Se movio en [%d, %d]", evento.getX(), evento.getY()));
        }
    }
}
