import java.util.Scanner;
public class d{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int W=0;
		int G=0;
		for(int i=1; i<=a; i++) {
			if(i%2==0) W=W+i;
			else G=G+i;
		}
		System.out.println(W);
		System.out.println(G);
	}
}