package com.linkedlist;

import java.util.HashSet;
import java.util.LinkedList;

public class RemoveDuplicateNodes {

    public static LinkedList<Integer> removeDuplicateNodesFromGivenList(LinkedList<Integer> list){

        HashSet<Integer> set = new HashSet<>();
        LinkedList<Integer> uniqueList = new LinkedList<>();

        for(Integer element : list){
            if(set.add(element))
                uniqueList.add(element);
        }

        list.clear();
        list.addAll(uniqueList);

        return list;
    }

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(3);

        System.out.println("Original Linked List: " + list);

        RemoveDuplicateNodes.removeDuplicateNodesFromGivenList(list);

        System.out.println("Linked List after removing duplicates: " + list);

    }
}
