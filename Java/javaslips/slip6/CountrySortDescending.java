import java.util.Scanner;
class CountrySortDescending  {
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size:=");
    int n = sc.nextInt();
    String countries[] = new String[n];
    System.out.println("Enter the countries name:=");
    for(int i=0;i<n;i++){
        countries[i] = sc.next();
    }
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(countries[i].compareTo(countries[j])<0){
                String temp = countries[i];
                countries[i] = countries[j];
                countries[j] = temp;
            }
        }
    }
    System.out.println("Sorted countries in descending order:=");
    for(int i=0;i<n;i++){
        System.out.println(countries[i]);
    }
}
    
}
