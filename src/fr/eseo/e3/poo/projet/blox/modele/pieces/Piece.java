package fr.eseo.e3.poo.projet.blox.modele.pieces;

import java.util.ArrayList;
import java.util.List;
import fr.eseo.e3.poo.projet.blox.modele.Element;

import fr.eseo.e3.poo.projet.blox.modele.Coordonnees;
import fr.eseo.e3.poo.projet.blox.modele.Couleur;
import fr.eseo.e3.poo.projet.blox.modele.Puits;

public abstract class Piece {

    private List<Element> elements;

    private Puits puits;

    public Piece(Coordonnees coordonnees, Couleur couleur) {
        elements = new ArrayList<>();
        setElements(coordonnees, couleur);
    }

    public Piece() {
        elements = new ArrayList<>();
    }


    public List<Element> getElements() {
        return elements;
    }

    public void deplacerDe(int abscisse, int ordonnee) throws IllegalArgumentException {
        if(Math.abs(abscisse) > 1 || ordonnee < 0 || ordonnee > 1) throw new IllegalArgumentException("Les coordonnées ne peuvent pas être négatives");
        for (Element element : elements) {
            element.deplacerDe(abscisse, ordonnee);
        }
    }

    public void tourner (boolean sensHoraire){
        if(sensHoraire){
            // tourne la piece dans le sens horaire

        } else {
            // tourne la piece dans le sens anti-horaire
        }
    }

    protected abstract void setElements(Coordonnees coordonnees, Couleur couleur);

    public void setPosition(int abscisse, int ordonnee) {
        for (Element element : elements) {
            int nouvelleAbscisse = element.getCoordonnees().getAbscisse() + abscisse;
            int nouvelleOrdonnee = element.getCoordonnees().getOrdonnee() + ordonnee;
            element.getCoordonnees().setAbscisse(nouvelleAbscisse);
            element.getCoordonnees().setOrdonnee(nouvelleOrdonnee);
        }
    }

    public void setPuits(Puits puits) {
        	this.puits = puits;
    }

    public Puits getPuits() {
    	return puits;
    }

    @Override
    public String toString() {
        String s = this.getClass().getSimpleName() + " :\n";
        for (Element element : elements) {
            s += "\t("
                    + element.getCoordonnees().getAbscisse()
                    + ", "
                    + element.getCoordonnees().getOrdonnee()
                    + ") - "
                    + element.getCouleur()
                    + "\n";
        }
        return s;
    }


}
