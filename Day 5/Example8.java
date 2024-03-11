class Array{

public static void main (String args[]){

int arr1[]={1,2,2,3,4,4,5};
int arr2[]=new int[7];
int a1=0, a2=0,ind=0;  boolean isPresent=false;
for(int i=0;i<=6;i++){
isPresent=false;
a1=arr1[i];
for(int k=0;k<=6;k++){
a2=arr2[k];
if(a1==a2){
isPresent=true; break;
}
}
if(!isPresent) { arr2[ind]=a1;  ind++; }
}

for(int i=0;i<7;i++)
System.out.print(arr2[i]+" ");
}
}