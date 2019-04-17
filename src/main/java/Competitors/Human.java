package Competitors;

import Interfaces.Drink;
import Interfaces.Urinate;

public class Human {
    private String nombre;
    private int edad;
    private int peso;
    private Urinate urinate;
    private Drink drink;
    private int beer = 0;
    private int pee = 100;

    public Human(String nombre, int edad, int peso, Urinate urinate, Drink drink) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.urinate = urinate;
        this.drink = drink;
    }

    public void setBeer(int beer) {

        this.beer = this.beer + beer;
    }

    public void setPee(int pee) {
        this.pee = this.pee - pee;
    }

    public int getBeer() {
        return beer;
    }

    public int getPee() {
        return pee;
    }

    public void drinking(){
        this.drink.drink(this);
    }
    public void piss(){
        this.urinate.urinate(this);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return
                "Mi nombre es "+nombre+
                        " tengo "+edad+
                        " años y peso "+peso+
                        " kilos.";
    }
}

