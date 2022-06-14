public class m{
	public static void main(String args[]){;
		int a=1;
		for(int i=1; i<=4; i++){
			for(int j = 1; j<=i; j++)
				if(a==10) System.out.print(a++);
				else System.out.print("0"+a++);
				System.out.println();
		}
	}
}