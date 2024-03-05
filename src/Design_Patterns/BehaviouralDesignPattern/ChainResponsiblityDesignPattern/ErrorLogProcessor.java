package Design_Patterns.BehaviouralDesignPattern.ChainResponsiblityDesignPattern;

public class ErrorLogProcessor extends LogProcessor{
    ErrorLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(int loglevel, String message){

        if(loglevel == ERROR){
            System.out.println("ERROR: " + message);
        }else{
            super.log(loglevel, message);
        }
    }
}
