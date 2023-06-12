package fr.eseo.e3.poo.projet.blox.modele;

import fr.eseo.e3.poo.projet.blox.modele.pieces.Piece;
import fr.eseo.e3.poo.projet.blox.modele.UsineDePiece;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class UsineDePieceTest {
    @Test
    public void testGenererPieceAleatoireComplet() {
        UsineDePiece.setMode(UsineDePiece.ALEATOIRE_COMPLET);
        Piece piece = UsineDePiece.genererPiece();
        Assertions.assertNotNull(piece);
        Assertions.assertTrue(piece instanceof Piece);
    }

    @Test
    public void testGenererPieceAleatoirePiece() {
        UsineDePiece.setMode(UsineDePiece.ALEATOIRE_PIECE);
        Piece piece = UsineDePiece.genererPiece();
        Assertions.assertNotNull(piece);
        Assertions.assertTrue(piece instanceof Piece);
    }

    @Test
    public void testGenererPieceCyclic() {
        UsineDePiece.setMode(UsineDePiece.CYCLIC);
        Piece piece1 = UsineDePiece.genererPiece();
        Assertions.assertNotNull(piece1);
        Assertions.assertTrue(piece1 instanceof Piece);
        Piece piece2 = UsineDePiece.genererPiece();
        Assertions.assertNotNull(piece2);
        Assertions.assertTrue(piece2 instanceof Piece);
        Assertions.assertNotEquals(piece1, piece2);
    }

    @Test
    public void testChangementMode() {
        UsineDePiece.setMode(UsineDePiece.ALEATOIRE_COMPLET);
        Piece piece1 = UsineDePiece.genererPiece();
        UsineDePiece.setMode(UsineDePiece.CYCLIC);
        Piece piece2 = UsineDePiece.genererPiece();
        Assertions.assertNotEquals(piece1, piece2);
    }



}
