#include<stdio.h>
int main(){
int row,col;
int a[10][10];
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
printf("\nYour Matrix:-\n");
for(i=0;i<row;i++){
   for(j=0;j<col;j++){
      printf("\na[%d][%d]:-%d",i,j,a[i][j]);

   }
printf("\n");
return 0;
}
