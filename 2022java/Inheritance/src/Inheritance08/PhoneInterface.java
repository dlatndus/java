package Inheritance08;

public interface PhoneInterface {
	final int TIMEOUT = 10000; // ����ʵ� - �빮�ڷ� ǥ��

	void sendCall(); // �߻�޼ҵ�

	void receiveCall(); // �߻�޼ҵ�

	default void printLogo() { // �߻�޼ҵ尡 �ƴ� �Ϲ� �޼ҵ��ε� default�� ���ΰ�� ���� ���� 8�̻�
		System.out.println("** Phone **");

	}

}
