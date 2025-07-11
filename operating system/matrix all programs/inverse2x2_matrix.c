#include<stdio.h>

float a[2][2];
float inv[2][2];
void accept();
void inverse(float a[2][2]);
void print(float a[2][2]){
int i,j;
printf("\nYour Matrix:-\n");
for(i=0;i<2;i++){
   for(j=0;j<2;j++){
      printf("\na[%d][%d]:-%0.2f",i,j,a[i][j]);

   }
printf("\n");
}
}
void accept(){
int i,j;

printf("\nEnter the matrix:-\n");
for(i=0;i<2;i++){
   for(j=0;j<2;j++){
      printf("\nEnter the a[%d][%d]:-",i,j);
      scanf("%f",&a[i][j]);
  }
}
}
void inverse(float a[2][2]){
int i,j;
float det;
det = a[0][0]*a[1][1] - a[0][1]*a[1][0];
if(det == 0){
printf("inverse not exist");
}
else{printf("\nYour Inverse Matrix:-\n");
inv[0][0] = a[1][1]/det;
inv[0][1] = -a[0][1]/det;
inv[1][0] = -a[1][0]/det;
inv[1][1] = a[0][0]/det;
}

}
int main(){
accept();
print(a);

inverse(a);
print(inv);


return 0;
}
