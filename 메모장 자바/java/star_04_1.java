public class star_04_1{
	public static void main (String args[]){
		int j = 0;
		for(int i =5; i>= 1; i--){

			for(j=5-i; j>=1; j--)
				System.out.print("  ");

			for(j=2*i-1; j>=1; j--)
				System.out.print("* " );
			System.out.println();

			}

		
	}
}