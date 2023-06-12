package fr.eseo.e3.poo.projet.blox.modele;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import fr.eseo.e3.poo.projet.blox.modele.Coordonnees;


public class CoordonneesTest {

    @Test
    public void testGetterAbscisseCoordonnees() {
        Coordonnees coordonnees = new Coordonnees(15, 12);
        Assertions.assertEquals(15, coordonnees.getAbscisse());
    }

    @Test
    public void testSetterAbscisseCoordonnees() {
        Coordonnees coordonnees = new Coordonnees(15, 12);
        coordonnees.setAbscisse(5);
        Assertions.assertEquals(5, coordonnees.getAbscisse());
    }

    @Test
    public void testGetterOrdonneesCoordonnees() {
        Coordonnees coordonnees = new Coordonnees(15, 12);
        Assertions.assertEquals(12, coordonnees.getOrdonnee());
    }

    @Test
    public void testSetterOrdonneeCoordonnees() {
        Coordonnees coordonnees = new Coordonnees(15, 12);
        coordonnees.setOrdonnee(5);
        Assertions.assertEquals(5, coordonnees.getOrdonnee());
    }


    @Test
    public void testEquals(){
        Coordonnees coordonnees = new Coordonnees(15, 12);
        Coordonnees coordonnees2 = new Coordonnees(15, 12);
        Assertions.assertEquals(true, coordonnees.equals(coordonnees2));
    }

    // @org.junit.Test
    // public getterOrdonneesCoordonneesTest() {
    //     Coordonnees coordonnees = new Coordonnees(15, 12);
    //     assertEquals(5, coordonnees.getOrdonnee());
    // }

    // @org.junit.Test
    // public setterAbscisseCoordonneesTest() {
    //     Coordonnees coordonnees = new Coordonnees(15, 12);
    //     coordonnees.setAbscisse(5);
    //     assertEquals(5, coordonnees.getAbscisse());
    // }

    // @org.junit.Test
    // public setterOrdonneeCoordonneesTest() {
    //     Coordonnees coordonnees = new Coordonnees(15, 12);
    //     coordonnees.setOrdonnee(5);
    //     assertEquals(5, coordonnees.getOrdonnee());
    // }

    // @org.junit.Test
    // public toStringCoordonneesTest() {
    //     Coordonnees coordonnees = new Coordonnees(15, 12);
    //     assertEquals("( 15, 12)", coordonnees.toString());
    // }
}
