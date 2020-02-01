package com.company;

import java.util.Scanner;

public class Gameseachnumer {
    public int a,b;
    final int MAX=100;
    final int MIN=1;
    public void Game(){
        while (a!=b)
        {
            System.out.println("Your number (1:100) :");
            Scanner input=new Scanner(System.in);
            b=input.nextInt();
            if (a>b)
            {
               System.out.println("Less than!!!");
            }
            else if (a<b)System.out.println("Greater than!!!");
            else
            {
                System.out.println("!!!!!!   Congratulation    !!!!");
                break;
            }
        }
    }

    public static void main(String[] args) {

        Gameseachnumer test1=new Gameseachnumer();
        test1.a=(int)(Math.random()*(test1.MAX-test1.MIN)+1);
       // System.out.println(test1.a);
        test1.Game();

    }
}
