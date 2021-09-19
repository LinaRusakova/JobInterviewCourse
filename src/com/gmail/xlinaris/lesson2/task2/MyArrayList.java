package com.gmail.xlinaris.lesson2.task2;


import java.util.Arrays;

public class MyArrayList<T> {
    private static final int START_LENGTH = 10;
    private T[] arr;
    private int size;

    public MyArrayList() {
        this.arr = (T[]) new Object[START_LENGTH];
        this.size = 0;
    }

    public void add(T value) {
        if (size >= arr.length) {
            arr = Arrays.copyOf(arr, size * 2);
        }
        arr[size++] = value;
    }

    public void addAll(MyArrayList<T> value) {

        if (size + value.size >= arr.length) {
            arr = Arrays.copyOf(arr, (size + value.size) * 2);
        }
        for (T cell : value.arr) {
            if (cell != null) {
                arr[size++] = cell;
            }
        }

    }


    T get(int index) {
        if (index < 0 || index >= arr.length) {
            throw new IndexOutOfBoundsException("Error. You tried to get a value at an index outside the size of the ArrayList! ");
        } else {
            return (T) arr[index];
        }
    }

    public void remove(int index) {
        if (index < 0 || index >= arr.length) {
            throw new IndexOutOfBoundsException("Error. Have you tried remove an index outside size of the ArrayList!");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (i > index) {
                    arr[i - 1] = arr[i];
                }
            }
            size--;
        }

    }

    @Override
    public String toString() {
        return "ArrayList{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }

}
