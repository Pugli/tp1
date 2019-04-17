package Implementations;

import Competitors.Human;
import Competitors.Vikings;
import Interfaces.Drink;

public class VikingDrinkImp implements Drink {
    public void drink(Human fighter) {
        int i=  (int) (Math.random() * 2) + 1;

        int professionalDrinker =  (int) (Math.random() * 2) + 1;

        i= i + professionalDrinker;
        fighter.setBeer(i);
    }
}
