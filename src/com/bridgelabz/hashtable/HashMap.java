package com.bridgelabz.hashtable;

public class HashMap<K,V> {

    LinkedList<K, V> linkedList;

    public HashMap() {
        this.linkedList = new LinkedList<>();
    }

    public V get(K key) {
        MapNode<K, V> mapNode = linkedList.search(key);
        return (mapNode == null) ? null : mapNode.getValue();
    }

    public void add(K key, V value) {
        MapNode<K,V> mapNode = linkedList.search(key);
        if(mapNode==null){
           mapNode=new MapNode<>(key,value);
            linkedList.append(mapNode);
        }else {
            mapNode.setValue(value);
        }
    }

    @Override
    public String toString() {
        return "HashMap{" +
                "LinkedList=" + linkedList +
                '}';
    }
}
