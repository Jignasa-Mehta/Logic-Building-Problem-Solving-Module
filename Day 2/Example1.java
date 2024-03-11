class Room{

float height;
float width;
float breadth;

Room(float h, float w, float b){
height=h;
width=w;
breadth=b;
}

void volume(){
float volume =height*width*breadth;
System.out.println("volume of room:" +volume);

}

public static void main (String args[]){

Room R = new Room(3.0f, 4.0f, 5.0f);
R.volume();


}

}