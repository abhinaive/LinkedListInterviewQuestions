package com.linkedlist;

import java.util.LinkedList;

public class AddTwoNumbersWhenDigitsAreNodesOfLinkedList {

    public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2){

        LinkedList<Integer> l3 = new LinkedList<>();
        int carry = 0;


        while(!l1.isEmpty()  || !l2.isEmpty()){
             int node1 = l1.isEmpty() ? 0 : l1.poll();
//             System.out.println("node1 : " + node1);
             int node2 = l2.isEmpty() ? 0 : l2.poll();
//             System.out.println("node2 : " + node2);
             int sum = node1 + node2 + carry;
//             System.out.println("carry : "+carry);
//             System.out.println("sum   : "+sum);
//             System.out.printf("\n\n");
             carry = sum/10;
             l3.add(sum%10);
        }

        if(carry > 0)
            l3.add(carry);

        return l3;

    }

    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(2);
        l1.add(4);
        l1.add(3);
        l1.add(6);

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(5);
        l2.add(6);
        l2.add(4);

        LinkedList<Integer> res = AddTwoNumbersWhenDigitsAreNodesOfLinkedList.addTwoNumbers(l1,l2);

        System.out.println(res);
    }
}
