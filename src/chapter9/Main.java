package chapter9;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();

        logger.log("infomation #1");
        logger.start();

        logger.log("infomation #2");
        logger.start();

        logger.log("infomation #3");
        logger.stop();

        logger.log("infomation #4");
        logger.stop();

        logger.log("infomation #5");
    }
}
