/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apptwitter;

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
    
    
    
    
}
