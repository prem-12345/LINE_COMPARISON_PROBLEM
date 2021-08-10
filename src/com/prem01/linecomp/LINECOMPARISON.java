package com.prem01.linecomp;

//WELCOME TO LINE COMPARISON COMPUTATION PROGRAMME

/**
 * UC3 CHECK EQUALITY OF TWO LINES AND SHOW LINES ARE EQUAL,MORE THEN OR LESS THEN
 *
 * @author prem
 * @version 2.4
 * @since 10/08/2021
 */

import java.util.Scanner;

public class LINECOMPARISON {
    public static void main(String[] args) {

        int x1, x2, y1, y2;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter coordinate of line-1\n" +
                "Enter x1 point");
        x1 = input.nextInt();
        System.out.println("Enter x2 point");
        x2 = input.nextInt();
        System.out.println("Enter y1 point");
        y1 = input.nextInt();
        System.out.println("Enter y2 point");
        y2 = input.nextInt();

        double length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        int x3, x4, y3, y4;

        Scanner input2 = new Scanner(System.in);

        System.out.println("Enter coordinate of line-2\n" +
                "Enter x3 point");
        x3 = input2.nextInt();
        System.out.println("Enter x4 point");
        x4 = input2.nextInt();
        System.out.println("Enter y3 point");
        y3 = input2.nextInt();
        System.out.println("Enter y4 point");
        y4 = input2.nextInt();

        double length2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));

        System.out.println("Length of line-1 " + "(" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ") = " + length1);
        System.out.println("Length of line-2 " + "(" + x3 + "," + y3 + "),(" + x4 + "," + y4 + ") = " + length2);

        if (length1 == length2) {
            System.out.println("Line-1 and Line-2 are equal");
        }
        else if (length1 < length2) {
            System.out.println("Line-1 is less than Line-2");
        }
        else if (length1 > length2) {
            System.out.println("Line-1 is greater than Line-2");
        }

    }
}
