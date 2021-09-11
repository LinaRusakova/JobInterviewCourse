package com.gmail.xlinaris.lesson2.task1;

import com.gmail.xlinaris.lesson2.task1.LinkedList;

public class TestLinkedList {

    public static void main(String[] args) {
        LinkedList lt = new LinkedList<Integer>();
        lt.add(3);
        lt.add(5);
        lt.add(6);
        lt.add(4);
        System.out.println(lt);
        lt.add(2,2);
        System.out.println(lt);
        lt.remove(2);
        System.out.println(lt);
        System.out.println("Value from node with '3' position = " +lt.getValue(3)  );
        lt.removeNode(3);
        System.out.println(lt);
        lt.add(5,4);


    }

}