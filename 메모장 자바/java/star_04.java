public class star_04{
	public static void main (String args[]){
		int j = 0;
		for(int i =1; i<= 5; i++){

			for(j=1; j<=5-i; j++)
				System.out.print("  ");

			for(j=1; j<=2*i-1; j++)
				System.out.print("* " );
			System.out.println();

			}

			
			/*
			for(j=1; j<=5-i; j++)
				System.out.print("    ");

			for(j=1; j<=2*i-1; j++)
				System.out.print("* " );
			System.out.println();

			}
			//for( j = 5; j <=i; j++)
			//	System.out.print("\t");
			

			for( j = 1; j >=5; j++)
				//for(j=4; j <=i; j++)
				//System.out.print("w");
			System.out.println(" o");

			//for( j = 1; j <=i; j++)
				
			//	System.out.print("* " );
			//System.out.println("");
*/
		
	}
}