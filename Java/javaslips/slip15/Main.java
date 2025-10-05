import java.util.*;

abstract class Order {
    int id;
    String description;

    abstract void accept();
    abstract void display();
}

class PurchaseOrder extends Order {
    String customerName;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PurchaseOrder ID, Description, Customer Name: ");
        id = sc.nextInt();
        description = sc.next();
        customerName = sc.next();
    }

    void display() {
        System.out.println("PurchaseOrder -> ID: " + id + ", Desc: " + description + ", Customer: " + customerName);
    }
}

class SalesOrder extends Order {
    String vendorName;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter SalesOrder ID, Description, Vendor Name: ");
        id = sc.nextInt();
        description = sc.next();
        vendorName = sc.next();
    }

    void display() {
        System.out.println("SalesOrder -> ID: " + id + ", Desc: " + description + ", Vendor: " + vendorName);
    }
}

class Main {
    public static void main(String[] args) {
        PurchaseOrder[] p = new PurchaseOrder[3];
        SalesOrder[] s = new SalesOrder[3];

        System.out.println("=== Enter Purchase Orders ===");
        for (int i = 0; i < 3; i++) {
            p[i] = new PurchaseOrder();
            p[i].accept();
        }

        System.out.println("\n=== Enter Sales Orders ===");
        for (int i = 0; i < 3; i++) {
            s[i] = new SalesOrder();
            s[i].accept();
        }

        System.out.println("\n--- Purchase Orders ---");
        for (PurchaseOrder po : p) po.display();

        System.out.println("\n--- Sales Orders ---");
        for (SalesOrder so : s) so.display();
    }
}
