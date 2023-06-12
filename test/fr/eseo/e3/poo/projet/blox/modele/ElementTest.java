package fr.eseo.e3.poo.projet.blox.modele;


import fr.eseo.e3.poo.projet.blox.modele.Coordonnees;
import fr.eseo.e3.poo.projet.blox.modele.Couleur;
import fr.eseo.e3.poo.projet.blox.modele.Element;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class ElementTest {
    @Test
    public void testGetterCouleurElement() {
        Element element = new Element(new Coordonnees(15, 12), Couleur.ROUGE);
        Assertions.assertEquals(Couleur.ROUGE, element.getCouleur());
    }

    @Test
    public void testSetterCouleurElement() {
        Element element = new Element(new Coordonnees(15, 12), Couleur.ROUGE);
        element.setCouleur(Couleur.BLEU);
        Assertions.assertEquals(Couleur.BLEU, element.getCouleur());
    }

    @Test
    public void testGetterCoordonneesElement() {
        Element element = new Element(new Coordonnees(15, 12), Couleur.ROUGE);
        Assertions.assertEquals(new Coordonnees(15, 12), element.getCoordonnees());
    }

    @Test
    public void testSetterCoordonneesElement() {
        Element element = new Element(new Coordonnees(15, 12), Couleur.ROUGE);
        element.setCoordonnees(new Coordonnees(5, 5));
        Assertions.assertEquals(new Coordonnees(5, 5), element.getCoordonnees());
    }

    @Test
    public void testEquals() {
        Element element = new Element(new Coordonnees(15, 12), Couleur.ROUGE);
        Element element2 = new Element(new Coordonnees(15, 12), Couleur.ROUGE);
        Assertions.assertEquals(true, element.equals(element2));
    }

    @Test
    public void testdeplacerDe(){
        Element element = new Element(new Coordonnees(15, 12), Couleur.ROUGE);
        element.deplacerDe(1, 4);
        Element element2 = new Element(new Coordonnees(16, 16), Couleur.ROUGE);
        Assertions.assertEquals(element, element2, "Erreur");
    }

}
