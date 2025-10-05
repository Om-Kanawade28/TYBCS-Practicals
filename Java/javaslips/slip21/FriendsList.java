
import java.util.*;
public class FriendsList {
    public static void main(String args[]){
        LinkedList friends = new LinkedList();
        System.out.println("ENter no of Students:=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
         friends.add(sc.nextLine());
        }
        System.out.println(friends);
    }
}
