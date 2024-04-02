package org.example.DSA;
import static org.junit.Assert.*;
import org.junit.Test;

public class DequeTests {

    @Test
    public void isEmpty(){
        Deque deque = new Deque();
        assertEquals(true, deque.isEmpty());
        deque.append(10);
        assertEquals(false, deque.isEmpty());
    }

    @Test
    public void append(){
        Deque deque = new Deque();
        deque.append(34);
        deque.append(29);
    }

    @Test
    public void appendLeft(){
        Deque deque = new Deque();
        deque.appendleft(10);
        deque.appendleft(20);
    }

    @Test
    public void pop(){
        Deque deque = new Deque();
        deque.appendleft(10);
        assertEquals(10, deque.pop());
        deque.appendleft(30);
        deque.appendleft(52);
        assertEquals(30, deque.pop());
        assertEquals(52, deque.pop());
        assertEquals(-1, deque.popleft());
    }

    @Test
    public void popLeft(){
        Deque deque = new Deque();
        deque.appendleft(10);
        deque.appendleft(20);
        assertEquals(20, deque.popleft());
        assertEquals(10, deque.popleft());
        assertEquals(-1, deque.popleft());
    }
}
