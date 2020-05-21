/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg9;

import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.ListSelectionModel;

public class Colores extends JFrame{
    private JList Colores;
    
    private final String nombres[] = {"Negro", "Azul", "Magenta", "Gris", "Verde",
    "Cyan", "Naranja", "Rosa", "Rojo", "Blanco", "Amarillo"};
    
    private final Color Sabores[] = {Color.BLACK, Color.BLUE, Color.MAGENTA, Color.GRAY,
    Color.CYAN, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW};
    
    public Colores(){
    
        super ("Lista de colores");
        setLayout( new FlowLayout() );
        
        Colores = new JList(Sabores);
        Colores.setVisibleRowCount(5);//Permite mostrar 5 filas a la vez
        
        //no permite selecciones múltiples
        Colores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        //agrega al marco un objeto JScrollPane que contiene a JList
        add( new JScrollPane( Colores ));
        
        Colores.addListSelectionListener(new ListSelectionListener(){//Clase anonima
        
            public void valueChanged (ListSelectionEvent evento){
            
                getContentPane().setBackground(Sabores[ Colores.getSelectedIndex()]);
            }
        }
        );
    }
}
