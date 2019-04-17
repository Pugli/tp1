package Competitors;

import Interfaces.Drink;
import Interfaces.Urinate;

public class Spartan extends Human{

    public Spartan(String nombre, int edad, int peso, Urinate urinate, Drink drink) {
        super(nombre, edad, peso, urinate, drink);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
