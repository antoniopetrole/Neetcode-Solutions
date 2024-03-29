package org.example.DSA;

import java.util.Arrays;

class DynamicArray {

    private int[] array;
    private int size;
    private int capacity;

    // DynamicArray(int capacity) will initialize an empty array with a capacity of capacity, where capacity > 0.
    public DynamicArray(int capacity) {
        if (capacity <= 0){
            throw new IllegalArgumentException("Dynamic Array capacity cannot be set to less than 1");
        }

        array = new int[capacity];
        size = 0;
        this.capacity = capacity;
    }

    // int get(int i) will return the element at index i. Assume that index i is valid.
    public int get(int i) {
        if (i > size){
            throw new IndexOutOfBoundsException();
        }
        return array[i];
    }

    // void set(int i, int n) will set the element at index i to n. Assume that index i is valid.
    public void set(int i, int n) {
        if (i > size - 1){
            throw new IndexOutOfBoundsException();
        }
        array[i] = n;
    }

    // void pushback(int n) will push the element n to the end of the array.
    public void pushback(int n) {
        if (size == capacity){
            resize();
        }

        array[size] = n;
        size++;
    }

    // int popback() will pop and return the element at the end of the array. Assume that the array is non-empty.
    public int popback() {
        if(size == 0){
            throw new IndexOutOfBoundsException("Cannot popback empty dynamic array");
        }

        int buffer = array[size - 1];
        array[size - 1] = 0;
        size--;

        return buffer;
    }

    // void resize() will double the capacity of the array.
    private void resize() {
        capacity = capacity * 2;
        array = Arrays.copyOf(array, capacity);
    }

    // int getSize() will return the number of elements in the array.
    public int getSize() {
        return size;
    }


    // int getCapacity() will return the capacity of the array.
    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        String string = "";

        for (int i = 0; i < size; i++){
            string += String.format("%d",array[i]);
            if (i != size - 1){
                string += ", ";
            }
        }

        return string;
    }
}
