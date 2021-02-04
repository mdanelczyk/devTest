package com.devtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<List<Integer>> ListOfGraphs = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // if the next is a int, add it to the list
            //System.out.println("Test " + i);
            List<Integer> Graph = new ArrayList<>();
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            Graph.add(p1);
            Graph.add(p2);
            ListOfGraphs.add(Graph);
        }
        sc.close();
        //System.out.println(ListOfGraphs);
        int i = 0;
        while(i < ListOfGraphs.size()) {
            List<Integer> tempList = new ArrayList<>(ListOfGraphs.get(i));
            if((i+1) == ListOfGraphs.size())
            {
                break;
            }
            tempList.retainAll(ListOfGraphs.get(i+1));
            if(!(tempList.isEmpty()))
            {
                ListOfGraphs.get(i).addAll(ListOfGraphs.get(i+1));
                //System.out.println(ListOfGraphs.get(i));
                ListOfGraphs.remove(i+1);
                i = 0;
            } else
            {
                i++;
            }

        }

        System.out.println(ListOfGraphs.size());
    }
}
