package com.co.pa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int r1, s;
	    Scanner scanner = new Scanner(System.in);
	    r1 = scanner.nextInt();
	    s = scanner.nextInt();
	    int r2 = (s * 2) - r1;
        System.out.println(r2);
    }
}
