package com.bridgelabz.hashtable;

import java.util.ArrayList;

public class LinkedHashMap<K,V> {

    public int numBuckets;
    ArrayList<LinkedList<K, V>> bucketArray;

    public LinkedHashMap() {
        this.numBuckets = 10;
        this.bucketArray = new ArrayList<>(numBuckets);
        for (int i = 0; i < numBuckets; i++) {
            bucketArray.add(null);
        }
    }

    public V get(K key) {
        int index = this.getBucketIndex(key);
        LinkedList<K, V> linkedList = bucketArray.get(index);
        if (linkedList == null) return null;
        MapNode<K, V> mapNode = linkedList.search(key);
        return (mapNode == null) ? null : mapNode.getValue();
    }

    public int getBucketIndex(K key) {
        int hashcode = Math.abs(key.hashCode());
        int index = hashcode % numBuckets;
        System.out.println("Key: " + key + " hashcode: " + hashcode + " index: " + index);
        return index;
    }

    public void add(K key, V value) {
        int index = this.getBucketIndex(key);
        LinkedList<K, V> linkedList = bucketArray.get(index);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            bucketArray.set(index, linkedList);
        }
        MapNode<K, V> mapNode = linkedList.search(key);
        if (mapNode == null) {
            mapNode = new MapNode<>(key, value);
            linkedList.append(mapNode);
        } else {
            mapNode.setValue(value);
        }
    }

    @Override
    public String toString() {
        return "LinkedHashMap{" +
                "numBuckets=" + numBuckets +
                ", BucketArray=" + bucketArray +
                '}';
    }
}
