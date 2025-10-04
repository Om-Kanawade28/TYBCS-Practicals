import TY.TYMarks;
import SY.SYMarks;
import java.util.Scanner;
public class StudentMain{
int rollno;
String name;
SYMarks sy;
TYMarks ty;
StudentMain(int rollno, String name, SYMarks s, TYMarks t){
        this.rollno = rollno;
        this.name = name;
        this.sy = s;
        this.ty = t;
    }

    public String toString(){
        return "Roll No: " + rollno + "\nName: " + name + "\nSY Marks: " + sy + "\nTY Marks: " + ty;
    }
    void calculateGrade(){
        int total  = sy.ComputerTotal + sy.MathTotal + sy.ElectronicsTotal + ty.Theory + ty.Practicals;
        double per = (double) total / 500 * 100;

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + per+ "%");
        if(per>=70){
            System.out.println("A");
        }        else if(per>=60){
            System.out.println("B");
        }
        else if(per>=50){
            System.out.println("C");
        }
        else if(per>=40){
            System.out.println("D");
        }
        else{
            System.out.println("Fail");
        }
    
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number Of student:=");
        int n = sc.nextInt();
        StudentMain s[] = new StudentMain[n];
        for(int i =0;i<n;i++){
            System.out.println("Ennter the roll  no:");
            int rollno = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline
            System.out.println("Enter the name:");
            String name = sc.nextLine();
            System.out.println("Enter SYMarks (ComputerTotal, MathTotal, ElectronicsTotal):");
            int cTotal = sc.nextInt();
            int mTotal = sc.nextInt();
            int eTotal = sc.nextInt();
            SYMarks syMarks = new SYMarks(cTotal, mTotal, eTotal);
            System.out.println("Enter TYMarks (Theory, Practicals):");
            int theory = sc.nextInt();
            int practicals = sc.nextInt();
            TYMarks tyMarks = new TYMarks(theory, practicals);
            s[i] = new StudentMain(rollno, name, syMarks, tyMarks);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + " Details:");
            System.out.println(s[i]);
            s[i].calculateGrade();
        
        }
    }
}
