package Company;
import java.util.Scanner;

public class Pratice_set {
    public static void main(String[] args) {
        /* Write a program to sum three numbers in java ?*/
        /*int num1 = 10;
        int num2 = 20;
        int num3 = 32;
        int sum = num1+num2+num3;

        System.out.println("The Sum is : " +sum);

         */

//        Write a program to calculate CGPA using marks of these subject(out of 100) ?

//        float subject1 = 45;
//        float subject2 = 95;
//        float subject3 = 48;
//
//        float cgpa = (subject1 + subject2 +subject3)/30;
//        System.out.println(cgpa);

//        Question 3
        /* Write a java program which asks the user to enter his/her name and greats then with " Hello <name>, have a good day" text .*/

//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        System.out.println("Hello"+name+"Have A good Day");

//        Question 4
        /*
        * Write a program to detect wheater a number entered by the user is interger or not /*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Number : ");
//        System.out.println(sc.hasNextInt());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Distance to kilometer : ");
        float km =sc.nextFloat();
        float miles =(float)(0.621*km);
        System.out.println("Distance : "+miles);

    }
}
