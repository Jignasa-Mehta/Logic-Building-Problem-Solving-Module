class Example{

	public static void main(String arg[]){
	
	int number=5235,i=0;
	if(number<100) i=10;
	if(number>=100 && number<1000) i=100;
	if(number>=1000 && number<10000) i=1000;
	int sum=0;
	do {
	   sum+=number/i;
	   number=number%i;
	   i=i/10;	
	}
	
	while(i>=1);

	 System.out.println(sum);

}

}

	/*int i = 1;
	for( System.out.println("Hello");i<=5; i++){

		System.out.println("HI");
	}*/


	/* int i=1;
	for(;;){
	if(i<=10){
	System.out.println(i);
	}else break;
	i++;
	}*/