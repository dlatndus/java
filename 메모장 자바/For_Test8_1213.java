public class For_Test8_1213{
	public static void main (String args[]){

		int count=0;
		for(int i =1; i<=100; i++){
			if((13*i)>100) break; //���....break���� �ȹ���µ�....c������ �����.........�̰� �Ἥ �Ѿ�� ��� �ۿ��� ������ �ȳ���.....����ϴ�....
			if(((13*i)%i)==0) count++;
			System.out.print(13*i+"\t");
		}
		System.out.println();
		System.out.print("���� = "+count+"��");
	}
}