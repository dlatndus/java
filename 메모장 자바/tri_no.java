import java.util.Scanner;
public class tri_no{
	public static void main(String arags[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("행을 입력하세요 : ");
		int row=sc.nextInt();//row+1
	
		for(int i =row; i>=0; i--){//3 2
			for(int j=i; j>=0; j--)//3 2
				System.out.print(i*j+"\t");
			System.out.println();
		}
	}
}