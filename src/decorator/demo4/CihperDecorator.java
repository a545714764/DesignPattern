package decorator.demo4;

public class CihperDecorator implements Cipher {
	private Cipher cipher;
	
	public CihperDecorator(Cipher cipher) {
		// TODO Auto-generated constructor stub
		this.cipher = cipher;
	}
	@Override
	public String encrypt(String plainText) {

		return cipher.encrypt(plainText);
	}

}
