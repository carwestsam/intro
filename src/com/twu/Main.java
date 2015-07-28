package com.twu;


import java.util.Scanner;

public class Main {


    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        draw_horizontal_line_wrapper();
        draw_vertical_line_wrapper();
    }

    private static void draw_vertical_line_wrapper() {
        System.out.println("please input the length of vertical line:");
        int n = read_a_int();
        draw_vertical_line(n);
    }

    private static int read_a_int() {
        return in.nextInt();
    }

    private static void draw_vertical_line(int number) {
        for ( int i=0; i<number; i++ ){
            System.out.println("*");
        }
    }

    private static void draw_horizontal_line_wrapper() {
        System.out.println("please input the length of horizontal line:");
        int n=read_a_int();
        draw_horizontal_line(n);
    }

    private static void draw_horizontal_line(int number) {
        for ( int i=0; i<number; i++ ){
            System.out.print("*");
        }System.out.println("");
    }
}
