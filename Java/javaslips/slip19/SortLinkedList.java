import java.util.*;

public class SortLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of integers: ");
        int n = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (!list.contains(num)) { // avoid duplicates
                list.add(num);
            }
        }

        Collections.sort(list); // sort the list

        System.out.println("\nSorted numbers (no duplicates):");
        for (int num : list) {
            System.out.println(num);
        }
    }
}
