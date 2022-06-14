public class h{
	public static void main(String args[]){
		
	int j = 0;
		for(int i =1; i<= 5; i++){

			for(j=1; j<=5-i; j++)
				System.out.print("  ");

			for(j=1; j<=2*i-1; j++)
				System.out.print("* " );
			System.out.println();

			}

		
	}
}