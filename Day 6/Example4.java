import java.util.Scanner;

class StringExample{

public static void main (String args[]){

Scanner sc =new Scanner(System.in);
System.out.println("Enter Name: ");
String name=sc.next();
String reverse="";
for(int i=name.length()-1;i>=0;i--){
reverse+=name.charAt(i);
}
System.out.print(reverse);
}
}