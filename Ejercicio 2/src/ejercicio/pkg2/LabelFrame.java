/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;
/**
 *
 * @author adark
 */
public class LabelFrame extends JFrame
{
    private JLabel etiqueta1; //JLabel sólo un texto
    private JLabel etiqueta2; //JLabel construida con texto y un icono
    private JLabel etiqueta3; //JLabel con texto adicional e icono
    
    // El constructor de LabelFrame agrega objetos JLabel a JFrame
    public LabelFrame()
    {
        super ("Probando, uno dos");
        setLayout (new FlowLayout()); //establece esquema del marco
        
        // Constructor de JLabel con un argumento String
        JLabel etiqueta1 = new JLabel("Hola extraño");
        etiqueta1.setToolTipText("Esta es mi primera etiqueta en Net");
        add( etiqueta1 ); // agrega etiqueta1 a JFrame
        
        //Consttructor de JLabel con argumentos de cadena, Icono y alineación
        Icon mine = new ImageIcon("mine.png");
        JLabel etiqueta2 = new JLabel ( "Etiqueta con texto e icono", mine, SwingConstants.LEFT);
        etiqueta2.setToolTipText("Esta es etiqueta2");
        add( etiqueta2 );//Agrega la etiqueta a JFrame
        
        JLabel etiqueta3 = new JLabel (); //Constructor de JLabel sin argumentos
        etiqueta3.setText( "Apoco no lo viste venir" );
        etiqueta3.setIcon(mine); //Agrega icono a JLabel
        etiqueta3.setHorizontalTextPosition(SwingConstants.CENTER);
        etiqueta3.setVerticalTextPosition(SwingConstants.BOTTOM);
        etiqueta3.setToolTipText("Esta es mi tercera etiqueta de Java PAPs");
        add(etiqueta3);
    }
}//fin de la clase LAbelFrame
