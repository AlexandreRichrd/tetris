package fr.eseo.e3.poo.projet.blox.modele;

import fr.eseo.e3.poo.projet.blox.modele.Couleur;
import fr.eseo.e3.poo.projet.blox.modele.Coordonnees;

import fr.eseo.e3.poo.projet.blox.modele.pieces.Piece;
import fr.eseo.e3.poo.projet.blox.modele.pieces.IPiece;
import fr.eseo.e3.poo.projet.blox.modele.pieces.OPiece;


import java.util.Random;
public class UsineDePiece {
    public static final int ALEATOIRE_COMPLET = 0;
    public static final int ALEATOIRE_PIECE = 1;
    public static final int CYCLIC = 2;
    public static final int NB_TYPE_PIECES = 2;

    private static int cptCyclic = 0;

    private static int mode;
    private UsineDePiece() {
    }

    public static void  setMode(int mode) {
        UsineDePiece.mode = mode;
    }

    public static Piece genererPiece(){
        Piece piece = null;
        switch (mode){
            case ALEATOIRE_COMPLET:
                piece = genererPieceAleatoireComplet();
                break;
            case ALEATOIRE_PIECE:
                piece = genererPieceAleatoirePiece();
                break;
            case CYCLIC:
                piece = genererPieceCyclic();
                break;
            default:
                break;
        }
        return piece;
    }

    private static Piece genererPieceAleatoireComplet(){
        Piece piece = null;
        int random = new Random().nextInt(NB_TYPE_PIECES);
        switch (random){
            case 0:
                piece = new OPiece(new Coordonnees(2,3), Couleur.values()[new Random().nextInt(Couleur.values().length)]);
                break;
            case 1:
                piece = new IPiece(new Coordonnees(2,3), Couleur.values()[new Random().nextInt(Couleur.values().length)]);
                break;
            default:
                break;
        }
        return piece;
    }

    private static Piece genererPieceAleatoirePiece(){
        Piece piece = null;
        int random = new Random().nextInt(NB_TYPE_PIECES);
        switch (random){
            case 0:
                piece = new IPiece(new Coordonnees(2,3), Couleur.ORANGE);
                break;
            case 1:
                piece = new OPiece(new Coordonnees(2,3), Couleur.ROUGE);
                break;
            default:
                break;
        }
        return piece;
    }

    private static Piece genererPieceCyclic(){
        Piece piece = null;
        switch (cptCyclic){
            case 0:
                piece = new OPiece(new Coordonnees(2,3), Couleur.ROUGE);
                cptCyclic++;
                break;
            case 1:
                piece = new IPiece(new Coordonnees(2,3), Couleur.ORANGE);
                cptCyclic = 0;
                break;
            default:
                break;
        }
        return  piece;
    }

}
