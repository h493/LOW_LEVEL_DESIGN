package Design_Patterns.BehaviouralDesignPattern.MomentoDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCareTaker {

    List<ConfigurationMomento> history = new ArrayList<>();

    public void addMomento(ConfigurationMomento momento){
        history.add(momento);
    }

    public ConfigurationMomento undo(){
        if(!history.isEmpty()){
            int lastMomentoIndex = history.size() - 1;
            // get the last momento from the list
            ConfigurationMomento lastMomento = history.get(lastMomentoIndex);
            //remove the last momento from the list
            history.remove(lastMomentoIndex);

            return lastMomento;
        }
        return null;
    }
}
