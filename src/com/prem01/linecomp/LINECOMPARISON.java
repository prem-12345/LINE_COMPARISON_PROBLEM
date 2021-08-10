package com.prem01.linecomp;

//WELCOME TO LINE COMPARISON COMPUTATION PROGRAMME

/**
 * UC1 MODEL A LINE BASED ON POINT CONSISTING OF (X,Y) CO-ORDINATES AND CALCULATE THE LENTH
 *
 * @author prem
 * @version 2.1
 * @since 10/08/2021
 */

import java.util.Scanner;

public class LINECOMPARISON {
    public static void main(String[] args) {

        int x1, x2, y1, y2;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter x1 point");
        x1 = input.nextInt();
        System.out.println("Enter x2 point");
        x2 = input.nextInt();
        System.out.println("Enter y1 point");
        y1 = input.nextInt();
        System.out.println("Enter y2 point");
        y2 = input.nextInt();

        double length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length of the line between points " + "(" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ") = " + length);


    }
}
