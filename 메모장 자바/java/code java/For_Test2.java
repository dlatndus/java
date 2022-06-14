public class For_Test2{
	public static void main (String args[]){
		
		int l=1;
		for(int i=1; i<=4; i++){
			for(int j=1; j<=i; j++)
				if(l==10)  System.out.print(l);
				else System.out.print("0"+l++);
		 System.out.println();
		}
			
	}
}