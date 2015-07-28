package com.twu;


import java.util.Scanner;

public class Main {


    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        triangle_exercises();
    }

    private static void triangle_exercises() {
        draw_horizontal_line_wrapper();
        draw_vertical_line_wrapper();
        draw_right_triangle_wrapper();
    }

    private static void draw_right_triangle_wrapper() {
        System.out.println("please input the height of triangle:");
        int height = read_positive_int();
        draw_right_triangle(height);
    }

    private static void draw_right_triangle(int height) {
        for ( int i=0; i<height; i++ ){
            draw_horizontal_line(i+1);
        }
    }

    private static void draw_vertical_line_wrapper() {
        System.out.println("please input the length of vertical line:");
        int n = read_positive_int();
        draw_vertical_line(n);
    }

    private static int read_positive_int() {
        int number = in.nextInt();
        if ( number < 1 ) number = 1;
        return number;
    }

    private static void draw_vertical_line(int number) {
        for ( int i=0; i<number; i++ ){
            System.out.println("*");
        }
    }

    private static void draw_horizontal_line_wrapper() {
        System.out.println("please input the length of horizontal line:");
        int n= read_positive_int();
        draw_horizontal_line(n);
    }

    private static void draw_horizontal_line(int number) {
        for ( int i=0; i<number; i++ ){
            System.out.print("*");
        }System.out.println("");
    }
}
