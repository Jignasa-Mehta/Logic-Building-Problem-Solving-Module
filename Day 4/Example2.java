class Array{

public static void main (String args[]){

int array[]= {5,4,3,9,1,7,9};
int min=array[0];
int max=array[0];
for(int a=1;a<=6;a++){
if(min>array[a]){
min=array[a];
}
if (max<array[a]){
max=array[a];
}

}

System.out.println(min);
System.out.println(max);


}

}