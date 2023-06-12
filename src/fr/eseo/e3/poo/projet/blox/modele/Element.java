package fr.eseo.e3.poo.projet.blox.modele;

import fr.eseo.e3.poo.projet.blox.modele.Coordonnees;
import fr.eseo.e3.poo.projet.blox.modele.Couleur;

import java.util.Objects;

public class Element {
    private Coordonnees coordonnees;
    private Couleur couleur;
    public Element(Coordonnees coordonnees){

        setCoordonnees(coordonnees);
        setCouleur(Couleur.ROUGE);
    }

    public Element(int abscisse, int ordonnee){
        setCoordonnees(new Coordonnees(abscisse, ordonnee));
        setCouleur(Couleur.ROUGE);
    }

    public Element(Coordonnees coordonnees, Couleur couleur){
        setCoordonnees(coordonnees);
        setCouleur(couleur);
    }

    public Element(int abscisse, int ordonnee, Couleur couleur){
        setCoordonnees(new Coordonnees(abscisse, ordonnee));
        setCouleur(couleur);
    }

    public Coordonnees getCoordonnees() {
        return coordonnees;
    }

    public void setCoordonnees(Coordonnees coordonnees) {
        this.coordonnees = coordonnees;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    public void deplacerDe(int abscisse, int ordonnee) {
        this.getCoordonnees().setAbscisse(this.getCoordonnees().getAbscisse() + abscisse);
        this.getCoordonnees().setOrdonnee(this.getCoordonnees().getOrdonnee() + ordonnee);
    }

    @Override
    public String toString() {
        return "(" + getCoordonnees().getAbscisse() + ", " + getCoordonnees().getOrdonnee() + ") - " + getCouleur();
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }
        Element element = (Element) object;
        return (this.coordonnees.equals(element.getCoordonnees()) && this.couleur == element.getCouleur());
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordonnees, couleur);
    }
}
