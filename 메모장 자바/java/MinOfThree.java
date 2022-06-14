import java.util.Scanner;
public class MinOfThree{
public static void main (String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("첫번째 수를 입력하시오 : ");
	int a = sc.nextInt();
	System.out.print("두번째 수를 입력하시오 : ");
	int b = sc.nextInt();
	System.out.print("세번째 수를 입력하시오 : ");
	int c = sc.nextInt();

	if (a>b){
	{
		if(b>c)
		{
		System.out.println(a +"와 " + b + "와 " + c + "중 제일 작은 수는 " + c + "입니다." );
		}
			else  
			{
			System.out.println(a + "와 " + b + "와 " + c + "중 제일 작은 수는 "+ b +"입니다.");				}
			}
	}
	else
	{
		if(a>c) 
		{
		System.out.println(a+"와 "+b+"와 "+c+ "중 제일 작은 수는 "+c+"입니다.");
		}
			else  
			{
			System.out.println(a + "와 " + b + "와 " + c + "중 제일 작은 수는 "+ a +"입니다.");
			}
	}
	
}
}