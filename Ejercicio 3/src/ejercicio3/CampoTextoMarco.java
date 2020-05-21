
package ejercicio3;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;


public class CampoTextoMarco extends JFrame
{
    private JTextField campoTexto1; //campo de texto con tamaño fijo
    private JTextField campoTexto2; //campo de texto construido con texto
    private JTextField campoTexto3; //campo de texto con texto y con tamaño
    private JPasswordField campoContraseña; //campo de contraseña con texto
    
    //El constructor de CampoTextoMarco agrega objetos JTextField a JFrame
    public CampoTextoMarco()
    {
        super( "Prueba de JTextField y JPasswordField" );
        setLayout( new  FlowLayout() ); //Establece el esquema del marco
        
        //construye campo de texto con 10 columnas
        campoTexto1 = new JTextField(10);
        add( campoTexto1 ); //agrega campoTexto1 a JFrame
        
        //Construye campo de texto con texto predeterminado
        campoTexto2 = new JTextField ( "Tiene usted estimado algo para halegar?" );
        add ( campoTexto2 );
        
        //Construye campo de texto con texto predeterminado y 21 columnas
        campoTexto3 = new JTextField ("Aquí no editas papi", 21);
        campoTexto3.setEditable( false ); //deshabilita la edición
        add ( campoTexto3 );//agrega campoTexto3 a JFrame
        
        //Construye campo de contraseña con texto predeterminado
        campoContraseña = new JPasswordField ("Texto oculto");
        add (campoContraseña);
        
        //registra los manejadores de eventos
        ManejadorCampoTexto manejador = new ManejadorCampoTexto();
        campoTexto1.addActionListener(manejador);
        campoTexto2.addActionListener(manejador);
        campoTexto3.addActionListener(manejador);
    }//fin del constructor de CampoTextoMarco
    
    //clase interna privada para el manejo de eventos
    private class ManejadorCampoTexto implements ActionListener
    {
        //procesa los eventos de campo de texto
        public void actionPerformed (ActionEvent evento)
        {
            String cadena = ""; //declara la cadena a mostrar
            
            //el usuario oprimio Intro en el objeto JTextField campoTexto 1
            if (evento.getSource() == campoTexto1)
                cadena = String.format("campoTexto1: %s", evento.getActionCommand());
            
            //el usuario oprimio Intro en el objeto JTextField campoTexto2
            if (evento.getSource() == campoTexto2)
                cadena = String.format("campoTexto2: %s", evento.getActionCommand());
            
            //el usuario oprimio Intro en el objeto JTextField campoTexto3
            if (evento.getSource() == campoTexto3)
                cadena = String.format("campoTexto3: %s", evento.getActionCommand());
            
            //el usuario oprimió Intro en el objeto JTextField campoContraseña
            if (evento.getSource() == campoContraseña)
                cadena = String.format("campoContraseña: %s", new String (campoContraseña.getPassword()));
            
            //muestra el contenido del objeto JTextField
            JOptionPane.showMessageDialog(null, cadena);
            
            }//fin del metodo actionPerformed
    }//fin de la clase interna privada ManejadorCampoTexto
}//fin de la clase CampoTextoMarco
