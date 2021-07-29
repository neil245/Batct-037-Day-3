package com.blz.day3.linecomparison;
import java.util.Scanner;
public class LineComparison {
public static void main(String[] args) {
	System.out.println("Welcome to line comparison computation program");
	int length;
	System.out.println("Coordinates of the first line");
	System.out.println("Enter x1");
	Scanner sc = new Scanner(System.in);
	int x1 = sc.nextInt();
	System.out.println("Enter x2");
	int x2 = sc.nextInt();
	System.out.println("Enter y1");
	int y1 = sc.nextInt();
	System.out.println("Enter y2");
	int y2 = sc.nextInt();
	System.out.println("x1 : " + x1 );
	System.out.println("x2 : " + x2 );
	System.out.println("y1 : " + y1 );
	System.out.println("y2 : " + y2 );
	length = (x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1);
	System.out.println(length);
	System.out.println("Coordinates of the second line");
	System.out.println("Enter x11");
	int x11 = sc.nextInt();
	System.out.println("Enter x22");
	int x22 = sc.nextInt();
	System.out.println("Enter y11");
	int y11 = sc.nextInt();
	System.out.println("Enter y22");
	int y22 = sc.nextInt();
	System.out.println("x11 : " + x11 );
	System.out.println("x22 : " + x22 );
	System.out.println("y11 : " + y11 );
	System.out.println("y22 : " + y22 );
	int length2 = (x22 - x11)*(x22 - x11) + (y22 - y11)*(y22 - y11);
	System.out.println(length2);
	Integer val1 = new Integer(length);
    Integer val2 = new Integer(length2);
    System.out.println(val1.equals(val2));
    
	
}
}
