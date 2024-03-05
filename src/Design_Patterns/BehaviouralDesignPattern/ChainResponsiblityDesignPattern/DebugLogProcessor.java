package Design_Patterns.BehaviouralDesignPattern.ChainResponsiblityDesignPattern;

public class DebugLogProcessor extends LogProcessor{
    DebugLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(int loglevel, String message){

        if(loglevel == DEBUG){
            System.out.println("DEBUG: " + message);
        }else{
            super.log(loglevel, message);
        }
    }
}
