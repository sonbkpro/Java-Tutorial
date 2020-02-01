package com.company;

import java.util.Scanner;

public class ShapedTower {
    public int i; // Declare value distance
    // Method build Right Triangle
    public void builRightTriangle(int n)
    {
        int i=1;
        while (i<=n)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
            i++;
        }

    }

    // Method build Right Triangle 2
    public void builRightTriangle2(int n)
    {
        i=n;
        while (i>=1)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
            i--;
        }

    }

    // Method build left Triangle
    public void builLeftTriangle(int n)
    {

        i=1;
        while (i<=n)
        {
            for(int k=1;k<=(n-i);k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
            i++;
        }

    }


    // Method buil Isosceles Triangle
    public void IsoscelesTriangle(int n)
    {

        i=1;
        while (i<=n)
        {
            for(int k=1;k<=(n-i);k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i-1);j++)
            {
                System.out.print("* ");
            }
            System.out.println();
            i++;
        }
    }


    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        ShapedTower test1=new ShapedTower();
        System.out.println("Please input value of Distance: ");
        int n =input.nextInt();
        test1.IsoscelesTriangle(n);
        System.out.print("\n");
        test1.builLeftTriangle(n);
        System.out.print("\n");
        test1.builRightTriangle2(n);
        //test1.builRightTriangle(n);

    }
}
