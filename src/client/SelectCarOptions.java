package client;

import adapter.BuildAuto;
import model.*;
import java.util.*;

public class SelectCarOptions {

    ////////// PROPERTIES //////////
    private Scanner in = new Scanner(System.in);
    boolean DEBUG = true;

    ////////// CONSTRUCTORS //////////

    public SelectCarOptions() {

    }

    ////////// INSTANCE METHODS //////////

    public void configureAuto(Object obj) {
        //added
        if (DEBUG) {
            System.out.println("Configuring Auto");
        }
        Automotive auto;
        BuildAuto builtAuto = new BuildAuto();
        auto = (Automotive) obj;
        builtAuto.selectChoices(auto.getName());
        builtAuto.printChoices(auto.getName());
        //added
        if (DEBUG) {
            System.out.println("Done Configuring Auto");
        }

    }

    public boolean isAutomotive(Object obj) {

        boolean isAutomotive = false;

        try {
            //added
            if (DEBUG) {
                System.out.println("isAuto was called. Checking if Auto");
            }
            Automotive a1 = (Automotive) obj;
            isAutomotive = true;

        }
        catch (ClassCastException e) {
            isAutomotive = false;
        }
        //added
        if (DEBUG) {
            System.out.println("Done checking, isAuto is " + isAutomotive);
        }

        return isAutomotive;
    }

}
