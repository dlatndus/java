public class star_03{
	public static void main (String args[]){
		int j = 0;
		for(int i =1; i<= 5; i++){
			for( j = 1; j <=i; j++)
				System.out.print("\t");
			//System.out.println("");
			for( j = 5; j >=i; j--)
				
				System.out.print("*"+"\t" );
			System.out.println("");
		}
	}
}