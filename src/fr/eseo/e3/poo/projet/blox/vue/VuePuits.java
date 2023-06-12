package fr.eseo.e3.poo.projet.blox.vue;

import fr.eseo.e3.poo.projet.blox.modele.Puits;
import fr.eseo.e3.poo.projet.blox.modele.pieces.Piece;
import fr.eseo.e3.poo.projet.blox.vue.VuePiece;

import java.beans.PropertyChangeListener;

import javax.swing.*;
import java.awt.*;

public class VuePuits extends JPanel implements PropertyChangeListener{
    public static final int TAILLE_PAR_DEFAUT = 15;

    private int taille;

    private Puits puits;

    public VuePuits(Puits puits) {
        this(puits, TAILLE_PAR_DEFAUT);
    }

    private VuePiece vuePiece;

    public VuePuits(Puits puits, int taille) {
        this.setTaille(taille);
        this.setPuits(puits);
        super.setBackground(Color.WHITE);
        this.vuePiece = null;
    }

    public Puits getPuits() {
        return puits;
    }

    public void setPuits(Puits puits) {
        if(puits == null){
            setPreferredSize(new Dimension(getTaille(), getTaille()));
        }else{
            setPreferredSize(new Dimension(puits.getLargeur() * getTaille(), puits.getProfondeur() * getTaille()));
            this.puits = puits;
            this.getPuits().addPropertyChangeListener(this);
        }
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
        if(puits == null){
            setPreferredSize(new Dimension(getTaille(), getTaille()));
        }else{
            setPreferredSize(new Dimension(this.getPuits().getLargeur() * getTaille(), this.getPuits().getProfondeur() * getTaille()));
        }
    }


    public VuePiece getVuePiece() {
        return vuePiece;
    }



    private void setVuePiece(VuePiece vuePiece) {
        this.vuePiece = vuePiece;
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        /*Le paramètre g est copie en utilisant la méthode copie()
         * puis converti en instance de Graphics2D grâce à
         * un transtypage (cast) explicite.
         */

        Graphics2D g2D = (Graphics2D)g.create();
        g2D.setColor(Color.LIGHT_GRAY);
        /*Nous utiliserons l'instance de Graphics2D pour creer des carreaux*/



        for(int i = 0; i <= this.getWidth(); i+=getTaille()){
            for(int j = 0; j <= this.getHeight(); j+=getTaille()){
                g2D.drawRect(i, j, getTaille(), getTaille());
            }
        }
        if(vuePiece != null) {
            vuePiece.afficherPiece(g2D);
        }

        /*Puis nous libérons la mémoire*/

        g2D.dispose();


    }

    public void propertyChange(java.beans.PropertyChangeEvent event) {

        if(event.getPropertyName().equals(Puits.MODIFICATION_PIECE_ACTUELLE)){
            setVuePiece(new VuePiece((Piece)event.getNewValue(), this.getTaille()));
        }
    }
}
