#include<stdio.h>
int row,col;
int a[10][10],b[10][10];
void print(int a[10][10]);
void multi();

int accept(){
int i,j;

printf("\nEnter the number of row:-");
scanf("%d",&row);
printf("\nEnter the number of columns:-");
scanf("%d",&col);
printf("\nEnter the matrix A:-\n");
for(i=0;i<row;i++){
   for(j=0;j<col;j++){
      printf("\nEnter the a[%d][%d]:-",i,j);
      scanf("%d",&a[i][j]);
  }

}
printf("\nEnter the matrix B:-\n");
for(i=0;i<row;i++){
   for(j=0;j<col;j++){
      printf("\nEnter the a[%d][%d]:-",i,j);
      scanf("%d",&b[i][j]);
  }
}
};


int main(){

accept();
printf("\n Matrix A:-\n");
print(a);
printf("\n Matrix B:-\n");
print(b);
printf("\nMultipication A * B =\n");
multi();
return 0;
}
void print(int a[10][10]){

int i,j;
printf("\nYour Matrix :-\n");
for(i=0;i<row;i++){
   for(j=0;j<col;j++){
      printf("\na[%d][%d]:-%d",i,j,a[i][j]);

   }
}
printf("\n"); 
  
}
void multi(){
int k;
int mul[10][10] = {0};
int i,j;
for(i=0;i<row;i++){
   for(j=0;j<col;j++){
      for(k=0;k<col;k++){
         mul[i][j] += a[i][k] * b[k][j];
         }
       }
}
print(mul);
}


