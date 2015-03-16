/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apptwitter;

import javax.swing.JOptionPane;
import twitter4j.TwitterException;


/**
 *
 * @author dsoutofernandez
 */
public class AppTwitter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TwitterException {
        // TODO code application logic here
        
        //Creamos variables de texto que usaremos para completar
        String busqueda,tweet;
        //Creamos objeto de tipo Metodos con el que acceder a los metodos
        Metodos obj1 = new Metodos();
        
        //LLamamos a los metodos
        obj1.verTimeLine();
        busqueda  =JOptionPane.showInputDialog("Introduce lo que deseas buscar:");
                
        obj1.buscarTrending(busqueda);
        
        tweet = JOptionPane.showInputDialog("Introduce un tweet:");
        
        obj1.tweetear(tweet);
        
        
    }
    
}
