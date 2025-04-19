package Tp2;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MethodsUnderTestTest {
    private MethodsUnderTest mutUnder;

    @BeforeAll
    public void beforeAllExecution() {
        System.out.println("Initialisation exécutée une fois avant tous les tests");
    }

    @BeforeEach
    public void beforeEachExecution() {
        mutUnder = new MethodsUnderTest();
        System.out.println("Initialisation exécutée avant chaque test");
    }

    @Test
    void testAddPositiveNumbers() {
        assertEquals(8, mutUnder.add(5, 3));
    }

    @Test
    void testAddWithZero() {
        assertEquals(5, mutUnder.add(5, 0));
    }

    @Test
    void testAddNegativeNumber() {
        assertEquals(2, mutUnder.add(5, -3));
    }

    @Test
    void testMultPositiveNumbers() {
        assertEquals(15, mutUnder.mult(5, 3));
    }

    @Test
    void testMultWithOne() {
        assertEquals(5, mutUnder.mult(5, 1));
    }

    @Test
    void testMultWithZero() {
        assertEquals(0, mutUnder.mult(5, 0));
    }



    @Test
    void testCalculatePIWithZero() {
        assertEquals(4.0, mutUnder.calculatePI(0), 0.0001);
    }

    @Test
    void testCalculatePIWithNegativeInput() {
        assertEquals(-1, mutUnder.calculatePI(-5), 0.0001);
    }

    @Test
    void testLeftRotatingNormalCase() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {2, 3, 4, 5, 1};
        assertArrayEquals(expected, mutUnder.leftRotating(input, input.length));
    }

    @Test
    void testLeftRotatingEmptyArray() {
        int[] input = {};
        int[] expected = {};
        assertArrayEquals(expected, mutUnder.leftRotating(input, input.length));
    }

    @Test
    void testAddLivreValid() {
        Livre livre = mutUnder.addLivre("Effective Java", "Joshua Bloch", 416, 45.99);
        assertNotNull(livre);
        assertEquals("Effective Java", livre.getTitre());
        assertEquals("Joshua Bloch", livre.getAuteur());
        assertEquals(416, livre.getNbPages());
        assertEquals(45.99, livre.getPrix(), 0.001);
    }


    @Test
    void testGetLivreAfterAddition() {
        Livre expected = mutUnder.addLivre("Clean Code", "Robert Martin", 464, 35.99);
        Livre actual = mutUnder.getLivre();
        assertEquals(expected, actual);
        assertSame(expected, actual);
    }

    @Test
    void testGetLivreWithoutAdding() {
        assertNull(mutUnder.getLivre());
    }
}