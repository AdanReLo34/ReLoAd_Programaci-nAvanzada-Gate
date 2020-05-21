/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class BotonesSteins extends JFrame{
    private JButton NosoyKurisu; //Este pana no es kurisu
    private JButton SisoyKurisu;
    
    public BotonesSteins()
    {
        super ("Tuturuuu");
        setLayout(new FlowLayout());
        
        NosoyKurisu = new JButton ("Yo no soy Kurisu amigo, deja de acosarme");
        add(NosoyKurisu);
        
        Icon kuri = new ImageIcon("kuri.jpg");
        Icon kuri2 = new ImageIcon("kuri2.png");
        SisoyKurisu = new JButton ("Soy Kurisu", kuri); //establece la imagen de sustitución
        SisoyKurisu.setRolloverIcon( kuri2 ); //Cambia la imagen
        add(SisoyKurisu);
        
        //Creamos un nuevo BotonesSteins para manejar los eventos
        ManejadorBoton manejador = new ManejadorBoton();
        SisoyKurisu.addActionListener( manejador );
        NosoyKurisu.addActionListener( manejador );
        
    
    }//Fin del constructor de BotonesSteins
    
    //clase interna para manejar eventos de botón
    private class ManejadorBoton implements ActionListener
    {
        public void actionPerformed (ActionEvent evento){
            JOptionPane.showMessageDialog( BotonesSteins.this, String.format("Tu le diste: %s", evento.getActionCommand()));
        
        }//fin del metodo actionPerformed
    
    }//fin de la clase interna privada ManejadorBoton
}//Fin de la clase BotonesSteins
