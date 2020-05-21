/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg14;

import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Teclas extends JFrame implements KeyListener{
    private String l1 = ""; //primera línea del área de texto
    private String l2 = ""; //segunda
    private String l3 = "";
    private JTextArea Zona; //área de texto
    
    //constructor de Teclas
    public Teclas(){
    
        super( "Demostración de los eventos de pulsación de teclas" );
        
        Zona = new JTextArea( 10, 15); //establece el objeto JTextArea
        Zona.setText( "Toque sus teclas uwu" );
        Zona.setEnabled( false );//Deshabilita el área del texto
        Zona.setDisabledTextColor( Color.BLACK );//Establece el color del texto
        add( Zona );//Añade el texto al JFrame
        
        addKeyListener( this );//Permite al marco procesar los eventos de teclas
    }// Fin del constructor Teclas
    
    //Maneja el evento de oprimir cualquier tecla
    public void keyPressed ( KeyEvent evento){
    
        l1= String.format( "Usted presiono: %s", evento.getKeyText( evento.getKeyCode() ) );
        establecerl2y3( evento );//Establece las líneas de salida dos y 3
    }//Fin del metodo keyPressed
    
    //maneja el evento de liberar vualquier tecla
    public void keyReleased( KeyEvent evento){
    
        l1 = String.format( "Solto: %s", evento.getKeyText( evento.getKeyCode() )  );
        establecerl2y3( evento );
    }//Fin de keyReleased
    
    //maneja el evento de oprimir una tecla de acción
    public void keyTyped( KeyEvent evento ){
    
        l1 = String.format( "Tecla oprimida: %s", evento.getKeyChar() );
        establecerl2y3( evento );
    }//Fin del método keyTyped
    
    private void establecerl2y3( KeyEvent evento){
    
        l2 = String.format( "Usted, haciendo uso de %s esta ejecutando una acción", (evento.isActionKey() ? "" : "no") );
        String temp = evento.getKeyModifiersText( evento.getModifiers() );
        
        l3 = String.format( "Teclas modificadoras oprimidas: %s", ( temp.equals( "" ) ? "ninguna" : temp ) );
        
        Zona.setText( String.format( "%s\n%s\n%s\n", l1, l2, l3 ) );
        
    }//Fin del metodo establecer lineas 2y3
    
}//Fin de la clase
