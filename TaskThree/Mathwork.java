import java.util.Random;
class MathWork{

	int[] array = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };
	

	int getRandom(){
	return array[new Random().nextInt(array.length)]; 	
	}


	public static int recursion(int num){
	
	if(num > 0){
		return num-1;
	}
	return 0;

	
}

	void divisible(int tal){
		for(int i=0; i<100; i = i+tal){
			if(i%tal == 0){
			
			System.out.println("Divisible: "+i);
			}
			
		}
	}
	
}