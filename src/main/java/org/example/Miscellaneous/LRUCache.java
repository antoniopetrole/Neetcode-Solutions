package org.example.Miscellaneous;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private Map<Integer, Node> cache = new HashMap<Integer, Node>();
    private int capacity = 0;
    private Node left;
    private Node right;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        left = new Node(0,0);
        right = new Node(0,0);

        // Left=LRU and Right=MRU
        left.next = right;
        right.previous = left;
    }

    public int get(int key) {
        if(cache.containsKey(key)){
            remove(cache.get(key));
            insert(cache.get(key));
            return cache.get(key).value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(cache.containsKey(key)){
            remove(cache.get(key));
        }
        cache.put(key, new Node(key, value));
        insert(cache.get(key));

        if (cache.size() > capacity){
            Node lru = left.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }

    // Remove from list
    private void remove(Node node){
        Node prev = node.previous;
        Node next = node.next;
        prev.next = next;
        next.previous = prev;
    }

    // Insert at right
    private void insert(Node node){
        Node previous = right.previous;
        Node next = right;
        previous.next = node;
        next.previous = node;
        node.next = next;
        node.previous = previous;
    }

    private class Node{
        int key;
        int value;
        Node previous;
        Node next;

        public Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
}
