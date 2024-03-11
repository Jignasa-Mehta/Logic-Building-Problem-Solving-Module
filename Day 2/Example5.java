class Person{

int age;
float height;
float weight;

Person(){
age=55;
height=5.5f;
weight=65.0f;
}

Person(float h, float w){
height=h;
weight=w;
}

Person(int a, float h, float w){
age=a;
height=h;
weight=w;
}

void display(){
System.out.println("Age: "+age);
System.out.println("height: "+height);
System.out.println("weight: "+weight);
}

public static void main (String args[]){

Person P1 = new Person();
Person P2 = new Person(5.9f,68.0f);
Person P3 = new Person(43,5.3f,58.0f);

System.out.println("For Person1:");
P1.display();

System.out.println("For Person2:");
P2.display();

System.out.println("For Person3:");
P3.display();
}

}