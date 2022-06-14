package Inheritance02;

public class Student extends Person {
	public void set() {
		age = 30;
		name = ": ȫ�浿";
		height = 175;
		//weight = 99;
		setWeight(99);
		System.out.printf("age = %d name %s height = %d weight = %d", age, name, height, getWeight());
	}
}
