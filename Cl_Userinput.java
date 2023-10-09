package Company;
import java.util.Scanner;

import java.util.Scanner;

public class Cl_Userinput {
    public static void main(String[] args) {
        System.out.println("Taking Input User");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a+b+c;
        String str = sc.nextLine();

        System.out.println("Enter Num 1 : ");
        System.out.println("Enter Num 2 : ");
        System.out.println("Enter Num 3 : ");
        System.out.println("The sum of Number is : " + sum);

        System.out.println(str);


    }
}
