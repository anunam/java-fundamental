import java.util.*;
public class CelciusToFahrenheit{
public static void main(String []args){
Scanner input=new Scanner(System.in);
System.out.println("Enter the Celcius to convert Fahrenheit :");
double x=input.nextInt();
double value=(x*(9/5))+32;
System.out.print("fahrenheit value is :"+value);

}
}