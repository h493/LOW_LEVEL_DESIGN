package Design_Patterns.BehaviouralDesignPattern.MomentoDesignPattern;

public class ConfigurationOriginator {
    int height;
    int width;

    public ConfigurationOriginator(int height, int width){
        this.height = height;
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public ConfigurationMomento createMomento(){
        return new ConfigurationMomento(height, width);
    }

    public void restoreMomento(ConfigurationMomento momentoToBeRestored){
        this.width = momentoToBeRestored.width;
        this.height = momentoToBeRestored.height;
    }
}
