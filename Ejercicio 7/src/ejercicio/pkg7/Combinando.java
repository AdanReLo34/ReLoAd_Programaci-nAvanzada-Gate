/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg7;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Combinando extends JFrame{
private JComboBox KuriReturn;
private JLabel etiqueta;

private String nombres[] = {"kuri.jpg","kuri2.png","mine.png","gato.jpg"};
private Icon iconos [] = {new ImageIcon (nombres [0]),
                          new ImageIcon (nombres [1]),
                          new ImageIcon ( nombres [2]),
                          new ImageIcon ( nombres [3])};

public Combinando(){

    super ("Probando Combos");
    setLayout( new FlowLayout() );
    
    KuriReturn = new JComboBox (nombres);
    KuriReturn.setMaximumRowCount(3);
    
    KuriReturn.addItemListener(new ItemListener(){//Clase interna anonima
        public void itemStateChanged (ItemEvent evento){
     
            if ( evento.getStateChange() == ItemEvent.SELECTED )
                etiqueta.setIcon(iconos[KuriReturn.getSelectedIndex()]);
        }
    
    }//Fin de la clase interna anonima
    );//Fin del addItemListener
    add (KuriReturn);
    etiqueta = new JLabel(iconos [0]);
    add (etiqueta);
}
    
}
