class Array{

public static void main (String args[]){

int a[]={5,3,7,8,9};
int n=a[0];
int m=a[0];
for(int i=1; i<5;i++){
if(n<a[i]){
m=n;  n=a[i]; 
}
else if(m<a[i]){
m=a[i];
}
}
System.out.println(m);
}

}