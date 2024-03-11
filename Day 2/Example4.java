class Vehicle{

String model;
String price;
String color;

Vehicle(String m, String p, String c){
model=m;
price=p;
color=c;
}

void display(){
System.out.println("Model: " +model);
System.out.println("Price: " +price);
System.out.println("color: " +color);
}

public static void main (String args[]){

Vehicle V = new Vehicle("Creta", "15 lakh", "Black");
V.display();


}

}