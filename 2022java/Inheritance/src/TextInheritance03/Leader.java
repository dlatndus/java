package TextInheritance03;

public class Leader extends Student{
	boolean boss;
	String trueleader = "�б�ȸ��";
	String falseleader = "���б�ȸ��";
	
	public Leader(String name, String hakbun, boolean boss) {
		super(name, hakbun);
		this.boss = boss;
	}
	
	void isLeader() {
		if(boss) {
			System.out.println(name + "�� �б�ȸ���̴�");
		}
		else
			System.out.println(name + "�� �б�ȸ���� �ƴϴ�");
		
	}
}
