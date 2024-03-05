package Design_Patterns.BehaviouralDesignPattern.ChainResponsiblityDesignPattern;

public class InfoLogProcessor extends LogProcessor{
    InfoLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(int logLevel, String message){

        if(logLevel == INFO){
            System.out.println("INFO: "+ message);
        }else{
            super.log(logLevel, message);
        }
    }
}
