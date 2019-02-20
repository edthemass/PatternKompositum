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
public class Kompositum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Subunternhmer
        SubAbteilungsleiter subcheff = new SubAbteilungsleiter("K. Kittel", "Fa. Asbestbeseitigung", 077);
        subcheff.add(new SubMitarbeiter("p. Klausen", "Putzmann", 1212));
        subcheff.add(new SubMitarbeiter("T. Klotz", "Stemmarbeiten", 233));
        subcheff.add(new SubMitarbeiter("F. Rad", "Fahrer", 2323));
        
        // Hausmeister
        Abteilungsleiter hausmeister = new Abteilungsleiter("N. Kohl", "Hausmeister", 112);
        hausmeister.add(subcheff);
        
        // Vertrieb
        Abteilungsleiter al1 = new Abteilungsleiter("W. Fischer", "Vertrieb", 001);
        al1.add(new AtomarMitarbeiter("P. Meier", 123));
        al1.add(new AtomarMitarbeiter("I. Schulz", 112));
        al1.add(hausmeister);
        //Technologie
        Abteilungsleiter al2 = new Abteilungsleiter("T. Kunz", "Technologie", 002);
        al2.add(new AtomarMitarbeiter("M. Rehberg", 223));
        al2.add(new AtomarMitarbeiter("O. Riedel", 212));
        //Entwicklung
        Abteilungsleiter al3 = new Abteilungsleiter("M. Hardbrot", "Entwicklung", 003);
        al3.add(new AtomarMitarbeiter("M. Rehberg", 323));
        al3.add(al2);
        
        //Vorstand
        Abteilungsleiter vorstand = new Abteilungsleiter("A. Müller", "Vorstand", 004);
        vorstand.add(al1);
        vorstand.add(new AtomarMitarbeiter("U. Temann", 442));
        vorstand.add(al3);
        
        
        //vorstand.add(hausmeister);
        System.err.println("Anz. Arbeiter: " + (vorstand.getMitarbeiterAnzahl() - subcheff.getMitarbeiterAnzahl()));
        System.err.println("Anz. Sub only " + subcheff.getMitarbeiterAnzahl());

        vorstand.print("");
    }

}
