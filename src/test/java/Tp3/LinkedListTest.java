package Tp3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    private LinkedList lk;
    @BeforeAll
    public static void TestBeforeAllTest(){
        System.out.println("this must be executed before the test");
    }
    @BeforeEach
    public void TestBeforeEachTest(){
        lk = new LinkedList();
        System.out.println("this message must be executeed before each test");
    }

    @Test
    public void TestListIsEmpty(){
        assertTrue(lk.isEmpty());
        assertNull(lk.getHead());
    }
    @Test
    public void TestInsertIntoList(){
        lk.insertHead("lahcen");
        assertEquals("lachen",lk.getHead());
        assertFalse(lk.isEmpty());
    }
    @Test
    public void TestIterator(){
        lk.insertHead("mama");
        lk.insertHead("tounssi");
        lk.insertHead("amirea");

        LinkedList.Iterator it= lk.iterator();
        assertTrue(it.hasNext());
        assertEquals("mama",it.next());
        assertEquals("tounssi",it.next());
        assertEquals("amirea",it.next());
        assertFalse(it.hasNext());
        assertNull(it.next());
    }
}