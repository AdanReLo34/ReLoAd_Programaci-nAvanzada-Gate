/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg6;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
/**
 *
 * @author adark
 */
public class MarvoBoton extends JFrame{
    private JTextField Zona;
    private Font ElBetan; //Tipo de texto simple
    private Font SoyNegro;//Negrita
    private Font QueElegancia;//Cursiva
    private Font SoyUnNegroElegante;//Negrita y Cursiva
    private JRadioButton Simple;//selecciona texto simple
    private JRadioButton Negro; //selecciona negritas
    private JRadioButton Elegante; //Selecciona curisva
    private JRadioButton NegroElegante; // negrita y cursiva
    private ButtonGroup grupoOpciones; //grupo de botones que tienen las acciones
    
    //Constructor MarvoBoton
    public MarvoBoton(){
    
        super("Un dos tres probando");
        setLayout( new FlowLayout() );
        
        Zona = new JTextField ("Dame características!", 28);
        add(Zona);
        
        Simple = new JRadioButton ("Me dicen el Betan por simple", true);
        Negro = new JRadioButton ("Quieres un baile?", true);
        Elegante = new JRadioButton ("Dime algo con propiedad", true);
        NegroElegante = new JRadioButton ("Ma nigga yeah", true);
        
        add( Simple );
        add( Negro );
        add( Elegante );
        add( NegroElegante );
        
        grupoOpciones = new ButtonGroup();
        grupoOpciones.add(Simple);
        grupoOpciones.add(Negro);
        grupoOpciones.add(Elegante);
        grupoOpciones.add(NegroElegante);
        
        ElBetan = new Font ("Serif", Font.PLAIN, 14);
        SoyNegro = new Font ("Serif", Font.BOLD, 14);
        QueElegancia = new Font ("Serif", Font.ITALIC, 14);
        SoyUnNegroElegante = new Font ("Serif", Font.BOLD + Font.ITALIC, 14);
        Zona.setFont( ElBetan );
        
        Simple.addItemListener( new Manejador (ElBetan));
        Negro.addItemListener(new Manejador (SoyNegro));
        Elegante.addItemListener(new Manejador (QueElegancia));
        NegroElegante.addItemListener( new Manejador (SoyUnNegroElegante));
        
    }//Fin de Constructor MarvoBoton
    
    //Clase interna para manejar botones
    private class Manejador implements ItemListener{

        private Font tipoLetra;
        
        public Manejador ( Font f ){
        
            tipoLetra = f; //Establece el tipo de letra de este componente
        }//Fin del constructor Manejador
        
        public void itemStateChanged ( ItemEvent evento ){
        
            Zona.setFont(tipoLetra);
        }
    }
}
