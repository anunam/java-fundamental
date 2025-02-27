import java.util.*;
public class PowerCalculation{
public static void main(String []args){
Scanner input=new Scanner(System.in);
System.out.println("Enter the base :");
double b=input.nextDouble();
System.out.println("Enter the exponent :");
double e=input.nextDouble();
System.out.print("value is :"+Math.pow(b,e));
}
}
