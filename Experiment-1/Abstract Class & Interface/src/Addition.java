// Addition.java

import java.util.Scanner;

public class Addition extends abstractSum
{
    @Override
    int sum(int a, int b)
    {
        return (a+b);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();

        abstractSum as = new Addition();
        System.out.println("Sum : "+as.sum(a,b));
    }
}
