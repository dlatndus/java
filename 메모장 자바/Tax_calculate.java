import java.util.Scanner;
public class Tax_calculate{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("�ٷμҵ� �Է�(����) : ");
		int salary = sc.nextInt();
		
		int a;
		if (salary<=2000) a=((int)(salary *0.05));
		else if(2000<salary && salary<=4000) a=((int)(salary *0.15));
		else if(4000<salary && salary<=8000) a=((int)(salary *0.25));
		else a=((int)(salary *0.4));
			
		System.out.println("�ҵ漼 : "+a+"����");

	}
}