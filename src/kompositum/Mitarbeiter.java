/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kompositum;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author P01004090
 */
public abstract class Mitarbeiter {

    //Damit wir eine schöne Einrückung erhalten,
    //nutzen wir einen Stringparameter, der den Abstand enthält
    public abstract void print(String abstand);

    /*
     * Restlicher Code:
     */
    public abstract int getMitarbeiterAnzahl();

    private String name;
    private int telefonNr;

    //Konstruktor, in dem die Attribute gesetzt werden können
    public Mitarbeiter(String name, int telefonNr) {
        this.name = name;
        this.telefonNr = telefonNr;
    }

    //Getter und Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTelefonNr() {
        return telefonNr;
    }

    public void setTelefonNr(int telefonNr) {
        this.telefonNr = telefonNr;
    }

}
