import java.util.Scanner;
public class DowhileMax{
	public static void main (String args[]){
		Scanner sc= new Scanner(System.in);
		int max=0;
		int num=0;

		do{
		System.out.print("�Է��Ͻÿ� : ");
		num = sc.nextInt();
		
		if(num>max) max=num;
		}while(num!=0);
		System.out.println("�ִ밪 : "+max);
	}
}