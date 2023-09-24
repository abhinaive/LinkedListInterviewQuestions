package com.linkedlist;

public class SinglyLinearLinkedList {

    private Node head;

    public SinglyLinearLinkedList() {
        head = null;
    }

    static class Node {

        private int data;
        private Node next;

        public Node() {
            data = 0;
            next = null;
        }

        public Node(int val) {
            data = val;
            next = null;
        }
    }

    public void display() {
        Node trav = head;
        while (trav.next != null) {                 /* while */
            System.out.print(trav.data + ", ");
            trav = trav.next;
        }
    }

    /**************Add A Node *****************/

    public void addFirst(int val) {
        Node newNode = new Node(val);

        if (head == null)     /*Redundant as line 41 and  42 is enough even if head is null*/
            head = newNode;

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int val) {

        Node newNode = new Node(val);
        Node trav = head;

        if (head == null)
            head = newNode;

        while (trav.next != null) {        /*  while */
            trav = trav.next;
        }
        trav.next = newNode;
    }

    public void addAtPosition(int val, int pos) {

        Node newNode = new Node();

        Node trav = head;

        for (int i = 0; i < pos - 1; i++) {      /* Pos -1  &  trav.next == null */

            if (trav.next == null)
                break;

            trav = trav.next;

        }
        newNode.next = trav.next;
        trav.next = newNode;
    }

    /**************Delete A Node *****************/

    public void delAll(){
        head = null;
    }

    public void delFirst() {

        if (head != null)
            head = head.next;
    }

    public void delLast() {

        if (head == null)
            return;

        if (head.next == null)
            head = null;
        else {
            Node prev = null;
            Node trav = head;

            while (trav.next != null) {
                prev = trav;
                trav = trav.next;
            }
            prev.next = null;
        }

    }

    public void delAtPos(int pos) {

        if (head == null)
            return;

        if (head.next == null)
            head = null;
        else {

            Node prev = null;
            Node trav = head;

            for (int i = 0; i < pos; i++) {
                prev = trav;
                trav = trav.next;
            }
            prev.next = trav.next;
        }

    }




}
