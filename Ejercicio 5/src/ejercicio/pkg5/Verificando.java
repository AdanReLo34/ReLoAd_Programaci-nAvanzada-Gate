/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg5;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
/**
 *
 * @author adark
 */
public class Verificando extends JFrame{
    private JTextField Zona;
    private JCheckBox negritaJCheckBox;
    private JCheckBox cursivaJCheckBox;
    
 
    public Verificando(){
        super ("Probando JCheckBox");
        setLayout( new FlowLayout ());
        
        Zona = new JTextField("Wache nomas", 20);
        Zona.setFont(new Font ("Serif",Font.PLAIN, 14));
        add (Zona);
        
        negritaJCheckBox = new JCheckBox ("Negrita"); //Crea casilla de verificación
        cursivaJCheckBox = new JCheckBox ("Cursiva"); //Crea casilla de verificación
        
        add(negritaJCheckBox);
        add(cursivaJCheckBox);
        
        ManejadorJCheckBox manejador = new ManejadorJCheckBox();
        negritaJCheckBox.addItemListener(manejador);
        cursivaJCheckBox.addItemListener(manejador);
        
    }//Fin de constructor Verificando

    
    private class ManejadorJCheckBox implements ItemListener
    {
    
        private int valNegrita = Font.PLAIN;
        private int valCursiva = Font.PLAIN;
        
        public void itemStateChanged (ItemEvent evento)
        {
        if (evento.getSource() == negritaJCheckBox)
        valNegrita = negritaJCheckBox.isSelected() ? Font.BOLD : Font.PLAIN;
        
        if (evento.getSource() == cursivaJCheckBox)
        valCursiva = cursivaJCheckBox.isSelected() ? Font.ITALIC : Font.PLAIN;
        
        Zona.setFont(new Font ("Serif", valNegrita + valCursiva, 14));
        
        }
    }
}
