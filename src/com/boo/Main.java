package com.boo;

/*
  @author dmazaraki
 */

import java.util.*;

class Main {

    public static void main(String[] args) {
        int[] temps;

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        temps = new int[n];
        for (int i = 0; i < n; i++) {
            int t = in.nextInt();
            temps[i] = t;
        }

        Arrays.sort(temps);
        for (int item = 0; item < temps.length - 1; item++){
            if (temps[item] == 0){
                System.out.println(temps[item]);
                break;
            }
            if((0 - Math.abs(temps[item])) == (0 - Math.abs(temps[item+1]))){
                if (temps[item] > 0){
                    System.out.println(temps[item]);
                    break;
                } else {
                    System.out.println(temps[item+1]);
                    break;
                }
            }
        }
    }
}