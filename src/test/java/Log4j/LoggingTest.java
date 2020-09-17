package Log4j;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingTest {

    static Logger log = LogManager.getLogger(LoggingTest.class.getName());

    public static void main(String[] args) {

        log.info("This is info");
        log.error("This is error");
        log.fatal("This is fatal");
        log.debug("Debugging");
        log.warn("This is warning");
        log.trace("This is tracing");



    }


}
