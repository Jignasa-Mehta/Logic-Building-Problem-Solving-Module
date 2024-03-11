class Example{

	public static void main(String arg[]){
	
	int number=3,fact=1;
	int i=0;
	while(i<=number-1) {
	fact *= number-i;
	i ++;
}
	System.out.println(fact);

}

}