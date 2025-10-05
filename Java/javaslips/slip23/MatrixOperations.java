import java.util.*;
public class MatrixOperations {
    public static void main(String args[]){
        System.out.println("ENter the no of row:=");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("ENter the no of column:=");
        int c = sc.nextInt();
        int matrix1[][] = new int[r][c];
        int matrix2[][] = new int[r][c];
        System.out.println("Enter the elements of matrix1:=");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of matrix2:=");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }
        
        //menu derive add,multi,trans exit
       while(true){
        System.out.println("Menu:");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Transpose");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                int sum[][] = new int[r][c];
                System.out.println("Sum of matrices:");
                for(int i=0; i<r; i++){
                    for(int j=0; j<c; j++){
                        sum[i][j] = matrix1[i][j] + matrix2[i][j];
                        
                   }
                  
                }
                for(int i=0; i<r; i++){
                    for(int j=0; j<c; j++){
                        System.out.print(sum[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                int multi[][] = new int[r][c];
                for(int i=0; i<r; i++){
                    for(int j=0; j<c; j++){
                        multi[i][j] = 0;
                        for(int k=0; k<c; k++){
                            multi[i][j] += matrix1[i][k] * matrix2[k][j];
                        }
                    }
                }
                System.out.println("Product of matrices:");
                for(int i=0; i<r; i++){
                    for(int j=0; j<c; j++){
                        System.out.print(multi[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                int transpose[][] = new int[c][r];
                for(int i=0; i<r; i++){
                    for(int j=0; j<c; j++){
                        transpose[j][i] = matrix1[i][j];
                    }
                }
                System.out.println("Transpose of matrix1:");
                for(int i=0; i<c; i++){
                    for(int j=0; j<r; j++){
                        System.out.print(transpose[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.out.println("Exiting...");
                sc.close();
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
        

       }
        
    }
}
