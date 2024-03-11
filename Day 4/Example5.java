class Array{

public static void main (String args[]){

int matrix1[][]={{1,2},{3,4}};
int matrix2[][]={{1,2},{3,4}};
boolean b=true;

for(int i=0; i<=1;i++){
for(int j=0; j<=1;j++){
if(matrix1[i][j] != matrix2[i][j]){
b=false; 
}
}
}
if(b=true){
System.out.println("matrices are equal");
}
else{ 
System.out.println("matrices are not equal");
}

}

}