import java.util.Scanner;
public class SwitchExam1{
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		char op=scan.next().charAt(0);
		int b = scan.nextInt();
	
		/*
		if( op == '+') System.out.println(a + "+" + b + "=" +(a+b));
		else if( op == '-') System.out.println(a + "-" + b + "=" +(a-b));
		else if( op == '*') System.out.println(a + "*" + b + "=" +(a*b));
		else if( op == '/') System.out.println(a + "/" + b + "=" +(a/b));
		else if( op == '%') System.out.println(a + "%" + b + "=" +(a%b));
		else System.out.println("산술연산자가 아닙니다.");	
		*/
	
		switch(op){//정수 문자 문자열
			case '+' : System.out.println(a + "+" + b + "=" +(a+b)); break;
			case '-' : System.out.println(a + "-" + b + "=" +(a-b)); break;
			case '*' : System.out.println(a + "*" + b + "=" +(a*b)); break;
			case '/' : System.out.println(a + "/" + b + "=" +(a/b)); break;
			default : System.out.println("산술연산자가 아닙니다.");
		}
		String c="미림";
		switch(c){
			case "미림" : System.out.println("안녕"); break;
			case "여자" : System.out.println("하세요"); break
		}
}
}