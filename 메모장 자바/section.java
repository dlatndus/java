public class section{
	public static void main(String arags[]){
		
		int j=0;
		for (j=5; j<=50; j+=5){
			System.out.println("1 ~ "+j+" --> " + sumf(j));
			}
	}
	static int sumf(int s){
		int sum=0;
		for(int i =1; i<=s; i++) sum+=i;
		return sum;
	}

	
}