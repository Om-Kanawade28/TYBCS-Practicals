class Item {
    private int item_number;
    private String item_name;
    private double item_price;
    private static int count = 0;

    public Item() {
        item_number = 0;
        item_name = "Unknown";
        item_price = 0.0;
        count++;
    }

    public Item(int item_number, String item_name, double item_price) {
        this.item_number = item_number;
        this.item_name = item_name;
        this.item_price = item_price;
        count++;
        System.out.println("Object Count after creation: " + count);
    }

    public void display() {
        System.out.println("Item Number: " + item_number);
        System.out.println("Item Name  : " + item_name);
        System.out.println("Item Price : " + item_price);
        System.out.println("------------------------");
    }

    public static int getCount() {
        return count;
    }
}

public class ItemDemo {
    public static void main(String[] args) {
        Item i1 = new Item(101, "Laptop", 55000.0);
        i1.display();
        Item i2 = new Item(102, "Mobile", 20000.0);
        i2.display();
        Item i3 = new Item(103, "Tablet", 15000.0);
        i3.display();
        System.out.println("Final Object Count: " + Item.getCount());
    }
}
