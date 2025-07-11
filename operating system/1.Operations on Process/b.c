#include<stdio.h>

void swap(int *a,int *b){
	int temp = *a;
	*a = *b;
	*b = temp;
}

void sort(int *arr,int n){
	int i,j;
	for(i=0;i<n-1;i++){
		for(j=0;j<n-i-1;j++){
			if(arr[j]>arr[j+1]){
				swap(&arr[j],&arr[j+1]);
			}
		}
	}
}

void main(){
	int n,i;

	printf("Enter how many array elements you want :- \n");
	scanf("%d",&n);
	
	int arr[n];

	printf("\nEnter %d array elements :- \n",n);
	for(i=0;i<n;i++){
		scanf("%d",&arr[i]);
	}
	
	printf("\nWithout Sorting :- \n\n");
	for(i=0;i<n;i++){
		printf("%d ",arr[i]);
	}
	
	printf("\n\nWith Sorting\n\n");
	sort(arr,n);
	for(i=0;i<n;i++){
		printf("%d ",arr[i]);
	}
	printf("\n");
}


