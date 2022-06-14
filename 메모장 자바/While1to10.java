public class Whilesum1to10{
	public static void main (String args[]){
		int i = 1, sum = 0;
		System.out.print("1+2+3+4+5+6+7+8+9+10 = ");
		while(i<=10){
			sum +=i;
			i++;
		}
		System.out.print(sum);
	}
}