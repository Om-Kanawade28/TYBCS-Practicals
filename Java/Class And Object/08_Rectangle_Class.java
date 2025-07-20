import java.util.*;
class Rectangle{
 int length;
 int breath;
 Rectangle(int l,int b){
 length = l;
 breath = b;
 }
 int area(){
  return length*breath;
 }
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the length:=");
 int l = sc.nextInt();
  System.out.println("Enter the breadth:=");
 int b = sc.nextInt();
 
 Rectangle r1 = new Rectangle(l,b);
 System.out.println("Area of Reactangle:="+r1.area());
 }
}
