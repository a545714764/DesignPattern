package adapter.demo4;

public class NewCipherAdapter extends DataOperation {
	private NewCipher cipher;
	
	public  NewCipherAdapter() {
		// TODO Auto-generated constructor stub
		cipher = new NewCipher();
	}
	@Override
	public String doEncrypt(int key, String ps) {

		return cipher.doEncrypt(key, ps);
	}

}
