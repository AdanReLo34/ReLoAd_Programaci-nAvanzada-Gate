/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;
import javax.swing.JOptionPane;
/**
 *
 * @author adark
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Obtiene la entrada del usuario
        String primerNumero = JOptionPane.showInputDialog("Indroduzca el primer entero"); 
        String segundoNumero = JOptionPane.showInputDialog("Introduzca el segundo entero");
        
        //Convierte las entradas String en valores int
        
        int numero1 = Integer.parseInt ( primerNumero );
        int numero2 = Integer.parseInt ( segundoNumero );
        
        int suma = numero1 + numero2;
        
        //muestra los resultados en un diálogo de mensajes de JOptionPane
        JOptionPane.showMessageDialog ( null, "La suma es " + suma, "Suma de dos enteros", JOptionPane.PLAIN_MESSAGE );
    }   //fin del método main
      
    
}//Fin de la clase suma
