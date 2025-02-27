import java.util.*;
public class VolumeOfCylinder{
public static void main(String []args){
Scanner input=new Scanner(System.in);
System.out.println("Enter the radius :");
double r=input.nextDouble();
System.out.println("Enter the height :");
double h=input.nextDouble();
System.out.print("Volume of the cylinder is :"+Math.PI*r*r*h);
}
}
