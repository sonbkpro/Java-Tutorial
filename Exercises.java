package com.company;


import java.util.Scanner; // packge to input value from keyword
import java.io.*;

public class Exercises {

    public String getname;
    public void setname(String name)
    {
        getname=name;
        System.out.println(" My name is: " + getname);
    }
    // Multify 8
    public void multi(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n +" x " +i +" = "+n*i);

        }
    }
    public void dectobin(int n)
    {
        // Test 6 convert Decimal number to Binary Number
        int []convert=new int[20];
        int i=0;
        // convert
        while (n!=0)
        {
            convert[i++]=(int)(n%2);
            n=n/2;
        }
        i--;
        System.out.println("Decimal affer convert is: ");
        while (i>=0)
        {
            System.out.print(convert[i--]);
        }


    }

// Convert to hex and binary
    public  void dectohex(int n)
    {
        // Test 7 convert Decimal number to Hex Number
        int []convert=new int[20];
        int []save=new int[10];
        int []hex=new int[20];
        int i=0,j=0,k=0,t=0;
       // char hexa[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while (n!=0)
        {

            convert[i++]=(int)(n%2);
            save[j++]=convert[i-1];
            //System.out.print(save[j-1]);
            n=n/2;
            if(j==4||n==0)
            {
                j--;
                for(;j>=0;j--)
                {
                   t+=save[j]*Math.pow(2,j);
                }
               hex[k++]=t;
               t=0;
               j=0;
            }
        }

        k--;
        i--;
        System.out.println("Decimal affer convert to Binary is: ");
        while (i>=0)
        {
            System.out.print(convert[i--]);
        }
        System.out.println('\n');
        System.out.println("Decimal affer convert to Hex is: ");
        while (k>=0)
        {
            switch (hex[k])
            {
                case 10: System.out.print("A");
                    break;
                case 11: System.out.print("B");
                    break;
                case 12: System.out.print("C");
                    break;
                case 13: System.out.print("D");
                    break;
                case 14: System.out.print("E");
                    break;
                case 15: System.out.print("F");
                    break;
                default:
                System.out.print(hex[k]);
                    break;

            }
            k--;
        }


    }




    public static void main(String[] args) {

       /* Exercises employee1= new Exercises();
        Exercises employee2= new Exercises();
        employee1.setname("Son");
        employee2.setname("Hung");
*/
       /*
        // Sum 2 number
        int sum;
        Scanner scan = new Scanner(System.in); // input is name of parameter that we define
        Scanner input = new Scanner(System.in);25
        System.out.println("Please insert number1: ");
        int num1=scan.nextInt();
        System.out.println("Value' Number1 is: "+num1);
        System.out.println("Please insert number2");
        int num2=input.nextInt();
        System.out.println("Value' Number2 is: "+num2);
        sum=num1+num2;
        System.out.println("Sum of two number is: "+sum);
*/
 /*
        // Test3 multify 8*
        Scanner input=new Scanner(System.in);
        System.out.println("Please input number n: ");
        int n=input.nextInt();
        Exercises test3 =new Exercises();
        test3.multi(n);
*/

/*
        // Test 4 print Java Sign
        System.out.println("   J    "+"a   "+"v     "+"v  "+"a");
        System.out.println("   J   "+"a "+"a   "+"v   "+"v  "+"a "+"a");
        System.out.println("J  "+"J  "+"aaaaa   "+"V "+"V  "+"aaaaa");
        System.out.println(" JJ  "+"a     a   V  a     a");
*/

/*
// Test 5 Sum two binary number
        long binary1, binary2;
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        Scanner in = new Scanner(System.in);

        System.out.print("Input first binary number: ");
        binary1 = in.nextLong();
        System.out.print("Input second binary number: ");
        binary2 = in.nextLong();

        while (binary1 != 0 || binary2 != 0)
        {
            sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
            remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }
        if (remainder != 0) {
            sum[i++] = remainder;
        }
        --i;
        System.out.print("Sum of two binary numbers: ");
        while (i >=0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");

*/
/*
//Test convert Decimal to Binary
        Exercises test2=new Exercises();
        System.out.println("Please input one Decimal Number: ");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        test2.dectobin(n);
*/
// Test convert to hexa
        Exercises test1=new Exercises();
        System.out.println("Please input one Decimal Number: ");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        test1.dectohex(n);



    }
}
