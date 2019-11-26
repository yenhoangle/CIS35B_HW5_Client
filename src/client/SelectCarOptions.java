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

    public boolean isAutomobile(Object obj) {
        boolean isAutomobile = false;

        try {
            Automotive a1 = (Automotive) obj;
            isAutomobile = true;
        }
        catch (ClassCastException e) {
            isAutomobile = false;
        }

        return isAutomobile;
    }

}
