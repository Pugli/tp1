package Tournament;

import Competitors.Human;
import Competitors.Spartan;
import Competitors.Vikings;
import Implementations.SpartanDrinkImp;
import Implementations.SpartanUrinateImp;
import Implementations.VikingDrinkImp;
import Implementations.VikingUrinateImp;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Vikings n = new Vikings("pepe",31,90,new VikingUrinateImp(),new VikingDrinkImp());
        Vikings n2 = new Vikings("august",33,60,new VikingUrinateImp(),new VikingDrinkImp());
        Vikings n3 = new Vikings("silver",24,73,new VikingUrinateImp(),new VikingDrinkImp());
        Vikings n4 = new Vikings("gray",16,59,new VikingUrinateImp(),new VikingDrinkImp());
        Vikings n5 = new Vikings("natsu",17,67,new VikingUrinateImp(),new VikingDrinkImp());


      ArrayList<Vikings> arrayV = new ArrayList<Vikings>();
        arrayV.add(n);
        arrayV.add(n2);
        arrayV.add(n3);
        arrayV.add(n4);
        arrayV.add(n5);





        Spartan s = new Spartan("alexis",19,90,new SpartanUrinateImp(),new SpartanDrinkImp());
        Spartan s2 = new Spartan("german",28,71,new SpartanUrinateImp(),new SpartanDrinkImp());
        Spartan s3= new Spartan("arian",49,76,new SpartanUrinateImp(),new SpartanDrinkImp());
        Spartan s4 = new Spartan("exequiel",55,50,new SpartanUrinateImp(),new SpartanDrinkImp());
        Spartan s5= new Spartan("papadopuolos",90,100,new SpartanUrinateImp(),new SpartanDrinkImp());



        ArrayList<Spartan> arrayS = new ArrayList<Spartan>();
        arrayS.add(s);
        arrayS.add(s2);
        arrayS.add(s3);
        arrayS.add(s4);
        arrayS.add(s5);

        Tourney t = new Tourney(arrayV,arrayS);
        t.presentation();
        t.play();


    }
}
