class Array{

public static void main (String args[]){

int arr1[]={1,2,3,4,5};
int arr2[]={3,4,5,6,7};
int arr3[]=new int[5];
int a1=0, a2=0, ind=0;
for(int i=0;i<=4;i++){
a1=arr1[i];
for(int j=0;j<=4;j++){
a2=arr2[j];
if(a1==a2){
arr3[ind]=a1;
ind++;
}
}

}
for(int k=0;k<=4;k++)
System.out.print(arr3[k]+" ");
}
}