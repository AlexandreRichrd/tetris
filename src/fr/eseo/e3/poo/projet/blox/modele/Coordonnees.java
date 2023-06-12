package fr.eseo.e3.poo.projet.blox.modele;

import java.util.Objects;

public class Coordonnees {
    private int abscisse;
    private int ordonnee;

    public Coordonnees(int abscisse, int ordonnee) {
        setAbscisse(abscisse);;
        setOrdonnee(ordonnee);
    }

    public int getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(int abscisse) {
        this.abscisse = abscisse;
    }

    public int getOrdonnee() {
        return ordonnee;
    }

    public void setOrdonnee(int ordonnee) {
        this.ordonnee = ordonnee;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }
        Coordonnees coordonnees = (Coordonnees) object;
        return (this.abscisse == coordonnees.getAbscisse() && this.ordonnee == coordonnees.getOrdonnee());
    }

    @Override
    public int hashCode() {
        return Objects.hash(abscisse, ordonnee);
    }

    @Override
    public String toString() {
        return "(" + abscisse + ", " + ordonnee + ")";
    }
}