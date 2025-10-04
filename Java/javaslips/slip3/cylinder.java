//Q.1) Write a program to calculate the volume of cylinder. (hint : Volume: π × r² × h) 
//simple program
package slip3;
import java.util.Scanner;
class cylinder{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of cylinder:=");
        double r = sc.nextDouble();
        System.out.println("Enter the height of cylinder:=");
        double h = sc.nextDouble();
        double volume = 3.14 * r * r * h;
        System.out.println("The Volume of Cylinder is:=" + volume);
        sc.close();
    }
}