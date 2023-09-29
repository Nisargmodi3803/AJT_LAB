// Main.java

import java.util.Scanner;

public class Main implements Subtraction
{

    @Override
    public int subtraction(int a, int b)
    {
        return (a-b);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();

        Subtraction sub = new Main();
        System.out.println("Subtraction : "+sub.subtraction(a,b));
    }
}
