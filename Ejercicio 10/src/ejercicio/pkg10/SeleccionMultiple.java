/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg10;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class SeleccionMultiple extends JFrame
{
    private JList Colores; //Lista para guardar los colores
    private JList Copia; //Donde se copiarán los colores
    private JButton botonCopia; //botón para copiar los nombres seleccionados
    private final String nombres[] = {"Negro", "Azul", "Cyan", "Magenta", "Amarillo", "Rojo"};
    
    //Constructor Selección múltiple
    public SeleccionMultiple(){
    
        super("Selección multiple paps");
        setLayout( new FlowLayout() );
        
        Colores = new JList (nombres);
        Colores.setVisibleRowCount( 5 );
        Colores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane( Colores ) );
        
        botonCopia = new JButton ( "Copiar >>>" );
        botonCopia.addActionListener(new ActionListener(){//Clase anonima
        
            public void actionPerformed ( ActionEvent evento){
            
                Copia.setListData(Colores.getSelectedValues());
            }//fin del método action performed
        }//Fin de la clase interna anonima
        );
        
        add( botonCopia );
        Copia = new JList();
        Copia.setVisibleRowCount( 5 );
        Copia.setFixedCellWidth( 100 );
        Copia.setFixedCellHeight( 15 );
        Copia.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        add( new JScrollPane( Copia ) );
    }
    
}
