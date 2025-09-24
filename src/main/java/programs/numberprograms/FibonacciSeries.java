package programs.numberprograms;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        /*
        Fibonacci series
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=scanner.nextInt();
        int a=0,b=1,next;
        for(int i=0;i<=num;i++)
        {
            System.out.print(a+ " ");
            next=a+b;
            a=b;
            b=next;
        }

    }
}
