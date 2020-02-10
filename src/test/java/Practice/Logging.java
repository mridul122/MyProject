package Practice;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logging {

   // private static Logger logger= LogManager.getLogger(Logging.class.getName());
    public static void main(String[] args) {
        //BasicConfigurator.configure();
        //BasicConfigurator

//        logger.debug("debug");
//        logger.info("info");
//        logger.error("error");
//        logger.fatal("fatal");
//        logger.warn("warn");
//        logger.trace("trace");

        Logger logger=Logger.getLogger("Logging");
        PropertyConfigurator.configure("Log4j.properties");
        logger.debug("debug");
        logger.info("info");
        logger.error("error");
        logger.fatal("fatal");
        logger.warn("warn");
        logger.trace("trace");



    }
}
