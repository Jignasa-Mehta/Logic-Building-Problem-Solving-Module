class Array{

public static void main (String args[]){

int array[]= {5,4,3,9,1,7,9};
// int sum= array[0]+array[1]+array[2]+array[3]+array[4]+array[5]+array[6];
int sum=0;
for(int a=0;a<=6;a++){
sum+=array[a];
}
double average= sum/7.0;
System.out.println(average);


}

}