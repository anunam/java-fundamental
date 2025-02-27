import java.util.*;
public class PerimeterOfRectangle{
public static void main(String []args){
Scanner input=new Scanner(System.in);
System.out.println("Enter the length :");
double l=input.nextDouble();
System.out.println("Enter the width :");
double w=input.nextDouble();
System.out.print("Perimeter of rectangle is :"+2*(l+w));
}
}
