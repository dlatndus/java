import java.util.Scanner;
public class n{
	public static void main(String args[]){;
		Scanner s = new Scanner(System.in);
		double a=0.0;
		System.out.print("�� �� �ϱ�?(*, +, &, #) : ");
		char op = s.next().charAt(0);
		System.out.print("1+");
		for(int i=1; i<=100; i++){
			a=a+(1.0/i);
			if(i==100)System.out.print("(1/"+i+")= ");
			else System.out.print("(1/"+i+")+");	
		}
		System.out.println(a);
		System.out.print("������ �ð� : ");
		switch(op) {
			case '*' : System.out.println("�Ӽ�,����"); break;
			case '+': System.out.println("��,ä����"); break;
			case '&' : System.out.println("01-27"); break;
			case '#' : System.out.println("12-03"); break;
		}
	}
}
// 24��C ����