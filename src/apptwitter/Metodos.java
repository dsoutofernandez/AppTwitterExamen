/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apptwitter;

import java.util.List;
import twitter4j.DirectMessage;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;
/**
 *
 * @author dsoutofernandez
 */
public class Metodos {
    
    Twitter twitter;
    private Object sender;
    
    /**
     * Generamos constructor por defecto
     * Recibe los parametros necesarios para utilizar una cuenta
     */
    public Metodos(){
    ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
        .setOAuthConsumerKey("5yqwH2WcqZ3YlkE0W8BLYkeoW")
        .setOAuthConsumerSecret("s5s5QGigqzULDGbbQs4Rm0pKdqLEefbO4gCh53XgcnA0RoMA9n")
        .setOAuthAccessToken("3055143533-jeaPEtFscvDMVKwPVLubxkmHs9DzCjZ2eIoWdcQ")
        .setOAuthAccessTokenSecret("NzIM687NlVRe3VxKh0a0xRRYpsGytrSEKISaqpuQGtTZL");

   twitter = new TwitterFactory(cb.build()).getInstance();
    }
    /**
     * Metodo que permite ver el Time Line de Twitter
     * @throws TwitterException 
     */
    public void verTimeLine() throws TwitterException{
    
        List<Status> statuses = twitter.getHomeTimeline();
    System.out.println("Mostrando tu Time Line:");
    for (Status status : statuses) {
        System.out.println(status.getUser().getName() + ":" +
                           status.getText());
    }
    
    }
    /**
     * Meotodo que permite buscar de lo que se está "hablando".
     * Busqueda de topics
     * @param busqueda
     * @throws TwitterException 
     */
    public void buscarTrending(String busqueda) throws TwitterException{
        
         Query query = new Query(busqueda);
    QueryResult result = twitter.search(query);
    for (Status status : result.getTweets()) {
        System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
    }

    }
    /**
     * Metodo que permite al usuario twittear o publicar un tweet
     * @param tweet
     * @throws TwitterException 
     */
    public void tweetear(String tweet) throws TwitterException{
        
    Status status = twitter.updateStatus(tweet);
    System.out.println("Has tweeteado correctamente :D!! ) [" + status.getText() + "].");
    
    }
}
