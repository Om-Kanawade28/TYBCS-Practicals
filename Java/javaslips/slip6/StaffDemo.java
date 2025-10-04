import java.util.Scanner;
abstract class Staff{
    protected int id;
    protected String name;
    public Staff(int id,String name){
        this.id = id;
        this.name = name;
        
    }
    public abstract void display();

}
class OfficeStaff extends Staff{
    private String dept;
    public OfficeStaff(int id,String name,String dept){
        super(id,name);
        this.dept = dept;
    }
    public void  display(){
        System.out.println("Id="+this.id);
        System.out.println("Name="+this.name);
        System.out.println("dept="+this.dept);
    }
}

public class StaffDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Office Staff");
        int n = sc.nextInt();
        OfficeStaff a[] = new OfficeStaff[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter id:");
            int id = sc.nextInt();
            System.out.println("Enter Name:");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.println("Enter depart:");
            String dept = sc.nextLine();
            a[i] = new OfficeStaff(id,name,dept);
           
           
            

        }
            System.out.println("\nOffice Staff Details:");
           
         for(int i=0;i<n;i++){
                a[i].display();
            }

    }
    
}
