import java.util.*;
public class VolumeOfCylinder{
public static void main(String []args){
Scanner input=new Scanner(System.in);
System.out.println("Enter the radius :");
double r=input.nextInt();
System.out.println("Enter the height :");
double h=input.nextInt();
System.out.print("Area of the cylinder is :"+Math.PI*r*r*h);
}
}