package Implementations;

import Competitors.Human;
import Interfaces.Urinate;

public class SpartanUrinateImp implements Urinate {
    public void urinate(Human fighter) {
        int i=  (int) (Math.random() * 50) + 25;
        int extraTolerance = (int) (Math.random() * 35) + 1;
        i = i - extraTolerance;
        fighter.setPee(i);
    }
}

