public class Gugudan_1{
	public static void main (String args[]){
		int j = 0;
		int i = 2;
		for(i =2; i<= 9; i++){
			System.out.print(i + "´Ü");
			lineprint(7, '-' );
			for( j =1; j<= 9; j++){
				
				System.out.println(i +"*"+ j +"=" +(i*j));
				}
		 lineprint(10, '=' );
				
				
			}

	}
	static void lineprint ( int d, char c ) {
		for(int a=1; a<=d; a++)
			System.out.print(c);
			System.out.println();
	}
}

