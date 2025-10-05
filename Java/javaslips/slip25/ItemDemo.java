import java.util.Scanner;

class Item {
    private int item_number;
    private String item_name;
    private double item_price;


    public Item() {
        this.item_number = 0;
        this.item_name = "Unknown";
        this.item_price = 0.0;
    }

    public Item(int item_number, String item_name, double item_price) {
        this.item_number = item_number;
        this.item_name = item_name;
        this.item_price = item_price;
    }

    public void display() {
        System.out.println("Item Number: " + this.item_number);
        System.out.println("Item Name  : " + this.item_name);
        System.out.println("Item Price : " + this.item_price);
        System.out.println("-------------------------");
    }
}

public class ItemDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item[] items = new Item[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Item " + (i + 1) + ":");
            System.out.print("Item Number: ");
            int num = sc.nextInt();
            sc.nextLine();
            System.out.print("Item Name: ");
            String name = sc.nextLine();
            System.out.print("Item Price: ");
            double price = sc.nextDouble();
            items[i] = new Item(num, name, price);
            System.out.println();
        }

        System.out.println("Item Details:");
        for (Item it : items) {
            it.display();
        }
    }
}
