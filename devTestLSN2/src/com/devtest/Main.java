package com.devtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // creating an Empty Integer ArrayList to store the values
        List<Integer> list = new ArrayList<Integer>();

        //Initializing Scanner to take the input
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        //Create a second scanner to go over the input and add the numbers to the list
        Scanner sc2 = new Scanner(input);
        while (sc2.hasNext()) {
            // if the next is a int, add it to the list
            if (sc2.hasNextInt()) {
                list.add(sc2.nextInt());
            }
        }
        sc2.close();


        Collections.sort(list);
        // printing initial value ArrayList for testing
        //System.out.print("ArrayList: " + list + "\n");

        // initialize all elements and iterators
        int first;
        int last;
        int m;
        int n;
        while((list.size() >= 2) && !(list.isEmpty()))
        {
            m = 1;
            n = 1;
            first = list.get(0);
            last = list.get(list.size() - 1);
            if((first+last) >13)
            {
                list.remove(list.size() - 1);
            }
            else if((first+last) == 13)
            {
                if((list.get(m) == first))
                {
                    while(list.get(list.size()-(1+n)) == last)
                    {
                        System.out.println(first + " " + list.get(list.size()-(1+n)));
                        n++;
                    }
                    System.out.println(first + " " + list.get(list.size()-1));
                    list.remove(0);
                }
                else
                {
                    while(list.get(list.size()-(1+n)) == last)
                    {
                        System.out.println(first + " " + list.get(list.size()-(1+n)));
                        list.remove(list.size()-1);
                    }
                }
                System.out.println(first + " " + last);
                list.remove(0);
                list.remove(list.size()-1);
            }
            else
            {
                list.remove(0);
            }
        }
    }
}
