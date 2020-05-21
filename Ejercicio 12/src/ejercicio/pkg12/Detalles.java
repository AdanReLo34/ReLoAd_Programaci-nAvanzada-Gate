/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg12;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Detalles extends JFrame{
    private String detalle; //objeto string que representa al objeto JLabel
    private JLabel Estado; //que paraece en la parte inferior de la ventana
    
    //constructor establece String de la barra de título y registra componente de escucha de ratón
    
    public Detalles(){
    
        super("Juegue con su ratón");
        
        Estado = new JLabel( "Adelante, toque 7u7r" );
        add (Estado, BorderLayout.SOUTH);
        addMouseListener( new ManejadorClic()); //agrega el manejador
        
    }//fin de constructor Detalles
    
    //clase interna para el manejador
    private class ManejadorClic extends MouseAdapter{
    
        //maneja evento de clic de ratón y determina cual boton se oprimio
        public void mousClicked( MouseEvent evento){
        
            int x = evento.getX();
            int y = evento.getY();
            
            detalle = String.format( "Se presiono %d vez (veces)", evento.getClickCount());
            
            if (evento.isMetaDown()) //botón derecho del ratón
                detalle += "Con el boton derecho del ratón";
            
            else if (evento.isAltDown()) //Boton central
                detalle += "Con el botón central del raton";
            
            else //Botón izquierdo
                detalle += "Con el botón izquierdo del ratón";
            
            Estado.setText(detalle);
        }
    }
    
}
