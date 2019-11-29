package client;

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
