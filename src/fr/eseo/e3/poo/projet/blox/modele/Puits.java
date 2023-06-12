package fr.eseo.e3.poo.projet.blox.modele;

import fr.eseo.e3.poo.projet.blox.modele.pieces.Piece;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;


public class Puits {
    public static final int LARGEUR_PAR_DEFAUT = 5;
    public static final int PROFONDEUR_PAR_DEFAUT = 15;

    public static final String MODIFICATION_PIECE_ACTUELLE = "modificationPieceActuelle";

    public static final String MODIFICATION_PIECE_SUIVANTE = "modificationPieceSuivante";

    private int largeur;
    private int profondeur;
    private Piece pieceActuelle;
    private Piece pieceSuivante;

    private PropertyChangeSupport pcs;



    public Puits() throws Exception {
        this(LARGEUR_PAR_DEFAUT, PROFONDEUR_PAR_DEFAUT);
    }

    public Puits(int largeur, int profondeur) {
        setLargeur(largeur);
        setProfondeur(profondeur);
        this.pcs = new PropertyChangeSupport(this);
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) throws IllegalArgumentException {
        if (largeur < 5 || largeur > 15) {
            throw new IllegalArgumentException("La largeur du puit doit être comprise entre 5 et 15");
        }
        this.largeur = largeur;
    }

    public int getProfondeur() {
        return profondeur;
    }

    public void setProfondeur(int profondeur) throws IllegalArgumentException {
        if (profondeur < 15 || profondeur > 25) {
            throw new IllegalArgumentException("La profondeur du puit doit être comprise entre 15 et 25");
        }
        this.profondeur = profondeur;
    }

    public Piece getPieceActuelle() {
        return pieceActuelle;
    }

    public Piece getPieceSuivante() {
        return pieceSuivante;
    }

    public void setPieceSuivante(Piece pieceSuivante) {
        if(this.pieceSuivante != null) {
          this.pieceActuelle = this.pieceSuivante;
          this.pieceActuelle.setPosition(this.getLargeur() / 2, -4);
          //this.getPieceActuelle().setPuits(this);
          this.pcs.firePropertyChange(MODIFICATION_PIECE_ACTUELLE, null, this.pieceActuelle);

        }
        this.pieceSuivante = pieceSuivante;
        //this.pieceSuivante.setPuits(this);
        this.pcs.firePropertyChange(MODIFICATION_PIECE_SUIVANTE, null, this.pieceSuivante);
    }



    @Override
    public String toString() {
        String s = "Puits : Dimension " + getLargeur() + " x " + getProfondeur() + "\n";
        s += "Piece Actuelle : " + ((getPieceActuelle() != null) ? getPieceActuelle().toString() : "<aucune>\n");
        s += "Piece Suivante : " + ((getPieceSuivante() != null) ? getPieceSuivante().toString() : "<aucune>\n");

        return s;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.addPropertyChangeListener(listener);

    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.removePropertyChangeListener(listener);
    }

}
