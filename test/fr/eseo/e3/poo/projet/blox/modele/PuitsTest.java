package fr.eseo.e3.poo.projet.blox.modele;

import fr.eseo.e3.poo.projet.blox.modele.Puits;
import fr.eseo.e3.poo.projet.blox.modele.Coordonnees;
import fr.eseo.e3.poo.projet.blox.modele.Couleur;
import fr.eseo.e3.poo.projet.blox.modele.pieces.Piece;
import fr.eseo.e3.poo.projet.blox.modele.pieces.IPiece;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class PuitsTest {
    @Test
    public void testCreationPuitsParDefaut() {
        try {
            Puits puits = new Puits();
            Assertions.assertEquals(Puits.LARGEUR_PAR_DEFAUT, puits.getLargeur());
            Assertions.assertEquals(Puits.PROFONDEUR_PAR_DEFAUT, puits.getProfondeur());
            Assertions.assertNull(puits.getPieceActuelle());
            Assertions.assertNull(puits.getPieceSuivante());
        } catch (Exception e) {
            Assertions.fail("Une exception ne devrait pas être lancée ici : " + e.getMessage());
        }
    }

    @Test
    public void testCreationPuitsParametresPerso() {
        try {
            int largeur = 8;
            int profondeur = 20;
            Puits puits = new Puits(largeur, profondeur);
            Assertions.assertEquals(largeur, puits.getLargeur());
            Assertions.assertEquals(profondeur, puits.getProfondeur());
            Assertions.assertNull(puits.getPieceActuelle());
            Assertions.assertNull(puits.getPieceSuivante());
        } catch (Exception e) {
            Assertions.fail("Une exception ne devrait pas être lancée ici : " + e.getMessage());
        }
    }

    @Test
    public void testModificationLargeurPuits() {
        try {
            Puits puits = new Puits();
            int nouvelleLargeur = 10;
            puits.setLargeur(nouvelleLargeur);
            Assertions.assertEquals(nouvelleLargeur, puits.getLargeur());
        } catch (Exception e) {
            Assertions.fail("Une exception ne devrait pas être lancée ici : " + e.getMessage());
        }
    }

    @Test
    public void testModificationProfondeurPuits() {
        try {
            Puits puits = new Puits();
            int nouvelleProfondeur = 20;
            puits.setProfondeur(nouvelleProfondeur);
            Assertions.assertEquals(nouvelleProfondeur, puits.getProfondeur());
        } catch (Exception e) {
            Assertions.fail("Une exception ne devrait pas être lancée ici : " + e.getMessage());
        }
    }

}
