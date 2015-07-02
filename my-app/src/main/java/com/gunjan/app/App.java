package com.gunjan.app;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class App 
{
	 private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main( String[] args )
    {
        System.out.println( "Hello loggers!" );
        
        logger.trace("Hello Humans!");
    	
    	String name = "Gunjan";
    	logger.debug("Ay, {}", name);
    	logger.info("EHhhhhh.");
    	logger.warn("GO AWAY.");
    	logger.error("I don't like you.");
    	
    }
}
