package bug_4;


import javax.swing.*;

public class StrangeBehavior {
    private static StrangeBehavior instanse;

    private StrangeBehavior() {
    }

    public static StrangeBehavior getInstanse() {
        if (instanse == null) {
            instanse = new StrangeBehavior();
        }
        return instanse;
    }

    private StrangeBehavior strangeBehavior = instanse;


    public static void main(String[] args) {
        new StrangeBehavior();
    }
}

