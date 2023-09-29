// Lambda_Function.java

import java.util.Scanner;

@FunctionalInterface
interface calculator
{
    public float operation(float f1,float f2);

}

class lambda
{
    calculator addition = (n1,n2)-> {return(n1+n2);};
    calculator subtraction = (n1,n2) -> {return(n1-n2);};
    calculator multiplication = (n1,n2) -> {return(n1*n2);};
    calculator division = (n1,n2) -> {return(n1/n2);};
}

public class Lambda_Function
{
    public static void main(String[] args) {
        // TODO code application logic here
        lambda cal = new lambda();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two numbers : ");
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();

        System.out.print("Enter Operation name to perform : ");
        String op = sc.next();

        if(op.toLowerCase().equals("addition"))
        {
            System.out.println("Addition of "+n1+" & "+n2+" is "+cal.addition.operation(n1,n2));
        }
        else if(op.toLowerCase().equals("subtraction"))
        {
            System.out.println("Subtraction of "+n1+" & "+n2+" is "+cal.subtraction.operation(n1,n2));
        }
        else if(op.toLowerCase().equals("multiplication"))
        {
            System.out.println("Multiplication of "+n1+" & "+n2+" is "+cal.multiplication.operation(n1,n2));
        }
        else if(op.toLowerCase().equals("division"))
        {
            System.out.println("Division of "+n1+" from "+n2+" is "+cal.division.operation(n1,n2));
        }
        else
        {
            System.out.println("Incorrect operation type");
        }
    }

}
