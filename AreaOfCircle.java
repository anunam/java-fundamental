import java.util.*;
public class AreaOfCircle{
public static void main(String []args){
Scanner input=new Scanner(System.in);
System.out.println("Enter the radius :");
double r=input.nextInt();
System.out.print("Area of the circle is :"+Math.PI*r*r);
}
}