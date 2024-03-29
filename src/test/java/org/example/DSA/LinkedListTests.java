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

        assertEquals(linkedList.getValues(), new ArrayList<Integer>());

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

}
