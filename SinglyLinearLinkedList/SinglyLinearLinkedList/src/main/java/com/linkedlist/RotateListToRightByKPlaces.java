package com.linkedlist;

import java.util.LinkedList;

public class RotateListToRightByKPlaces {

    public static LinkedList<Integer> rotateListToRightByKPlaces(LinkedList<Integer> inputList, int k){

        if(inputList == null || k < 0)    /* Given List should not be null or k should not be 0 */
            return inputList;

        LinkedList<Integer> rotatedList = new LinkedList<>();

        int n = inputList.size();
        k = k % n;                   /* k should always be less than n */

        for(int i = n-k; i < n; i++){
            rotatedList.add(inputList.get(i));
        }

        for(int i = 0; i < n-k; i++){
            rotatedList.add(inputList.get(i));
        }

        return rotatedList;
    }

    public static void main(String[] args) {

        LinkedList<Integer> inputList = new LinkedList<>();
        inputList.add(10);
        inputList.add(20);
        inputList.add(30);
        inputList.add(40);
        inputList.add(50);
        inputList.add(60);
        inputList.add(70);

        int k = 2;

        LinkedList<Integer> rotatedList = RotateListToRightByKPlaces.rotateListToRightByKPlaces(inputList,k);

        System.out.println("Original List : " + inputList);
        System.out.println("Rotated List  : " + rotatedList);

    }
}
