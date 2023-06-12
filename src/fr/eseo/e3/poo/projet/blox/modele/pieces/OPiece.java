package fr.eseo.e3.poo.projet.blox.modele.pieces;

import fr.eseo.e3.poo.projet.blox.modele.Coordonnees;
import fr.eseo.e3.poo.projet.blox.modele.Couleur;
import fr.eseo.e3.poo.projet.blox.modele.Element;

import fr.eseo.e3.poo.projet.blox.modele.pieces.Piece;

import java.util.ArrayList;

public class OPiece extends Piece {

    public OPiece(Coordonnees coordonnees, Couleur couleur) {
        setElements(coordonnees, couleur);
    }

    public void tourner (boolean sensHoraire){
        if(sensHoraire){
            // tourne la piece dans le sens horaire

        } else {
            // tourne la piece dans le sens anti-horaire
        }
    }

    @Override
    protected void setElements(Coordonnees coordonnees, Couleur couleur) {
        getElements().clear();
        getElements().add(new Element(coordonnees, couleur));
        getElements().add(new Element(coordonnees.getAbscisse() + 1, coordonnees.getOrdonnee(), couleur));
        getElements().add(new Element(coordonnees.getAbscisse(), coordonnees.getOrdonnee() - 1, couleur));
        getElements().add(new Element(coordonnees.getAbscisse() + 1, coordonnees.getOrdonnee() - 1, couleur));
    }
}
