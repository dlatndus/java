import java.util.Scanner;
public class For_Test6_1213{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		char a  = sc.next().charAt(0);//C

		//int b = (int)a;

		//int c=1;
		for(int i =1; i<=a-('A'-1)/*67 3*/; i++){//행
		//for(int i ='A'; i<=a; i++){//행
			for(int j = 1; j<=i*2-1; j++)//열
			//for(int j = 1; j<=i*2-1-64; j++)//열
				System.out.print((char)(i+64));//64 = (A-1)
				//System.out.print((char)i)
			System.out.println();
		}
	}
}
	