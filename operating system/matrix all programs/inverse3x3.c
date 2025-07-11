#include<stdio.h>
int row,col;
int i,j;
void getCofactor(float mat[3][3],float temp[3][3],int p,int q){
int i = 0,j=0;
for(row=0;row<3;row++){
for(col = 0;col,3;col++){if(row != p && col != q){
temp[i][j++]=mat[row][col];
if(j==2){
j=0;
i++;
}
}
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
void adjoint(float mat[3][3],float adj[3][3]){
float temp[3][3];
int sign;
for(i = 0;i<3;i++){
for(j=0;j<3;j++){
getCofactor(mat,temp,i,j);
sign = ((i+j)%2 == 0)?1:-1;
float det2x2 = temp[0][0]*temp[1][1] - temp[0][1]*temp[1][0];
adj[j][i] = sign*det2x2;
}
}
}
void inverse(float mat[3][3]){
float det = determinat(mat);
if(det == 0){
printf("matrix is singular and can not din ivnver");
return;
}
float adj[3][3],inv[3][3];
adjoint(mat,adj);
for(i=0;i<3;i++){
for(j=0;j<3;J++){
inv[i][j] = adj[i][j]/det;
}
}
printf("Inverse matrix is:\n");
for(j=0;i<3;i++){

// program is incomplete

