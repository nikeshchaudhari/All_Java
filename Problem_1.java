package Company;
import java.util.Scanner;
/*
Write a program to calculate percentage of a given students in CBSE board exam.
His marks of 5 subjects must be taken as input from this keyboard.(Marks are out of 100.)
*/
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int english = sc.nextInt();
        int math = sc.nextInt();
        int nepali = sc.nextInt();
        int comp = sc.nextInt();
        System.out.println("english is : "+ english);
        System.out.println("Math is : "+math);
        System.out.println("Neplai is : "+nepali);
        System.out.println("Computer is : "+comp);
        int sum = english+math+nepali+comp;

        float percentage = (sum*100)/500f;
        System.out.println(" Total Percentage is : "+percentage);
    }
}
