package fr.eseo.e3.poo.projet.blox.vue;

import fr.eseo.e3.poo.projet.blox.modele.Puits;
import fr.eseo.e3.poo.projet.blox.modele.UsineDePiece;
import fr.eseo.e3.poo.projet.blox.vue.VuePiece;
import fr.eseo.e3.poo.projet.blox.modele.pieces.Piece;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
import javax.swing.*;
import java.awt.*;

public class VuePuitsAffichageTest {

    //creer un main pour tester
    public static void main(String[] args) {
        VuePuitsAffichageTest vuePuitsAffichageTest = new VuePuitsAffichageTest();
        vuePuitsAffichageTest.testConstructeurPuits();
        vuePuitsAffichageTest.testConstructeurPuitsTaille();
    }
    private void testConstructeurPuits(){

        Piece piece = UsineDePiece.genererPiece();
        VuePiece vuePiece = new VuePiece(piece, 20);



        //Creer un JFrame
        JFrame fenetre = new JFrame();

        //mettre un titre à la fenetre
        fenetre.setTitle("Puits");

        //Creer un puits
        Puits puits = new Puits(10, 15);

        //Creer une vuePuits
        VuePuits vuePuits = new VuePuits(puits);
        //vuePuits.setVuePiece(vuePiece);

        //Mettre fenetre au centre de l'ecran
        fenetre.setLocationRelativeTo(null);

        //Ajouter la vuePuits au JFrame
        fenetre.add(vuePuits);

        //Afficher le JFrame
        fenetre.setVisible(true);
        fenetre.pack(); //Merci Marin VITRAI

        //Ajouter un bouton pour fermer le JFrame
        JButton bouton = new JButton("Fermer");

        //Fermer le JFrame
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void testConstructeurPuitsTaille(){

        Piece piece = UsineDePiece.genererPiece();
        VuePiece vuePiece = new VuePiece(piece, 20);

        //Creer un JFrame
        JFrame fenetre = new JFrame();

        //mettre un titre à la fenetre
        fenetre.setTitle("Puits et taille");

        //Creer un puits
        Puits puits = new Puits(5, 15);

        //Creer une vuePuits
        VuePuits vuePuits = new VuePuits(puits, 20);
        //vuePuits.setVuePiece(vuePiece);

        //Mettre fenetre au centre de l'ecran
        fenetre.setLocationRelativeTo(null);

        //Ajouter la vuePuits au JFrame
        fenetre.add(vuePuits);

        //Afficher le JFrame
        fenetre.setVisible(true);

        fenetre.pack(); //Merci Marin VITRAI

        //Ajouter un bouton pour fermer le JFrame
        JButton bouton = new JButton("Fermer");

        //Fermer le JFrame
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
