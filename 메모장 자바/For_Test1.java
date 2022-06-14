public class For_Test1{
	public static void main (String args[]){
		
		int sum=1;
		int i;
		for(i =1; i<= 100; i++){
			if (i%10==1)
				System.out.println();
				if (i%10==3)
					System.out.print("X"+"\t");

				else if (i%10==6)
					System.out.print("X"+"\t");
		
				else if (i%10==9)
					System.out.print("X"+"\t");

				else System.out.print(i+"\t");	
		}		
	}
}