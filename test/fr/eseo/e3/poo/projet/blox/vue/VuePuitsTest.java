package fr.eseo.e3.poo.projet.blox.vue;

import fr.eseo.e3.poo.projet.blox.modele.Puits;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

public class VuePuitsTest {
    @Test
    public void testConstructeurVuePuits() {
        Puits puits = new Puits(15, 25);
        VuePuits vuePuits = new VuePuits(puits);
        Assertions.assertEquals(puits, vuePuits.getPuits());
    }

}
