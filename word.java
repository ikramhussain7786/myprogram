

import java.util.Scanner;

public class word
{
    public String one_two_hund( int n) {

        String str = "";
     
   while (n != 0) {

            if (n == 1) {

                str = str + " one";

                n = 0;
          
  }
            if (n == 2) {
   
             str = str + " two";

                n = 0;
            }
  
          if (n == 3) {
         
       str = str + " three";
                n = 0;
            }
            if (n == 4) {
                str = str + " four";
                n = 0;
            }
            if (n == 5) {
                str = str + " five";
                n = 0;
            }
            if (n == 6) {
                str = str + " six";
                n = 0;
            }
            if (n == 7) {
                str = str + " seven";
                n = 0;
            }
            if (n == 8) {
                str = str + " eight";
                n = 0;
            }
            if (n == 9) {
                str = str + " nine";
                n = 0;
            }
            if (n == 10) {
                str = str + " ten";
                n = 0;
            }
            if (n == 11) {
                str = str + " eleven";
                n = 0;
            }
            if (n == 12) {
                str = str + " twelve";
                n = 0;
            }
            if (n == 13) {
                str = str + " thirten";
                n = 0;
            }
            if (n == 14) {
                str = str + " fourteen";
                n = 0;
            }
            if (n == 15) {
                str = str + " fifteen";
                n = 0;
            }
            if (n == 16) {
                str = str + " sixteen";
                n = 0;
            }
            if (n == 17) {
                str = str + " seventeen";
                n = 0;
            }
            if (n == 18) {
                str = str + " eighteen";
                n = 0;
            }
            if (n == 19) {
                str = str + " nineteen";
                n = 0;
            }
            if (n >= 20 && n < 30) {
                str = str + " twenty";
                n = n - 20;
            }
            if (n >= 30 && n < 40) {
                str = str + " thirty";
                n = n - 30;
            }
            if (n >= 40 && n < 50) {
                str = str + " forty";
                n = n - 40;
            }
            if (n >= 50 && n < 60) {
                str = str + " fifty";
                n = n - 50;
            }
            if (n >= 60 && n < 70) {
                str = str + " sixty";
                n = n - 60;
            }
            if (n >= 70 && n < 80) {
                str = str + " seventy";
                n = n - 70;
            }
            if (n >= 80 && n < 90) {
                str = str + " eighty";
                n = n - 80;
            }
            if (n >= 90 && n < 100) {
                str = str + " ninety";
                n = n - 90;
            }

        }
        return str;
    }
    public String Convert(int n)
    {
        String str="";
        while (n!=0)
        {
            if(n>1&&n<100)
            {
                str=str+one_two_hund(n);
                n=0;
            }
            else if(n>100&&n<1000)
            {
                str=str+one_two_hund(n/100);
                str=str+" houndrd";
                n=n%100;
            }
            else if(n>1000&&n<100000)
            {
                str=str+one_two_hund(n/1000);
                str=str+" thausand";
                n=n%1000;
            }
            else if(n>100000&&n<10000000)
            {
                str=str+one_two_hund(n/100000);
                str=str+" lakh";
                n=n%100000;
            }
        }
        return str;
    }
    public static void main(String args[])
    {
        String str;
        int n=100;
        Scanner sc =new Scanner(System.in);
        word t=new word();
        System.out.println("Enter no");
       n=sc.nextInt();
        str=t.Convert(n);
        System.out.print(str);
    }
}
