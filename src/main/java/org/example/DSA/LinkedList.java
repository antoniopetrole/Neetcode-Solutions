package org.example.DSA;

import java.util.ArrayList;

public class LinkedList {
    // LinkedList() will initialize an empty linked list.
    private Node head;
    private Node tail;
    private int size = 0;

    public LinkedList() {
        head = new Node(-1);
        tail = head;
    }

    // int get(int i) will return the value of the ith node (0-indexed). If the index is out of bounds, return -1.
    public int get(int index) {
        Node current = head.next;
        int pointer = 0;
        while (current != null){
            if (pointer == index){
                return current.value;
            }
            pointer++;
            current = current.next;
        }
        return -1;
    }

    // void insertHead(int val) will insert a node with val at the head of the list.
    public void insertHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head.next;
        head.next = newNode;
        if (newNode.next == null){
            tail = newNode;
        }
    }

    // void insertTail(int val) will insert a node with val at the tail of the list.
    public void insertTail(int val) {
        this.tail.next = new Node(val);
        this.tail = this.tail.next;
    }

    // int remove(int i) will remove the ith node (0-indexed). If the index is out of bounds, return false, otherwise return true.
    public boolean remove(int index) {
        int pointer = 0;
        Node current = head;
        while(pointer < index && current != null){
            current = current.next;
            pointer++;
        }

        if (current != null && current.next != null){
            if (current.next == this.tail) {
                this.tail = current;
            }
            current.next = current.next.next;
            return true;
        }
        return false;
    }

    // int[] getValues() return an array of all the values in the linked list, ordered from head to tail.
    public ArrayList<Integer> getValues() {
        ArrayList<Integer> llAsArrayList = new ArrayList<>();
        Node current = head.next;
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
