/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kompositum;

/**
 *
 * @author P01004090
 */
public class AtomarMitarbeiter extends Mitarbeiter {

    //Hinweis: der Stringparameter dient lediglich der Einrückung
    @Override
    public void print(String abstand) {
        System.out.println(abstand + getName() + ". Tel: " + getTelefonNr());
    }

    //Konstruktor
    public AtomarMitarbeiter(String name, int telefonNr) {
        super(name, telefonNr);
    }

    //der Rest ist bekannt
    @Override
    public int getMitarbeiterAnzahl() {
        return 1;
    }

}
