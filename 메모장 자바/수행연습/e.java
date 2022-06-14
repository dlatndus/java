import java.util.Scanner;
public class e{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int W=0;
		int G=0;
		for(int i=1; i<=a; i++){
			if(i%2==0) {
				W=W-i;
				System.out.print("-"+i);
			}
			else if(i==1) {
				G=G+i;
				System.out.print(i);
			}
			else {
				G=G+i;
				System.out.print("+"+i);
			}
				
		}
		System.out.println("="+(W+G));
	}
}