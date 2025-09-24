package programs.numberprograms;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
    /*
    Factorial number
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of " +num+ " is: " +fact);
    }
}
