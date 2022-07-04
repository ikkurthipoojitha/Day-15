package com.bridgelabz.hashtable;

public class LinkedList<K,V> {
    MapNode<K, V> head;
    MapNode<K, V> tail;

    public MapNode<K, V> search(K key) {
        MapNode<K, V> tempNode = head;
        while (tempNode != null && tempNode.getNext() != null) {
            if (tempNode.getKey().equals(key)) {
                return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return null;
    }

    public void append(MapNode<K, V> myNode) {
        if (head == null) {
            head = myNode;
        }
        if (tail != null) {
            tail.setNext(myNode);
        }
        tail =myNode;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }
}
