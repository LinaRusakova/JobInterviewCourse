package com.gmail.xlinaris.lesson2.task2;


public class TestMyArrayList {

    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList;
        myArrayList = new MyArrayList<Integer>();

        myArrayList.add(3);
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(4);
        myArrayList.add(6);

        System.out.println(myArrayList);

        myArrayList.remove(2);
        System.out.println(myArrayList);
        System.out.println("get Value by index=1  " + myArrayList.get(1));

        System.out.println("first arraylist " + myArrayList);

        MyArrayList<Integer> arrayList2 = new MyArrayList<Integer>();

        arrayList2.add(5);
        arrayList2.add(5);
        arrayList2.add(5);
        arrayList2.add(5);
        arrayList2.add(5);
        arrayList2.add(5);
        arrayList2.add(5);

        System.out.println("second arraylist " + arrayList2);
        System.out.println();
        myArrayList.addAll(arrayList2);
        System.out.println();
        System.out.println("first arraylist + second arraylist: " + myArrayList);

    }

}