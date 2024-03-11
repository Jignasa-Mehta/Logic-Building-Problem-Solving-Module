class Student{

String name;
int sub1;
int sub2;
int sub3;

Student(String n, int s1, int s2, int s3){
name=n;
sub1=s1;
sub2=s2;
sub3=s3;
}

void average(){
float average =(sub1+sub2+sub3)/3;
System.out.println("Average:" +average);
}

void display(){
int total= sub1+sub2+sub3;
System.out.println("Name:" +name);
System.out.println("Total Marks:" +total);
}

public static void main (String args[]){

Student S = new Student("Jignasa",96,88,91);
S.display();
S.average();

}

}