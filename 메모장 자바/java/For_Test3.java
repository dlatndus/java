public class For_Test3{
	public static void main (String args[]){
		
			double a=0.0;
			System.out.print("1 + ");

		for(int i=1; i<=100; i++){
			a=a+((double)1/i);
			if(i==100)System.out.print("(1/" + i + ")");
		 	else System.out.print("(1/" + i + ") + ");
			
			
		}
		System.out.print(" = "+a);	
	}
}