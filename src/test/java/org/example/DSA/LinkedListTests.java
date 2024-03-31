package org.example.DSA;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class LinkedListTests {

    @Test
    public void insertHead(){
        LinkedList linkedList = new LinkedList();

        assertEquals(new ArrayList<Integer>(), linkedList.getValues());

        linkedList.insertHead(5);
        assertEquals(new ArrayList<Integer>(Arrays.asList(5)), linkedList.getValues());

        linkedList.insertHead(10);
        assertEquals(new ArrayList<Integer>(Arrays.asList(10, 5)), linkedList.getValues());
    }

    @Test
    public void insertTail(){
        LinkedList linkedList = new LinkedList();

        assertEquals(linkedList.getValues(), new ArrayList<Integer>());

        linkedList.insertTail(5);
        assertEquals(new ArrayList<Integer>(Arrays.asList(5)), linkedList.getValues());

        linkedList.insertTail(10);
        assertEquals(new ArrayList<Integer>(Arrays.asList(5, 10)), linkedList.getValues());
    }

    @Test
    public void remove(){
        LinkedList linkedList = new LinkedList();

        linkedList.insertTail(5);
        linkedList.insertTail(10);
        linkedList.insertTail(43);
        linkedList.remove(1);
        assertEquals(new ArrayList<Integer>(Arrays.asList(5,43)), linkedList.getValues());
    }

    @Test
    public void ncFailedCase(){
        LinkedList linkedList = new LinkedList();
        linkedList.insertHead(1);
        Boolean result = linkedList.remove(0);
        assertEquals(true, result);
    }
}
