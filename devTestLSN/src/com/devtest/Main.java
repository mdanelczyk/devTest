package com.devtest;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SortedSet<Integer> valueList = new TreeSet<>();

        int allElements = 0;
        int minElement;
        int maxElement;
        int allUnique;

        String input = sc.nextLine();
        sc.close();
        Scanner sc2 = new Scanner(input);
        while (sc2.hasNext()) {
            // if the next is a int, add it to the list
            if (sc2.hasNextInt()) {
                valueList.add(sc2.nextInt());
                allElements++;
            }
        }
        sc2.close();
        allUnique = valueList.size();
        minElement = valueList.first();
        maxElement = valueList.last();
        System.out.println(valueList + "\ncount: " + allElements +"\ndistinct: " + allUnique + "\nmin: " + minElement + "\nmax: " + maxElement);

    }
}


