public class BitMoveOp{
public static void main (String args[]){
		byte a=10;
		System.out.println(a>>2); //5 2
		System.out.println(a<<2); //20 40

		byte b=-10;
		System.out.println(b>>2); //-3
		System.out.println(b<<2); //-40
		System.out.println(b>>>2); //-3
	}
}