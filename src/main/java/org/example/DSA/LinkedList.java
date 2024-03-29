package org.example.DSA;

import java.util.ArrayList;

public class LinkedList {
    // LinkedList() will initialize an empty linked list.
    private Node head;
    private Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    // int get(int i) will return the value of the ith node (0-indexed). If the index is out of bounds, return -1.
    public int get(int index) {
        return 0;
    }

    // void insertHead(int val) will insert a node with val at the head of the list.
    public void insertHead(int val) {
        if (head == null){
            head = new Node(val);
            tail = head;
        } else {
            head = new Node(val, this.head);
        }
    }

    // void insertTail(int val) will insert a node with val at the tail of the list.
    public void insertTail(int val) {
        if (tail == null){
            tail = new Node(val);
            head = tail;
        } else {
            Node temp = new Node(val);
            this.tail.next = temp;
            this.tail = temp;
        }
    }

    // int remove(int i) will remove the ith node (0-indexed). If the index is out of bounds, return false, otherwise return true.
    public boolean remove(int index) {
        return false;
    }

    // int[] getValues() return an array of all the values in the linked list, ordered from head to tail.
    public ArrayList<Integer> getValues() {
        ArrayList<Integer> llAsArrayList = new ArrayList<>();
        Node current = head;

        while (current != null){
            llAsArrayList.add(current.value);
            current = current.next;
        }

        return llAsArrayList;
    }

    public class Node{
        Node next;
        Integer value;

        public Node(Integer value) {
            this.value = value;
            next = null;
        }

        public Node(Integer value, Node next) {
            this.next = next;
            this.value = value;
        }
    }
}
