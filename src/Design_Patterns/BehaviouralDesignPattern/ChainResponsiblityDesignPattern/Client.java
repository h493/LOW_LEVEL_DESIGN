package Design_Patterns.BehaviouralDesignPattern.ChainResponsiblityDesignPattern;

public class Client {

    public static void main(String[] args) {

        LogProcessor logger = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logger.log(LogProcessor.ERROR, "exception happened");
        logger.log(LogProcessor.INFO, "just for information");
        logger.log(LogProcessor.DEBUG , "need to debug this");
    }
}
