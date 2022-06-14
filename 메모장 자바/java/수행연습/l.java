public class l{
	public static void main(String args[]){;
	
		for(int i=1; i<=100; i++){
			if(i%10==1) System.out.println(" ");
				if(i%10==3) System.out.print("X"+" ");
				else if(i%10==6) System.out.print("X"+" ");
				else if(i%10==9) System.out.print("X"+" ");
				else System.out.print(i+" ");
		}
	}
}