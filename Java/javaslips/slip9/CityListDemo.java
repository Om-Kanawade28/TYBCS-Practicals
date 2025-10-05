import java.util.ArrayList;
import java.util.Scanner;

public class CityListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> cities = new ArrayList<>();

        System.out.print("Enter number of cities: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter city " + (i + 1) + ": ");
            cities.add(sc.nextLine());
        }

        System.out.println("\nCities in the list:");
        for (String city : cities) {
            System.out.println(city);
        }

        cities.clear();
        System.out.println("\nAll cities removed. List size: " + cities.size());
    }
}
