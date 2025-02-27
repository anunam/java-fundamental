import java.util.*;
public class AverageOfThreeNumbers{
public static void main(String []args){
Scanner input=new Scanner(System.in);
System.out.println("Enter the first number :");
double a=input.nextInt();
System.out.println("Enter the second number :");
double b=input.nextInt();
System.out.println("Enter the third number :");
double c=input.nextInt();
System.out.print("Area of the cylinder is :"+(a+b+c)/3);
}
}