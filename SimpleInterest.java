import java.util.*;
public class SimpleInterest{
public static void main(String []args){
Scanner input=new Scanner(System.in);
System.out.println("Enter the principle :");
double p=input.nextInt();
System.out.println("Enter the rate :");
double r=input.nextInt();
System.out.println("Enter the time :");
double t=input.nextInt();
System.out.print("Simple interest is :"+(p*r*t)/100);
}
}