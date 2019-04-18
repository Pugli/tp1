package Tournament;

import Competitors.Human;
import Competitors.Spartan;
import Competitors.Vikings;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import com.mysql.jdbc.Driver;

public class Tourney {
    private ArrayList<Vikings> vikings;
    private ArrayList<Spartan> spartan;
    private int quantityV;
    private int quantityS;

    public Tourney(ArrayList<Vikings> vikings, ArrayList<Spartan> spartan) {
        this.vikings = vikings;
        this.spartan = spartan;
    }

    @Override
    public String toString() {
        return "gane el equipo de los";
    }

    public void play() {
        for (Vikings v : this.vikings
        ) {
            while (v.getPee() > 0) {
                v.drinking();

                v.piss();

                this.quantityV = this.quantityV + v.getBeer();
            }
            System.out.println("cerveza vikinga tomada por "+v.getNombre()+" es de "+v.getBeer());
        }
        for (Spartan s : this.spartan
        ) {
            while (s.getPee() > 0) {
                s.drinking();

                s.piss();
                this.quantityS = this.quantityS + s.getBeer();
            }
            System.out.println("cerveza espartana tomada por "+s.getNombre()+" es de "+s.getBeer());
        }
        if (this.quantityV > this.quantityS) {
            this.persistance("Vikings",this.quantityV);
            System.out.println("ha ganado el equipo vikingo con un total de " + this.quantityV + " cervezas bebidas");
        } else {
            this.persistance("Spartan",this.quantityS);
            System.out.println("ha ganado el equipo espartano con un total de " + this.quantityS + " cervezas bebidas");
        }

    }

    public void playTwo(){
        int i= 0;
        int n= 0;
        Vikings v;
        Spartan s;

        while(!vikings.isEmpty() && !spartan.isEmpty()){
            i = (int) (Math.random() * (vikings.size()-1)) + 0;
            n = (int) (Math.random() * (spartan.size()-1)) + 0;
            v=vikings.get(i);
            s=spartan.get(n);
            while(v.getPee()>0 && s.getPee()>0){
                v.drinking();
                v.piss();
                this.quantityV = this.quantityV + v.getBeer();

                s.drinking();
                s.piss();
                this.quantityS = this.quantityS + s.getBeer();

            }
            System.out.println("cerveza vikinga tomada por "+v.getNombre()+" es de "+v.getBeer());
            System.out.println("cerveza espartana tomada por "+s.getNombre()+" es de "+s.getBeer());

            if(v.getPee() <= 0 && s.getPee()<=0 ){
                vikings.remove(v);
                spartan.remove(s);
            }
            else if(s.getPee()<=0){
                spartan.remove(s);
            }
            else {
                vikings.remove(v);
            }

        }
        if (vikings.isEmpty() && spartan.isEmpty()){
            System.out.println("es un empate!");
        }
        else if(vikings.isEmpty()){
            System.out.println("ganan los espartanos!");
        }
        else {
            System.out.println("ganan los vikingos!");
        }
    }
public void presentation(){
        this.compare(vikings);
        this.compare(spartan);
    System.out.println("Se presentan los participantes: \n Comenzando por los Vikingos! \n");
    for (Vikings v : this.vikings) {
        System.out.println(v.toString());

    }
    System.out.println("\n Ahora, se presentan los espartanos! :");
    for (Spartan s : this.spartan) {
        System.out.println(s.toString());

    }
    System.out.println("\n");
}
private void compare(ArrayList list){
    Collections.sort(list, new Comparator<Human>() {
        public int compare(Human obj1, Human obj2) {
            return new Integer(obj1.getEdad()).compareTo(new Integer(obj2.getEdad()));
        }
    });
}
public void persistance(String winner,int beer){
    Connection conexion = null;
    Statement sentencia;
    ResultSet resultado;

    try {
        Class.forName("com.mysql.jdbc.Driver");
    }
    catch (Exception e){
        System.out.println( "No se pudo cargar el puente JDBC-ODBC." );
        return;
    }
    try {
        // Se establece la conexión con la base de datos
        conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp1?autoReconnect=true&useSSL=false", "root", "");

        sentencia = conexion.createStatement();
        sentencia.execute("INSERT INTO winners (teamWin,totalBeer)\n" +
                "VALUES (\""+winner+"\","+beer+");");
    }catch (Exception e){
        System.out.println( e );
        return;

    }

}
}
