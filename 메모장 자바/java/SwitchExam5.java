public class SwitchExam5{
	public static void main(String args[]){
		int a = Integer.parseInt(args[0]);
		String b;
		
		if(a>=1 && a<=6){
		switch(a){
		case 1 : case 2 :
			b ="���̵�����Ʈ�����"; break;
		case 3 : case 4 :
			b ="���̵�����ַ�ǰ�"; break;
	
		default : b ="���̵������ΰ�";
		}
		System.out.println(b);
		}
		else System.out.println("�����꿩");
	}
}