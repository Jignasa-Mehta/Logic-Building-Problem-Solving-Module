import java.util.Scanner;

class Array{

public static void main (String args[]){

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
int t=0;
for(int i=0;i<n;i++){
t=2*(i-1);
if(t%3==0){
sum+=i;
}
}

System.out.println(sum);


}

}