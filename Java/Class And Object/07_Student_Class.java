import java.util.*;
class Student{
  int rollno;
  String name;
  Student(int rollno,String name){
   this.rollno = rollno;
   this.name = name;
   }
 void display(){
 
  System.out.println("Roll No :-"+this.rollno);
  System.out.println("Name :- "+this.name);

  
 }
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter the no of student:=");
  int n = sc.nextInt();
  Student s[] = new Student[n];
  for(int i=0;i<n;i++){
  
   System.out.println("Enter the roll No:-");
   int rollno = sc.nextInt();
   sc.nextLine();
   System.out.println("Enter the Name:-");
   String name = sc.nextLine();
 
   s[i] = new Student(rollno,name); 
  }
  System.out.println("Studnts Information:-");
  for(int i =0;i<n;i++){
  System.out.println("Studnt detail:-"+(i+1));
  s[i].display();
  }

  }
 
}
