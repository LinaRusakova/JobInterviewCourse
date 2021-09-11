package com.gmail.xlinaris.lesson2.task1;


public class LinkedList<E> {
    int size;
    Node<E> nodeLast;
    Node<E> tempCurrent;
    Node<E> nodeFirst;


    public LinkedList() {
        size = 0;
    }

    class Node<E> {
        E value;
        Node<E> next;
        Node<E> previous;

        public Node(E value) {
            this.value = value;
        }
    }


    public int size() {
        int resultSize = 0;
        if (nodeFirst == null) {
            resultSize = 0;
        } else {
            Node<E> current = nodeFirst;
            while (current.next != null) {
                current = current.next;
                resultSize++;
            }
            resultSize++;
            size=resultSize;
        }
        return size;
    }

    public void add(E value) {
        if (size == 0) {
            nodeLast = new Node<E>(value);
            nodeLast.next = null;
            nodeLast.previous = null;
            nodeFirst = nodeLast;
            size++;
        } else {
            tempCurrent = new Node<E>(value);
            tempCurrent.next = null;
            tempCurrent.previous = nodeLast;
            nodeLast.next = tempCurrent;
            nodeLast = tempCurrent;
            size++;
        }
    }

    public void add(int position, E value) {
        if (position == 0 || position > size) {
            throw new IndexOutOfBoundsException("Error. Have you tried adding an index outside of the LinkedList!");
        } else {

            Node<E> requiredNode = nodeFirst;
            for (int i = 1; i <= size; i++) {

                if (position == i) {
                    tempCurrent = new Node<E>(value);
                    tempCurrent.previous = requiredNode;
                    tempCurrent.next = requiredNode.next;
                    requiredNode.next = tempCurrent;

                    size++;
                }
                requiredNode = requiredNode.next;
            }
        }
    }


    public void remove(int position) {
        if (position == 0 || position > size) {
            throw new IndexOutOfBoundsException("Error. Have you tried deleting an index outside of the LinkedList!");
        } else {

            if (position == 1) {
                Node<E> requiredNode = nodeFirst.next;
                requiredNode.previous = null;
                nodeFirst = requiredNode;
                size--;
            } else if (position == size) {
                Node<E> requiredNode = nodeLast.previous;
                requiredNode.next = null;
                nodeLast = requiredNode;
                size--;
            } else {
                Node<E> requiredNode = nodeFirst;
                for (int i = 1; i <= size; i++) {

                    if (position == i) {
                        Node<E> previous = requiredNode.previous;
                        Node<E> next = requiredNode.next;
                        previous.next = next;
                        next.previous = previous;

                        size--;
                    }
                    requiredNode = requiredNode.next;
                }
            }

        }
    }


    public boolean removeNode(E value) {
        boolean isRemove = false;
        if (value.equals(nodeFirst.value)) {
            Node<E> requiredNode = nodeFirst.next;
            requiredNode.previous = null;
            nodeFirst = requiredNode;
            size--;
        } else if (value.equals(nodeLast.value)) {
            Node<E> requiredNode = nodeLast.previous;
            requiredNode.next = null;
            nodeLast = requiredNode;
            size--;
        } else {
            Node<E> requiredNode = nodeFirst;
            for (int i = 1; i <= size; i++) {
                if (requiredNode.value.equals(value)) {
                    Node<E> previous = requiredNode.previous;
                    Node<E> next = requiredNode.next;
                    previous.next = next;
                    next.previous = previous;
                    isRemove = true;
                    size--;
                }
                requiredNode = requiredNode.next;
            }
        }
        if (!isRemove) {
            System.out.println("The operation to delete node with value=\"" + value + "\" was rejected because the value was not found in this LinkedList.\n");
        }
        return isRemove;
    }

    public E getValue(int position) {
        E result = null;
        if (position == 0 || position > size) {
            throw new IndexOutOfBoundsException("Error. You tried  an index outside the size of the LinkedList!");
        } else {

            if (position == 1) {
                result = nodeFirst.value;
            } else if (position == size) {
                return nodeLast.value;
            } else {
                Node<E> requiredNode = nodeFirst;
                for (int i = 1; i <= size; i++) {
                    if (position == i) {
                        result = requiredNode.value;
                    }
                    requiredNode = requiredNode.next;
                }
            }
            return result;
        }
    }


    public String toString() {
        if (this.size() != 0) {

            Node<E> current = nodeFirst;
            StringBuilder linkedListToString = new StringBuilder("LinkedList contains nodes:\n[");
            while (current.next != null) {
                linkedListToString.append(current.value);
                linkedListToString.append("]-> <-[");
                current = current.next;
            }
            linkedListToString.append(current.value).append("]\n");
            linkedListToString.append("size = " + size() + "\n");
            return new String(linkedListToString);
        } else {
            return "LinkedList is clear";
        }
    }
}
