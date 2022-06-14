public class Summer1213_6{
	public static void main(String args[]){
		int l = 6;
		int j=1;
		for(int i=1; i<=5; i++){
			for(j=1; j<=i; j++)
				System.out.print(" ");
					for(l=6; l>=j; l--)
					if(l==5 && i==3) System.out.print("¡Ú ");
					else System.out.print("* ");
			System.out.println();
		}
		
	}
}