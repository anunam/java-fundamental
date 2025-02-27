import java.util.*;
public class PowerCalculation{
public static void main(String []args){
Scanner input=new Scanner(System.in);
System.out.println("Enter the base :");
double b=input.nextInt();
System.out.println("Enter the exponent :");
double e=input.nextInt();
System.out.print("Area of the cylinder is :"+Math.pow(b,e));
}
}