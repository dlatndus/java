public class For_Test5_1213{
	public static void main (String args[]){
		int sum = 1;
		System.out.print("1+");
		for(int i =2; i<=10; i++){
			sum=sum+(i*i);
			if (i==10) System.out.print("("+i+"*"+i+")");
			else System.out.print("("+i+"*"+i+")"+"+");
		}
		System.out.println("="+sum);
	}
}
	