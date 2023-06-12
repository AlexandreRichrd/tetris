package fr.eseo.e3.poo.projet.blox.vue;

import fr.eseo.e3.poo.projet.blox.modele.Element;
import fr.eseo.e3.poo.projet.blox.modele.pieces.Piece;

import java.awt.*;
import java.util.List;

public class VuePiece {
    public static final double MULTIPLIER_TEINTE = 0.8;

    private final int taille;

    private final Piece piece;

    public VuePiece(Piece piece, int taille) {
        this.piece = piece;
        this.taille = taille;
    }

    public Piece getPiece() {
        return this.piece;
    }


    public int getTaille() {
        return this.taille;
    }

    public Color teinte(Color couleur){
        return new Color((int)(couleur.getRed() + (255 - couleur.getRed()) * MULTIPLIER_TEINTE),
                (int)(couleur.getGreen() + (255 - couleur.getGreen()) * MULTIPLIER_TEINTE),
                (int)(couleur.getBlue() + (255 - couleur.getBlue()) * MULTIPLIER_TEINTE));
    }

    public void afficherPiece(Graphics2D graphics2D){
        List<Element> elements = this.piece.getElements();
        for (Element element : elements) {
            //on verifie si c'est le premier element


            if(element == elements.get(0)){
                graphics2D.setColor(teinte(element.getCouleur().getCouleurPourAffichage()));
            }else{
                graphics2D.setColor(element.getCouleur().getCouleurPourAffichage());
            }
            graphics2D.fill3DRect(element.getCoordonnees().getAbscisse() * this.taille, element.getCoordonnees().getOrdonnee() * this.taille, this.taille, this.taille, true);
        }
    }




}
