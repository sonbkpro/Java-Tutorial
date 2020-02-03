package chap5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// Check correct or seach
public class RegularExpression {
    private static int i=0;
    public static void main(String[] args) {

       /* String[] fullName={"Trieu Van Than","Nguyen Thi Hoa","To Trong Phu","Ngo Van Tai","Le Duc Anh",
        "Do Viet Hung","Tran Thuy Ha"};
        String regex=".*Th.*";
        Pattern pattern =Pattern.compile(regex);
        Matcher matcher;
        for (int i=0;i<fullName.length;i++)
        {
            matcher=pattern.matcher(fullName[i]);
            if(matcher.find())
            {
                System.out.println(fullName[i]);
            }



        }*/
/*
       // Replace String with Regular Expresstion
        String input="    Hello    Phan     Hong   Son   ";
        String regex="[\\s]+";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(input);
        if(matcher.find())
        {
            System.out.println(matcher.replaceAll("_"));
        }
*/
//Check Type Email use RegularExpresstion


        Scanner input= new Scanner(System.in);


        while (i!=1)
        {
            System.out.println("Please insert your mail");
            String inp =input.nextLine();


            //String input ="sonbkproksnb90@@gmail.com";

            String regex="^\\w+[a-z0-9]*@{1}\\w+mail.com$";
            Pattern pattern=Pattern.compile(regex);
            Matcher matcher =pattern.matcher(inp);

            if(matcher.find())
            {
                i=1;
                System.out.println("You correct");
            }
            else
            {
                System.out.println("In correct. Please return");
            }
        }





    }

}
