package org.example.DSA;
//
//class Deque {
//    Node head;
//    Node tail;
//    int size = 0;
//
//    public Deque() {
//        head = new Node(-1);
//        tail = head;
//    }
//
//    public boolean isEmpty() {
//        if (size == 0){
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public void append(int value) {
//        this.tail.next = new Node(value);
//        this.tail = this.tail.next;
//        size++;
//    }
//
//    public void appendleft(int value) {
//        Node node = new Node(value);
//        node.next = head.next;
//        head.next = node;
//        // Condition in case we appendLeft to an empty queue
//        if (node.next == null){
//            tail = node;
//        }
//        size++;
//    }
//
//    public int pop() {
//        if (size == 0){
//            return -1;
//        }
//
//        Node node = head;
//        for(int i = 0; i < size; i++){
//            node = head.next;
//        }
//        int result = node.next.value;
//        node.next = null;
//        tail = node;
//        size--;
//
//        return result;
//    }
//
//    public int popleft() {
//        return -1;
//    }
//
//    private class Node {
//        Node next;
//        int value;
//
//        public Node(int value) {
//            this.value = value;
//            next = null;
//        }
//    }
//}


class Deque {
    Node dummyHead;
    Node dummyTail;
    public Deque() {
        dummyHead = new Node(-1);
        dummyTail = new Node(-1);
        dummyHead.next = dummyTail;
        dummyTail.prev = dummyHead;
    }

    public boolean isEmpty() {
        return dummyHead.next == dummyTail;
    }

    public void append(int value) {
        Node node = new Node(value);
        node.prev = dummyTail.prev;
        node.next = dummyTail;
        dummyTail.prev.next = node;
        dummyTail.prev = node;
    }

    public void appendleft(int value) {
        Node node = new Node(value);
        node.prev = dummyHead;
        node.next = dummyHead.next;
        dummyHead.next.prev = node;
        dummyHead.next = node;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        Node targetNode = dummyTail.prev;
        Node prevNode = targetNode.prev;
        int value = targetNode.value;

        dummyTail.prev = prevNode;
        prevNode.next = dummyTail;

        return value;
    }

    public int popleft() {
        if (isEmpty()) {
            return -1;
        }
        Node targetNode = dummyHead.next;
        Node nextNode = targetNode.next;
        int value = targetNode.value;

        dummyHead.next = nextNode;
        nextNode.prev = dummyHead;

        return value;
    }

    private class Node {
        Node next;
        Node prev;
        int value;

        public Node(int value) {
            this.value = value;
            next = null;
            prev = null;
        }
    }
}