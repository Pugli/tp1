package Implementations;

import Competitors.Human;
import Interfaces.Urinate;

public class VikingUrinateImp implements Urinate {

    public void urinate(Human fighter) {
        int i=  (int) (Math.random() * 50) + 25;
        fighter.setPee(i);
    }
}
