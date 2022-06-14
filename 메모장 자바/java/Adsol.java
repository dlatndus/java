import java.util.Scanner;
public class Adsol{
	public static void main (String args[]){

		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int c = abs_no(a);
		System.out.println(c);

	}
	static int abs_no(int b){ //메서드 위에 반환하니까 void 안됨 타입똑같으려고 int
		if(b<0) return -b; //위에  abs_no(a)로 보내기
		else return b;

	}
}
