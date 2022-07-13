package ch10;

public class MyException extends Exception {
	private static final long serialVersionUID = 1L;
	public MyException(String msg) {
		super(msg);
	}
	public static void main(String[] args) throws MyException {
		throw new MyException("대박");
	}

}
