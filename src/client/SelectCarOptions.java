package client;

import adapter.BuildAuto;
import model.*;
import java.util.*;

public class SelectCarOptions {

    ////////// PROPERTIES //////////
    private Scanner in = new Scanner(System.in);

    ////////// CONSTRUCTORS //////////

    public SelectCarOptions() {

    }

    ////////// INSTANCE METHODS //////////

    public void configureAuto(Object obj) {
        Automotive auto;
        BuildAuto builtAuto = new BuildAuto();
        if (isAutomotive(obj)) {
            auto = (Automotive) obj;
            builtAuto.selectChoices(auto.getName());
        }

    }

    public boolean isAutomotive(Object obj) {
        boolean isAutomotive = false;

        try {
            Automotive a1 = (Automotive) obj;
            isAutomotive = true;
        }
        catch (ClassCastException e) {
            isAutomotive = false;
        }

        return isAutomotive;
    }

}
