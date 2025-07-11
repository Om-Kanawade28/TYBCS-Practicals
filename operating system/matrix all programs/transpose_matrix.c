#include<stdio.h>
int row,col;
int a[10][10];
void accept();
void transpose(int a[10][10]);
void print(int a[10][10]){
int i,j;
printf("\nYour Matrix:-\n");
for(i=0;i<row;i++){
   for(j=0;j<col;j++){
      printf("\na[%d][%d]:-%d",i,j,a[i][j]);

   }
printf("\n");
}
}
void accept(){
int i,j;

printf("\nEnter the number of row:-");
scanf("%d",&row);
printf("\nEnter the number of columns:-");
scanf("%d",&col);
printf("\nEnter the matrix:-\n");
for(i=0;i<row;i++){
   for(j=0;j<col;j++){
      printf("\nEnter the a[%d][%d]:-",i,j);
      scanf("%d",&a[i][j]);
  }
}
}
void transpose(int a[10][10]){
int i,j;
printf("\nYour Transpose Matrix:-\n");
for(i=0;i<row;i++){
   for(j=0;j<col;j++){
      printf("\na[%d][%d]:-%d",i,j,a[j][i]);

   }
printf("\n");
}
}
int main(){
accept();
print(a);
printf("Transpose Matrix:-");
transpose(a);


return 0;
}
