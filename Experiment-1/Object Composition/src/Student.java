// Student.java

import com.sun.tools.javac.Main;

public class Student
{
    String RollNo,Name;
    StudentAddress studAddress;

    Student(String RollNo,String Name)
    {
        this.Name= Name;
        this.RollNo = RollNo;
        studAddress = new StudentAddress("Ankleshwar",393002);
    }

    @Override
    public String toString()
    {
        return ("RollNo : "+RollNo+"\nName : "+Name+"\nCity : "+studAddress.city+"\nPin : "+studAddress.pin);
    }

    public static void main(String[] args)
    {
        Student s = new Student("IT066","Nisarg");
        System.out.println(s);
    }
}
