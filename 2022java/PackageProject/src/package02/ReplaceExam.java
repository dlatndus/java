package package02;

public class ReplaceExam {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("java Programming");
		StringBuffer sb11 = new StringBuffer("java Programming");
		StringBuffer sb2 = null;
		StringBuffer sb3 = null;
		
		//start(0)���ڿ��� �����Ͽ� end-1(4-1) ���� �� ���ڿ��� JAVA�� ġȯ
		sb2 = sb1.replace(0, 4, "JAVA");
		System.out.println("sb2 => "+sb2);
		
		//start(0)���ڿ��� �����Ͽ� end-1(3-1) ���� �� ���ڿ��� JAVA�� ġȯ
		//���� jav=>JAVA�� ����
		sb3 = sb11.replace(0, 3, "JAVA");
		System.out.println("sb3 => "+sb3);
	}
}
