package fr.eseo.e3.poo.projet.blox.modele.pieces;

import fr.eseo.e3.poo.projet.blox.modele.pieces.Piece;


import fr.eseo.e3.poo.projet.blox.modele.Coordonnees;
import fr.eseo.e3.poo.projet.blox.modele.Couleur;
import fr.eseo.e3.poo.projet.blox.modele.Element;

public class IPiece extends Piece {

        public IPiece(Coordonnees coordonnees, Couleur couleur) {
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
            getElements().add(new Element(coordonnees.getAbscisse(), coordonnees.getOrdonnee(), couleur));
            getElements().add(new Element(coordonnees.getAbscisse(), coordonnees.getOrdonnee() - 1, couleur));
            getElements().add(new Element(coordonnees.getAbscisse(), coordonnees.getOrdonnee() - 2, couleur));
            getElements().add(new Element(coordonnees.getAbscisse(), coordonnees.getOrdonnee() + 1, couleur));
        }

}
