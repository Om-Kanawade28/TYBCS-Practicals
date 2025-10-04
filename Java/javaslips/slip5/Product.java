// Marker interface
interface ProductMarker {
    // No methods, just a marker
}
class Product implements ProductMarker {
    // Attributes
    int product_id;
    String product_name;
    double product_cost;
    int product_quantity;

    // Static variable to keep track of object count
    static int objectCount = 0;

    // Default constructor
    public Product() {
        this.product_id = 0;
        this.product_name = "Unknown";
        this.product_cost = 0.0;
        this.product_quantity = 0;
        objectCount++;
    }

    // Parameterized constructor
    public Product(int product_id, String product_name, double product_cost, int product_quantity) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_cost = product_cost;
        this.product_quantity = product_quantity;
        objectCount++;
    }

    // Method to display product details
    public void display() {
        System.out.println("Product ID       : " + product_id);
        System.out.println("Product Name     : " + product_name);
        System.out.println("Product Cost     : " + product_cost);
        System.out.println("Product Quantity : " + product_quantity);
        System.out.println("-------------------------------");
    }
     public static void main(String[] args) {
        // Create objects using default constructor
        Product p1 = new Product();

        // Create objects using parameterized constructor
        Product p2 = new Product(101, "Laptop", 55000.0, 5);
        Product p3 = new Product(102, "Mobile", 20000.0, 10);

        // Display product details
        System.out.println("Product Details:");
        System.out.println("-------------------------------");
        p1.display();
        p2.display();
        p3.display();

        // Display object count
        System.out.println("Total Product Objects Created: " + Product.objectCount);
    }
}
