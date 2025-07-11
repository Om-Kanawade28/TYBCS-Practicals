#include<stdio.h>
int row,col,i,j;
float a[3][3 ];

void accept();
float determinate(float a[3][3]);
void print(float a[3][3]){
int i,j;
printf("\nYour Matrix:-\n");
for(i=0;i<3;i++){
   for(j=0;j<3;j++){
      printf("\na[%d][%d]:-%0.2f",i,j,a[i][j]);

   }
printf("\n");
}
}
void accept(){
int i,j;

printf("\nEnter the matrix:-\n");
for(i=0;i<3;i++){
   for(j=0;j<3;j++){
      printf("\nEnter the a[%d][%d]:-",i,j);
      scanf("%f",&a[i][j]);
  }
}
}
float determinate(float a[3][3]){

float det;
float temp[2][2];
for(i=0;i<3;i++){
   float submat[2][2];
   int subi=0;
   for(row=1;row<3;row++){
       int subj = 0;
       for(col=0;col<3;col++){
          if(col != i){
              submat[subi][subj++] = a[row][col];
              }
      }
      subi++;
 }
 det += (i%2==0?1:-1)*a[0][i]*(submat[0][0]*submat[1][1]-submat[0][1]*submat[1][0]);
    }
   return det;
}
int main(){
accept();
print(a);
float det;

det = determinate(a);
printf("\ndetermionate of the 3x3 matrix:-%f\n",det);
return 0;
}
