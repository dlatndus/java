package TextInheritance10;

public class ShapeTest extends ShapeExam{
	//�߻�Ŭ����(ShapeExam)�� ��� �޾ұ� ������ ShapeExamŬ������ �ִ� ��� �߻�޼ҵ带 
	//����(ShapeTest)���� �����ؾ� �Ѵ�
	@Override	
	public double getArea (double r) {
		return 3.14* r* r;
	}
	@Override	
	public double getCircum (double r) {
		return 3.14* r* 2;
	}
}