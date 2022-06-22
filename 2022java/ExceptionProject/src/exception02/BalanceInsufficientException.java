package exception02;

//사용자 예외를 저의 할 때 Exception클레스를 상속
public class BalanceInsufficientException extends Exception{
	public BalanceInsufficientException() {}
	public BalanceInsufficientException(String message) {
		super(message);
	}


}
