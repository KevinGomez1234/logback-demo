package co.kevingomez;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    final static Logger LOGGER = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
        LOGGER.info("Hi");
        System.out.println( "Hello World!" );

    }
}
