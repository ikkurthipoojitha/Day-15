package com.bridgelabz.hashtable;

public class LinkedHashMapMain {

    public static void main (String[] args){
        String sentence = "Paranoids are not paranoid because they are paranoid but" +
                " because they keep putting themselves deliberately into"+
                " paranoid avoidable situations";
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words){
            Integer value = linkedHashMap.get(word);
            if (value==null) value = 1;
            else value=value+1;
            linkedHashMap.add(word, value);
        }
        int frequency;
        System.out.println(linkedHashMap);
    }
}
