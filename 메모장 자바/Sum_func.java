import java.util.Scanner;
public class Sum_func{
	public static void main (String args[]){

		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int c = sum(a);
		System.out.println(c);

	}
	static int sum(int b){ //¸Þ¼­µå
		int i = 1;
		int sum=0;
		for (i=1; i<=b; i++)
			sum +=i;
		return sum;
	}
}
