package org.example.DSA;

import java.util.Arrays;

public class HashMap {
    int capacity;
    int size;
    Pair[] map;

    public HashMap() {
        capacity = 16;
        map = new Pair[capacity];
        size = 0;
    }

    public void put(int key, int value) {
        int keyIndex = hash(key);

        if (size >= capacity / 2){
            rehash();
        }

        while (true) {
            if (map[keyIndex] == null){
                map[keyIndex] = new Pair(key, value);
                size++;
                return;
            } else if (map[keyIndex] != null && map[keyIndex].key == key) {
                map[keyIndex].value = value;
                return;
            } else {
                keyIndex++;
                keyIndex = keyIndex % capacity;
            }
        }
    }

    public int get(int key) {
        int keyIndex = hash(key);

        while(map[keyIndex] != null){
            if (map[keyIndex].key == key){
                return map[keyIndex].value;
            }
            keyIndex++;
            keyIndex = keyIndex % capacity;
        }
        return -1;
    }

    public void remove(int key) {
        int keyIndex = hash(key);

        while(map[keyIndex] != null){
            if (map[keyIndex].key == key){
                map[keyIndex] = null;
                size--;
            }
            keyIndex++;
            keyIndex = keyIndex % capacity;
        }
    }

    private int hash(int key) {
        return key % capacity;
    }

    private void rehash(){
        Pair[] oldMap = Arrays.copyOf(map, capacity);
        capacity *= 2;
        map = new Pair[capacity];
        for(Pair pair : oldMap){
            if (pair != null){
                put(pair.key, pair.value);
            }
        }
    }

    private class Pair {
        int key;
        int value;

        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
