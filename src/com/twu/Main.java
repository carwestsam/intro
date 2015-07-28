package com.twu;


import java.util.Scanner;

public class Main {


    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //triangle_exercises();

        diamond_exercises();
    }

    private static void diamond_exercises() {
        isosceles_triangle_wrapper();
        diamond_wrapper();
        diamond_with_name_wrapper("Song");
    }

    private static void diamond_with_name_wrapper(String name) {
        System.out.println("please input the size of diamond");
        int size = read_positive_int();
        diamond_with_name(name,size);
    }

    private static void diamond_with_name(String name, int size) {
        for ( int i=0; i<size-1; i++ ){
            draw_central_stars(i+1, size);
        }
        System.out.println(name);
        for ( int i=size-1; i>0; i-- ){
            draw_central_stars(i, size);
        }
    }

    private static void diamond_wrapper() {
        System.out.println("please input the size of diamond:");
        int size = read_positive_int();
        diamond(size);
    }

    private static void diamond(int size) {
        for ( int i=0; i<size; i++ ){
            draw_central_stars(i+1, size);
        }
        for ( int i=size-1; i>0; i-- ){
            draw_central_stars(i, size);
        }
    }

    private static void isosceles_triangle_wrapper() {
        System.out.println("please input the centered triangle height:");
        int height = read_positive_int();
        isosceles_triangle(height);
    }

    private static void isosceles_triangle(int height) {
        for ( int i = 0; i<height; i++ ){
            draw_central_stars(i + 1, height);
        }
    }

    private static void draw_central_stars(int stars, int width) {
        for ( int i=0; i< width - stars; i++ )
            System.out.print(" ");
        for ( int i=0; i< 1 + (stars - 1)*2; i++ )
            System.out.print("*");
        for ( int i=0; i< width - stars; i++ )
            System.out.print(" ");
        System.out.println();
    }


    /****************************************************/
    /*
    /*    start of triangle_exercises
    /*
    /****************************************************/

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
        int number = read_positive_int();
        draw_vertical_line(number);
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
        int number= read_positive_int();
        draw_horizontal_line(number);
    }

    private static void draw_horizontal_line(int number) {
        for ( int i=0; i<number; i++ ){
            System.out.print("*");
        }System.out.println("");
    }
}
