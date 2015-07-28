package com.twu;


import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("please input the number of stars:");
        int n=in.nextInt();
        print_stars(n);
    }

    private static void print_stars(int number) {
        for ( int i=0; i<number; i++ ){
            System.out.print("*");
        }System.out.println("");
    }
}
