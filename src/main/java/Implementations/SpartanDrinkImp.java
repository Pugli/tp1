package Implementations;

import Competitors.Human;
import Interfaces.Drink;
import Interfaces.Urinate;

public class SpartanDrinkImp implements Drink {
    public void drink(Human fighter) {
        int i=  (int) (Math.random() * 2) + 1;
        fighter.setBeer(i);
    }
}
