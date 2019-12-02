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
        Automotive auto;
        auto = (Automotive) obj;
        //added

        if (DEBUG) {
            System.out.println("Configuring Auto: " + auto.getName());
            auto.print();
        }

        auto.selectChoices();
        auto.getTotalPrice();
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
