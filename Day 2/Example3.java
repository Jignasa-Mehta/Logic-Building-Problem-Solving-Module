class Box{

float height;
float width;
float breadth;

Box(float h, float w, float b){
height=h;
width=w;
breadth=b;
}

void getVolume(){
float volume =height*width*breadth;
System.out.println("volume of Box:" +volume);
}

void getArea(){
float area =2*(height+width+breadth);
System.out.println("Surface Area of Box:" +area);
}

public static void main (String args[]){

Box B1 = new Box(3.0f, 4.0f, 5.0f);
Box B2 = new Box(6.0f, 7.0f, 8.0f);

System.out.println("For Box1:");
B1.getVolume();
B1.getArea();

System.out.println("For Box2:");
B2.getVolume();
B2.getArea();


}

}