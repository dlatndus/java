import java.util.Scanner;
public class f{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int sum=0;
;
		for(int i=1; i<=a; i++){
			if(i==1){
				System.out.print(i);
				sum=sum+i;
			}
			else {System.out.print("+"+i);
				sum=sum+i;
			}	
		}
		System.out.println("="+sum);
	}
}