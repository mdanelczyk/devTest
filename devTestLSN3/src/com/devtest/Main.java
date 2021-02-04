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
        int graphAmount = ListOfGraphs.size();
        for(int i = 0; i < graphAmount; i++) {
            for(int j = 0; j < graphAmount; j++)
            {
                if(j == i)
                    j++;
                if(j >= graphAmount)
                    break;
                List<Integer> tempList = new ArrayList<>(ListOfGraphs.get(i));
                tempList.retainAll(ListOfGraphs.get(j));
                //System.out.println("j is " + j + " " + ListOfGraphs.get(j));
                //System.out.println(tempList);
                if(!(tempList.isEmpty()))
                {
                    ListOfGraphs.get(i).addAll(ListOfGraphs.get(j));
                    //System.out.println(ListOfGraphs.get(i));
                    ListOfGraphs.remove(j);
                    j--;
                    graphAmount = ListOfGraphs.size();
                }
            }
        }

        System.out.println(ListOfGraphs.size());
    }
}
