package Array;

public class Array_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int a, b, c, d, e;
		a=1;
		b=2;
		c=3;
		d=4;
		e=5;
		int sum = a+b+c+d+e;
		System.out.println(a+" ");
		System.out.println(b+" ");
		System.out.println(c+" ");
		System.out.println(d+" ");
		System.out.println(e+" ");*/
		
		int[] a; // int a[]; //int[] a= new int[100]; C랑 헷갈리는거 주의
		a=new int[100];
		
		System.out.println(a.length);
		
		//int[] a=new int[5];
		//int[] a=new int[] {1, 2, 3, 4, 5}; //초기값 바로주깅
		//int[] a= {1, 2, 3, 4, 5}; //가.능
		
		int sum=1;
		for(int i=0; i<a.length; i++) a[i]=i+1;
		for(int i=0; i<100; i++) {
			sum*=i+1;
			System.out.println(sum);
		}
		for(int i=0; i<100; i++) System.out.println(a[i]+" ");
		
	}

}
