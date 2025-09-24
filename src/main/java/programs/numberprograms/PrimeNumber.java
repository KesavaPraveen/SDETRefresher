package programs.numberprograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        /*
        Check if a number is prime
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=scanner.nextInt();
        if(num==1 || num % 2 ==0)
        {
            System.out.println(num + " is not a Prime");
        }
        else
        {
            System.out.println(num + " is a Prime");
        }

    }
}
