
import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

/**
 * <h1>Just a javadoc test!</h1>
 * The AddNum program implements an application that
 * simply adds two given integer numbers and Prints
 * the output on the screen.
 * <p>
 * <b>Note:</b> Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 *
 * @author  Laszlo Bezi
 * @version 1.0
 * @since   2017-05-24
 */

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);


    /**
     * This method is used to add two integers. This is
     * a the simplest form of a class method, just to
     * show the usage of various javadoc Tags.
     */
    public static void main(String args[]){
        ArrayList<> s = new ArrayList();
        BasicConfigurator.configure();
        logger.info("I am informative!");
        logger.warn("I am a warning!");

    }
}
