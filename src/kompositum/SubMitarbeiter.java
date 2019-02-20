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
public class SubMitarbeiter extends Subunternehmer{

    public SubMitarbeiter(String name, String abteilung, int telefonNr) {
        super(name, abteilung, telefonNr);
    }
    
    @Override
    public void print(String abstand) {
        System.out.println(abstand + getName() + ". Tel: " + getTelefonNr());
    }
}
