class Array{

public static void main (String args[]){

int arr1[]={1,2,3,4,5};
int n= arr1.length; int t=0;
for(int i=0;i<n/2;i++){
t=arr1[i];
arr1[i]=arr1[n-1-i];
arr1[n-1-i]=t;
}
for(int j=0;j<arr1.length;j++)
System.out.print(arr1[j]+" ");
}
}