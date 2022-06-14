import java.util.Scanner;
public class b{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		switch(a){
		case 1 : System.out.println("1월"); break;
		case 2 : System.out.println("2월"); break;
		case 3 : System.out.println("3월"); break;
		case 4 : System.out.println("4월"); break;
		}
	}
}