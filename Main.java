package com.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String figure = sc.nextLine();
	if(figure.equals("square")){
	    double a = sc.nextDouble();
	    double area = a * a;
        System.out.println(area);
    } else if(figure.equals("rectangle")){
	    double a = sc.nextDouble();
	    double b = sc.nextDouble();
	    double area = a * b;
        System.out.println(area);
    } else {
	    double r = sc.nextInt();
	    double area = Math.PI * r * r;
        System.out.println(area);

    }
    }
}
